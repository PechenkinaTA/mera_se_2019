package  ru.mera.pechenkina.task8;


public class Bananas implements Fruits{

	public String name;
	public Integer count;

	public Bananas(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public Bananas(String name, Integer count) {
		super();
		this.name = "Banan";
		this.count = count;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public Integer getCount() {
		return count;
	}

	
	@Override
	public String toString(){
		return "Fruite name " + name;
		
	}
}
