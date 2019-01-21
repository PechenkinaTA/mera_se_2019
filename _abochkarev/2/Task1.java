public class Task1 {

    public static void main(String[] args) {
        int firstValue = Integer.valueOf(args[0]);
        int secondValue = Integer.valueOf(args[1]);

        if (firstValue > 100 || secondValue > 100) {
            System.out.println("There are a large number");
        }

        if (secondValue != 0) {
            System.out.println("Division result: " + (firstValue / (secondValue * 1.0)));
        }

        if (firstValue > secondValue) {
            System.out.println(firstValue + " more then " + secondValue);
        }

        if (secondValue % 2 == 0) {
            System.out.println("number " + secondValue + " is even");
        }
    }
}
