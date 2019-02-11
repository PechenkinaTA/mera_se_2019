package ru.mera.pechenkina.task8;

public class Tomato implements Vegetables {
	
	public String name = "Tomato";
    public Integer count;
	
	/**
	 * @param name
	 */
	public Tomato(String name, Integer count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public Integer getCount() {
		return count;
	}
	
	@Override
	public String toString(){
		return "Vegetable name " + name;
		
	}


}
