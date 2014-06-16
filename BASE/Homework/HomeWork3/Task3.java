package BASE.Homework.HomeWork3;

import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:24.
 * To change this template use File|Settings|File Templates.
 *
 * 3.	!! Матрицы генерировать случайными числами и размер матрицы вводит юзер. Посмотреть класс String и его методы
 *
 */
public class Task3 {


    public static void generateMatrix(int size){
        int[][] arr = new int[size][size];

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
             arr[i][j] = (int) (1 + Math.random() * 100) ;
            }
        }
        Ex1.printMatrix(arr);
    }
}
