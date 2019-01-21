package _romazanova.2;

public class MaxValueInArray {

	public static void main(String[] args) {
		int [] massiveArray = new int[args.length];
		for (int i =0; i < args.length; i++){
			massiveArray[i] = Integer.parseInt(args[i]);
		}
		int maxValue = massiveArray[0];
		for (int i:massiveArray){
			if ( i !=100500 & i>maxValue ){
				maxValue = i;
			}
		}
		System.out.println("Max value in array is: " + maxValue);
	}

}
