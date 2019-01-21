public class Lesson2 {
    public static void main(String[] args) {

        // & | ^
        boolean tr = true;
        boolean fal = false;

        boolean and = tr & fal;
        boolean or = tr | fal;
        boolean xor = tr ^ fal;
        boolean xor2 = tr ^ tr;

        //System.out.println((true & tr) + " " + or + " " + xor + " " + xor2);

        int value;
        if ( tr ) {
            value = 1;
        } else {
            value = 0;
        }
        //System.out.println(value);

        // тернарная
        int x = tr ? 1 : 0;
        //System.out.println(x);

        // короткий цикл вычислений
        boolean tr2 = false && getTrue();
        //System.out.println(tr2);


        /*int i = 0;
        if ( i == 0) {
            System.out.println("Ноль");
        } else if (i == 1) {
            System.out.println("один");
        } else if ( i == 2) {
            System.out.println("Два");
        }

        switch (i) {
        case 0:
            System.out.println("Ноль");
            break;
        case 1:
            System.out.println("один");
            break;
        case 2:
            System.out.println("Два");
            break;
        }
        */

        //varargs

        printStrings("1","b","c","d");
        String[] strs = new String[]{ "1", "b", "c", "d" };
        printStringsArray(strs);
    }

    static void printStringsArray(String[] strs) {
        for (String str : strs) {
            System.out.println(str);
        }
    }


        static void printStrings(String ... strs) {
     /*   for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

        }*/

        for (String str : strs) {
            System.out.println(str);
        }

    }

    static boolean getTrue() {
        System.out.println("Returning true");
        return true;
    }
}