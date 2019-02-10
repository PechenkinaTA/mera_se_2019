package ru.mera.pechenkina.task8;

import java.util.List;

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
	public List<Fruits> addFruiteTocar(List<Fruits> fruiteCar, Fruits fruite, Integer count) {
		// TODO Auto-generated method stub
		Integer numberOfCargoInCar = 0;
		for (int i = 0; i < fruiteCar.size(); i++) {
			 numberOfCargoInCar += fruiteCar.get(i).getCount();
		}
		//System.out.println("number of cargo in car" + numberOfCargoInCar);
		if ((fruiteCar.size() < 10) && ((numberOfCargoInCar + count) <= 10 ) ) { 
			fruiteCar.add(fruite);
		} else {
			System.out.println("Your Fruite car is full try to load less or go to the shop");
		}
		return fruiteCar;
	}
	
	@Override
	public String toString(){
		return "Fruite name " + name;
		
	}

}
