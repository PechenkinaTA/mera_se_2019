package ru.mera.pechenkina.task8;

import java.util.List;

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
	public List<Vegetables> addvegetableTocar(List<Vegetables> vegetableCar, Vegetables vegetable, Integer count) {
		// TODO Auto-generated method stub
		Integer numberOfCargoInCar = 0;
		for (int i = 0; i < vegetableCar.size(); i++) {
			 numberOfCargoInCar += vegetableCar.get(i).getCount();
		}
		//System.out.println("number of cargo in car" + numberOfCargoInCar);
		if ((vegetableCar.size() < 10) && ((numberOfCargoInCar + count) <= 10 ) ) { 
			vegetableCar.add(vegetable);
		} else {
			System.out.println("Your Vegetable car is full try to load less or go to the shop");
		}
		return vegetableCar;
	}

	@Override
	public String toString(){
		return "Vegetable name " + name;
		
	}

}
