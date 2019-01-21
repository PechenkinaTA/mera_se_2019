public class MassiveArrays {
    /**
     * Задача 2.  Массивные массивы
     * 1. Заведите массив на 10 элементов типа int. Можете заполнить его самостоятельно или считать из арументов запуска
     * (в этом случае, массив может быть любоей длины)
     * 2. Посчитайте сумму всех элементов. Выведите её на экран.
     * 3. Если хотя бы одно число в массиве больше 1000 - выведите на экран надпись "Массив - массивный!".
     * Эта надпись должна быть выведна не больше одного раза, даже если чисел больше 1000 - больше одного.
     */

    public static void main (String[] args){
        int[] array = new int[args.length];
        int sum = 0;
        boolean moreThanThousandFound = false;

        for(int i = 0; i<array.length;i++){
            array[i] = Integer.valueOf(args[i]);
            sum += array[i];
            if (!moreThanThousandFound && array[i]>1000){
                System.out.println("Array is massive");
                moreThanThousandFound = true;
            }
        }
        System.out.println("The sum = " + sum);
    }
}
