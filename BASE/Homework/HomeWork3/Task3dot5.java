package BASE.Homework.HomeWork3;

import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:33.
 * To change this template use File|Settings|File Templates.
 * <p/>
 * !! Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 * 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 * b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class Task3dot5 {

    public static void ArrayChangeLine(int sizeline,int sizecolume) {
        int[][] arr = new int[sizeline][sizeline];
        int[] sum = new int[sizeline];
        int max = 0;
        int min = 0;
        int MaxIndexLine = 0;
        int MinIndexLine = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (1 + Math.random() * 100);

                sum[i] = arr[i][j] + sum[i];



            }

        }
        System.out.println();


        for (int i = 0; i < sum.length; i++) {


            if (max < sum[i]) {

                max = sum[i];

                MaxIndexLine = i;
            }
            if(sum[i]< min ){

                min = sum[i];

                MinIndexLine = i;
            }

            }
        System.out.println("Minindex= "+MinIndexLine);
        System.out.println();
        System.out.println("Maxindex= "+MaxIndexLine);
        System.out.println();
        Ex1.printMatrix(arr);
        System.out.println();




            for (int j = 0; j < arr.length; j++) {
                arr[MaxIndexLine][j] = arr[MaxIndexLine][j] + arr[MinIndexLine][j];
                arr[MinIndexLine][j] = arr[MaxIndexLine][j] - arr[MinIndexLine][j];
                arr[MaxIndexLine][j] = arr[MaxIndexLine][j] - arr[MinIndexLine][j];
        }
        Ex1.printMatrix(arr);


    }
}


