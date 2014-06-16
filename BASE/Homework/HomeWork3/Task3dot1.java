package BASE.Homework.HomeWork3;

import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:25.
 * To change this template use File|Settings|File Templates.
 *
 * 3.	!! Матрицы генерировать случайными числами и размер матрицы вводит юзер. Посмотреть класс String и его методы
 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class Task3dot1 {

 public static void changeMatrix(int size){
     int arr[][] = new int[size][size];

     for (int i = 0;i < arr.length;i++){
         for (int j = 0;j < arr.length;j++){
             arr[i][j] = (int) (1 + Math.random() * 100);


         }
     }
     System.out.println("Array before change: ");
     Ex1.printMatrix(arr);
     System.out.println();

     for (int i = 0;i < arr.length;i++){
         for(int j = 0; j < arr.length;j++){
             if(arr[i][j] % 5 == 0){
                 arr[i][j] = 8;
             }
         }
     }
     System.out.println("Array after change :");
     Ex1.printMatrix(arr);
 }

}
