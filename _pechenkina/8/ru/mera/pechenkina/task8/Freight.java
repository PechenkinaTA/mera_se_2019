package ru.mera.pechenkina.task8;

import java.util.ArrayList;
import java.util.List;

public class Freight {
	
	public static List<Fruits> fruiteCar = new ArrayList<>(10);
	public static List<Vegetables> vegetableCar = new ArrayList<>(10);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Freight cargoTransportation = new Freight();
		
		//fruiteCar.add(new Bananas("Banana",1));
		//fruiteCar.add(new Grusha("Grusha",1));
		//vegetableCar.add(new Tomato("Tomato", 1));
		//vegetableCar.add(new Baklazhan("Baklazhan", 1));
		
		
		Fruits ban = new Bananas("banana", 1);
		ban.addFruiteTocar(fruiteCar, ban, ban.getCount());
		Fruits grush = new Grusha("Grusha", 9);
		grush.addFruiteTocar(fruiteCar, grush, grush.getCount());
		

		Vegetables tom = new Tomato("Tomato",5);
		tom.addvegetableTocar(vegetableCar, tom, tom.getCount());
		Vegetables baklazhan = new Baklazhan("Baklazhan", 6);
		baklazhan.addvegetableTocar(vegetableCar, baklazhan, baklazhan.getCount());
		
		Shop shop = new Shop();
		shop.printCargoInShop(fruiteCar);
		shop.printCargoInShop(vegetableCar);
		
	}

}
