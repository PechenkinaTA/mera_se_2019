package voronkova;

public class Task1 {
    public static void main(String[] args) {
        if (args.length == 2) {
            int firstVariable;
            int secondVariable;
            try{
                firstVariable = Integer.valueOf(args[0]);
                secondVariable = Integer.valueOf(args[1]);
            } catch (NumberFormatException wrongValue){
                System.out.println("Error: " + wrongValue + ". Please enter two integers.");
                return;
            }
            if (firstVariable > 100 || secondVariable > 100) System.out.println("There is a large number.");
            if (secondVariable != 0)
                System.out.println("The result of a division: " + (double) firstVariable / secondVariable);
            if (firstVariable > secondVariable)
                System.out.println(String.format("%s more than %s", firstVariable, secondVariable));
            if (secondVariable % 2 == 0) System.out.println(String.format("Number %s is even.", secondVariable));
            }
        else {
            System.out.println("Please enter two integers.");
        }
    }
}
