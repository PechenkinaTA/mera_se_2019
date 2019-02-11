package ru.mera.pechenkina.task8;

public class Grusha implements Fruits{

	public String name = "Grusha";
	public Integer count;
	
	
	/**
	 * @param name
	 */
	public Grusha(String name,Integer count) {
		super();
		this.name = "Grusha";
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
		return "Fruite name " + name;
		
	}

}
