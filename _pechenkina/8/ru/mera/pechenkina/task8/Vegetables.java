package ru.mera.pechenkina.task8;

import java.util.List;

public interface Vegetables extends Plants {
	
	public List<Vegetables> addvegetableTocar(List<Vegetables> vegetableCar, Vegetables vegetable, Integer count);
	@Override
	String toString();
	Integer getCount();

}
