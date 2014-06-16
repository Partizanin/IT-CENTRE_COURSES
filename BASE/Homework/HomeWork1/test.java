package BASE.Homework.HomeWork1;

import BASE.Classwork.ArrayUtils;

/**
 * Created by Partizanin on 16.12.13.
 * узнать последнию цифру
 */

public class test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b =  ArrayUtils.generateArr(10,10);
        Arr(b,2,5);

    }

    public static void Arr(int[] arr, int start, int end) {

        int length = end - start;
        int[] first = arr;
        int[] second = new int[length];

            for (int i = start ; i < end ; i++) {

                second[i - length +1] = arr[i];
            }

            ArrayUtils.printArr(first);

            System.out.println();

            ArrayUtils.printArr(second);

        }


}







