public class Task1 {
    /**
    * Этот метод выводит аргументы командной строки в обратном порядке
    * @param args аргументы командной строки
    */
    public static void main(String[] args) {
        String headline = "Command line arguments in reverse order:\r\n";
        System.out.print(headline);
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
