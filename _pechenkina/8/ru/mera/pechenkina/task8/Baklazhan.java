package ru.mera.pechenkina.task8;


public class Baklazhan implements Vegetables {

	public String name = "Baklazhan"; 
	public Integer count;
	
	
	/**
	 * @param name
	 */
	public Baklazhan(String name, Integer count) {
		super();
		this.name = "Baklazhan";
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString(){
		return "Vegetable name " + name;
		
	}

}
