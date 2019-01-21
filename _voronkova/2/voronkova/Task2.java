package voronkova;

public class Task2 {
    public  static void main(String[] args) {
        if (args.length != 0) {
            int[] numberArray = new int[args.length];
            int sum = 0;
            boolean largeValue = false;
            for (int i = 0; i < args.length; i++) {
                try {
                numberArray[i] = Integer.valueOf(args[i]);
                } catch (NumberFormatException e) {
                System.out.println("You should enter integers. Please, change this value: " + args[i]);
                return;
                }
                sum += numberArray[i];
                if (numberArray[i] > 1000) {
                largeValue = true;
                }
            }
            System.out.println("The array sum is " + sum);
            if (largeValue) {
                System.out.println("The array is massive.");
            }
        }
        else{
            System.out.println("Please enter several integers.");
        }
    }
}
