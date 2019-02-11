package ru.mera.pechenkina.task8;

import java.util.List;

public class VegetableCargo {

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
}
