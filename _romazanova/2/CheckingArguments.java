package _romazanova.2;

public class CheckingArguments {

	public static void main(String[] args) {

		int firstValue = 131;
		int secondValue = 2;
		if ( firstValue > 100 | secondValue > 100){
			System.out.println("There is a big number");
		}
		if (secondValue != 0){
			System.out.println("Result of devision:" + (double)firstValue/secondValue);
		}
		if (firstValue > secondValue){
			System.out.printf("%d more than %d\n", firstValue, secondValue);
		}
		
		if (secondValue%2 == 0 ){
			System.out.printf("%d - четное число", secondValue);
		}
		
	}

}
