package ru.mera.pechenkina.task8;

import java.util.List;

public class Shop {
	
	public <T> void printCargoInShop(List<T> cars) {
		for (int j = 0; j < cars.size(); j++) {
			System.out.println("Cargo get this to the shop " + cars.get(j));
		}
	}


}
