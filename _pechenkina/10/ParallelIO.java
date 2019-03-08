package ru.mera.pechenkina.task10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ParallelIO {

	static final int OUTPUT_STRING_LENGTH = 20;

	public static void main(String[] args) throws IOException {

		List<String> stringArray = new ArrayList<>(10);
		

		// string containing allowed characters, modify according to your needs
		String strAllowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		// initialize Random
		Random random = new Random();

		// create array with 1000 random strings
		for (int i = 0; i <= 999; i++) {
			String stringToBeAdded = getNextRandomString(strAllowedCharacters, random);
			stringArray.add(stringToBeAdded);
		}

		// print array with 1000 strings + add strings to files in parallel mode
		// and check time of execution
		long startTimeOfParallelWritingToFiles = System.nanoTime();

		try {
			for (int i = 0; i < 1000; i++) {
				Runnable runnable = new ParallelFileWriting(stringArray, i);
				Thread thread = new Thread(runnable);
				//String threadName = Thread.currentThread().getName();
				thread.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		long finishTimeOfParallelWritingToFiles = System.nanoTime();
		System.out.println("Speed of parallel writing to files = "
				+ (finishTimeOfParallelWritingToFiles - startTimeOfParallelWritingToFiles));

		
		//read strings Parallel from all files and check time of execution
        long startTimeOfParallelReadingFromFiles = System.nanoTime();
        Integer filesInDir = new File("C:\\Users\\Лисенок\\workspace\\_pechenkinat\\10\\ru\\mera\\pechenkina\\task10\\strings_sequential\\").listFiles().length;
        List<String> stringsParalell = new ArrayList<>(filesInDir);
        //Resource resource = new Resource(stringArray, stringsParalell);
		
        try  {
			for (int i = 0; i < 1000; i++) {
				Runnable runnable = new ParallelFileReadingAndPutingArray(stringArray, i, stringsParalell);
				Thread thread = new Thread(runnable);
				thread.start();
				thread.join();
				
				//Thread t = new Thread(new ParallelFileReadingAndPutingArray(resource,i));
	            //t.start();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

        
        long finishTimeOfParallelReadingFromFiles = System.nanoTime();
        System.out.println("Speed of reading from files = " + (finishTimeOfParallelReadingFromFiles - startTimeOfParallelReadingFromFiles));
        
        
      //print stringsSequential array taken from all files
	  //printStringsArray(stringsParalell);  
	}
	
	public static void printStringsArray(List<String> arrayToBePrinted) {
    	for (int i=0; i <= arrayToBePrinted.size()-1; i++) {
        	System.out.println("step = " + i);
        	System.out.println("Elements in arrayToBePrinted array: " + arrayToBePrinted.get(i));
        }
    	
    }

	private static String getNextRandomString(String strAllowedCharacters, Random random) {

		StringBuilder sbRandomString = new StringBuilder(OUTPUT_STRING_LENGTH);

		for (int i = 0; i < OUTPUT_STRING_LENGTH; i++) {

			// get random integer between 0 and string length
			int randomInt = random.nextInt(strAllowedCharacters.length());

			// get char from randomInt index from string and append in
			// StringBuilder
			sbRandomString.append(strAllowedCharacters.charAt(randomInt));
		}

		return sbRandomString.toString();

	}

}
