import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[args.length];
        boolean mark = false;

        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.valueOf(args[i]);
            if (array[i] > 1000) {
                mark = true;
            }
        }

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Sum = " + arraySum(array));

        if (mark) {
            System.out.println("This is massive array");
        }
    }

    private static int arraySum(int[] array) {
        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }

}
