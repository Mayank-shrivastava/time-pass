package Practice;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] intArr = new int[10]; // single dimensional array
        System.out.println(Arrays.toString(intArr));

        int[][] multiIntArr = new int[5][5]; // multi-dimensional array
        for (int i = 0; i < multiIntArr.length; i++) {
            System.out.println(Arrays.toString(multiIntArr[i]));
        }

        // array copy
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        System.out.println(Arrays.toString(copyFrom));
        String[] copyTo = new String[copyFrom.length];
        System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
        // arraycopy method to copy data of one array to another array
        System.out.println(Arrays.toString(copyTo));
        // using Arrays copyOfRang(array, startpos, endpost)
        String[] copyDemo = Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(Arrays.toString(copyDemo));

        // printing content of arrays using stream method
        Arrays.stream(copyDemo).map(a -> a + " ").forEach(System.out::println);

    }

}
