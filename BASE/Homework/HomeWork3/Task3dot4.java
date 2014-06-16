package BASE.Homework.HomeWork3;

import BASE.Classwork.ArrayUtils;
import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:32.
 * To change this template use File|Settings|File Templates.
 *
 !! Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 3.4. Создать массив, который будет состоять из диагонали матрици

 1 3 5
 4 5 7  -  1 5 6
 4 5 6
 */
public class Task3dot4 {

    public  static void ArrDiagonal(int sieze){
        int[][] arr = new int[sieze][sieze];
        int[][] arr1 = new int[arr.length][arr.length];
        int[] arr2 = new int[sieze];

        for(int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr.length;j++){

             arr[i][j] = (int) (1 + Math.random() * 100);
                if (i == j){
                    arr1[i][j] = arr[i][j];
                    arr2[i]= arr[i][j];
                }

            }
        }
        System.out.println("First before :");
        Ex1.printMatrix(arr);
        System.out.println();


        System.out.println("Array after:");
        Ex1.printMatrix(arr1);
        System.out.println();
        ArrayUtils.printArr(arr2);
    }
}
