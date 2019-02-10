package  ru.mera.pechenkina.task8;

import java.util.List;

public interface Fruits extends Plants {

	List<Fruits> addFruiteTocar(List<Fruits> fruiteCar, Fruits fruite, Integer count);

	@Override
	String toString();

	Integer getCount();

}
