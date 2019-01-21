import java.util.Arrays;

public class Task3 {

    public static final int NOPE = 100500;

    public static void main(String[] args) {
        int[] array = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.valueOf(args[i]);
        }

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("Max array element: " + maxArrayElement(array));
    }

    private static int maxArrayElement(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > maxElement) {
                if (element == NOPE) continue;
                maxElement = element;
            }
        }
        return maxElement;
    }
}
