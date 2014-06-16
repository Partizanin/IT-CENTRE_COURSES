package BASE.Homework.HomeWork3;

import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:35.
 * To change this template use File|Settings|File Templates.
 *
 * 3.9. Умножить две матрицы.
 *
 */
public class Task3dot9 {
    public static void main(String[] args) {
        MatrixMultiply(5);
    }


    public static void MatrixMultiply(int size){
        int[][] arr1 = new int[size][size];
        int[][] arr2 = new int[size][size];

        for(int i = 0;i < arr1.length;i++){
            for (int j = 0;j < arr1.length;j++){

             arr1[i][j] = (int) (2 + Math.random() * 10);
             arr2[i][j] = (int) (2 + Math.random() * 10);
            }


        }
        System.out.println("First Array");
        Ex1.printMatrix(arr1);
        System.out.println();
        System.out.println("Second Array");
        Ex1.printMatrix(arr2);
        System.out.println();
        System.out.println("Multiple Array");
         for(int i = 0;i < arr1.length;i++){
            for (int j = 0;j < arr1.length;j++){

              arr1[i][j] = arr1[i][j] * arr2[i][j];

            }
        }


        Ex1.printMatrix(arr1);
    }

}
