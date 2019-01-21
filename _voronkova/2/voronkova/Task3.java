package voronkova;

public class Task3 {
    public static final int exceptValue = 100500;
    public  static void main(String[] args) {
        if (args.length != 0) {
            int [] numberArray = new int [args.length];
            for (int i = 0; i<args.length; i++){
                try{
                    numberArray[i]=Integer.valueOf(args[i]);
                } catch (NumberFormatException e){
                    System.out.println("You should enter integers. Please, change this value: " + args[i]);
                    return;
                }
            }
            if (numberArray.length == 1 && numberArray[0]==exceptValue){
                System.out.println("Ooops! We decided to ignore this value. Enter several integers again.");
            }
            else{
                System.out.println("Maximum array value is "+maxValue(numberArray));
            }
        }
        else{
            System.out.println("Please enter several integers.");
        }
    }
    private static int maxValue (int [] ints){
        int element = Integer.MIN_VALUE;
        for (int j : ints) {
            if (j > element) {
                if (j == exceptValue) continue;
                element = j;
            }
        }
        return element;
    }
}
