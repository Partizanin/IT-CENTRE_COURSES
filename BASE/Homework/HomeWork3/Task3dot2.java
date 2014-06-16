package BASE.Homework.HomeWork3;

import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:26.
 * To change this template use File|Settings|File Templates.
 *
 * 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 * !! Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 */
public class Task3dot2 {

    public static void TrueMatrix(int size){
      int [][] arr = new int[size][size];

        for(int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr.length;j++){
                if(i == j){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        Ex1.printMatrix(arr);
    }
}
