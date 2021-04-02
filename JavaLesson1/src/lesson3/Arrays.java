package lesson3;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("1.Create an array and fill it with 2 number");
        int[] arr = {2, 2, 2};
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        System.out.println("\n2.Create an array and fill it with numbers from 1:1000");
        int[] arrNum = new int[1000];
        for (int j = 0; j < arrNum.length; j++) {
            arrNum[j] = j+1;
            System.out.println(j + " " + arrNum[j]);
        }
        System.out.println("\n3.Create an array and fill it with odd numbers from -20:20");
        int[] odd_arr = new int[20];
        for (int i = 0, m = -19; i < odd_arr.length; i++, m += 2) {
            odd_arr[i] = m;
            System.out.println(odd_arr[i]);
        }
        System.out.println("\n4.Create an array and fill it. Print all elements which can be divided by 5");
        int[] divArr = {2, 5, 7, 15, 25, 55, 30, 9, 10};
        for (int n = 0; n < divArr.length; n++) {
            if (divArr[n] % 5 == 0)
                System.out.println(divArr[n]);
        }
        System.out.println("\nCreate an array and fill it. Print all elements which are between 24.12 and 467.23");
        float[] array = new float[500];
        float number = 0;
        for (int i = 0; i < array.length; i++) {
            number++;
            array[i] = number;
            if (array[i] >= 24.12 && array[i] <= 467.23)
                System.out.println(array[i]);
        }
        System.out.println("\nCreate an array and fill it. Print count of elements which can be divided by 2");
        int[] pair_arr = {2, 5, 3, 24, 56, 78, 24, 12, 36, 40};
        int count = 0;
        for (int m = 0; m < pair_arr.length; m++) {
            if (pair_arr[m] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\n 7 .Given an integer, 0< N < 21 , print its first 10 multiples. \n" +
                "Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.\n");
        int N = 2;
        if (N > 0 && N < 21) {
            for (int i = 1; i <= 10; i++) {
                int result = N * i;
                String value = N + "x" + i + " = " + result;
                System.out.println(value);
            }
        } else
            System.out.println("////////it isn't in my range ///////////");

    }
}
