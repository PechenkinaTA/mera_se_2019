package ru.mera.pechenkina.task9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deserilization {

		// "{param1: value1,param2:value}" =>
	// <param1>valu1</param1>,<param2>valu1</param>
	public static class Person {

		@JsonName(jsonName = "firstName")
		public String name;

		@JsonName(jsonName = "lastName")
		public String surname;

		/**
		 * 
		 */
		public Person() {
		}

		@JsonIgnore
		public int hashCode = this.hashCode();

		public Person(@JsonName(jsonName = "firstName") String name, @JsonName(jsonName = "lastName") String surname) {
			this.name = name;
			this.surname = surname;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("Person  %s %s ", name, surname);
		}
		
		
	}

	public static void main(String[] args) throws IllegalAccessException, InstantiationException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Person person = new Person("Vasya", "Pupkin");
		// {name:"Vasya", surname:"Pupkin"}

		String people = serializeToJson(person);
		System.out.println(people);

		Deserilization de = new Deserilization();

		// System.out.println(deserialize);
		Person vasya = de.deserialize(serializeToJson(person), Person.class);

		System.out.println("Object " + vasya);
	}

	private <T> T deserialize(String json, Class<T> clazz) throws IllegalAccessException, InstantiationException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if (json.equals("")) {
			System.out.println("I can not create object.");
			return (T) null;
		}

		
		String[] split1 = { "" };
		String[] split = json.replace("{", "").replace("}", "").split(",");

		Constructor<?> constructors = clazz.getDeclaredConstructors()[1];
		// For constructor with 2 params
		System.out.println("got here?" + constructors);
		//if(constructors.isAnnotationPresent(JsonName.class)) {
			System.out.println("got here?");
			constructors.setAccessible(true);
			int paramnumber = constructors.getParameterCount();
			System.out.println("paramnumber " + paramnumber);
			Parameter[] paramsWithAnnot = constructors.getParameters();
			Annotation[] anotations = constructors.getAnnotations();
			System.out.println("anotations" + Arrays.deepToString(anotations) + "paramsWithAnnot " + paramsWithAnnot.length);
			
			/*JsonName produce = constructors.getAnnotation(JsonName.class);
			 System.out.println("produce " + produce);
			   if (produce != null)
			       System.out.println("produce.jsonName()" + produce.jsonName());*/

			List<String> argValue = new ArrayList<String>();
					for (int i = 0; i < split.length; i++) {
						split1 = split[i].split(":");

						argValue.add(split1[1]);

						String paramname = JsonName.class.getName();
						System.out.println("paramname " + paramname);

					}
							System.out.println(argValue.get(0) + argValue.get(1));
							Object instance1 = constructors.newInstance(argValue.get(0), argValue.get(1));
							 return (T) instance1;
							
		//}
		
	}

	private static String serializeToJson(Object o) throws IllegalAccessException {
		String result = "{";

		Class<?> aClass = o.getClass();
		Field[] fields = aClass.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			String fieldName = field.getName();
			JsonIgnore ignore = field.getAnnotation(JsonIgnore.class);
			if (ignore != null) {
				continue;
			}

			JsonName annotation = field.getAnnotation(JsonName.class);
			if (annotation != null) {
				fieldName = annotation.jsonName();
			}
			result += fieldName + ":" + field.get(o) + ",";
		}

		return result + "}";
	}
}
