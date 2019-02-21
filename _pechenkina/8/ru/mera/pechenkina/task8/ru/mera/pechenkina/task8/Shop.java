package ru.mera.pechenkina.task8;

import java.util.List;

public class Shop implements Plants{
	
	public <Plants> void printCargoInShop(List<Plants> cars) {
		for (int j = 0; j < cars.size(); j++) {
			System.out.println("Cargo get this to the shop " + cars.get(j));
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
