package ru.mera.pechenkina.task8;

import java.util.ArrayList;
import java.util.List;

public class Freight {
	
	public static List<Fruits> fruiteCar = new ArrayList<>(10);
	public static List<Vegetables> vegetableCar = new ArrayList<>(10);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitsCargo fruiteCargo = new FruitsCargo();
		VegetableCargo vegetableCargo = new VegetableCargo();
		Fruits ban = new Bananas("banana", 1);
		fruiteCargo.addFruiteTocar(fruiteCar, ban, ban.getCount());
		Fruits grush = new Grusha("Grusha", 9);
		fruiteCargo.addFruiteTocar(fruiteCar, grush, grush.getCount());


		Vegetables tom = new Tomato("Tomato",5);
		vegetableCargo.addvegetableTocar(vegetableCar, tom, tom.getCount());
		Vegetables baklazhan = new Baklazhan("Baklazhan", 3);
		vegetableCargo.addvegetableTocar(vegetableCar, baklazhan, baklazhan.getCount());
		
		Shop shop = new Shop();
		shop.printCargoInShop(fruiteCar);
		shop.printCargoInShop(vegetableCar);
		
	}

}
