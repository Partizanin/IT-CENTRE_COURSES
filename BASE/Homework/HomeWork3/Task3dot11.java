package BASE.Homework.HomeWork3;

import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:35.
 * To change this template use File|Settings|File Templates.
 *                           a
 * 3.11*. Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.
 */
public class Task3dot11 {
    public static void main(String[] args) {
        TurnMatrix(5,360);
    }

    public static void TurnMatrix(int size,int angel){
        int[][] arr = new int[size][size];



       for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr.length;j++){
                arr[i][j]  = (int) (Math.random()* 100);
            }
              }
        Ex1.printMatrix(arr);
        System.out.println();


            if (angel == 90){
                for (int i = 0;i < arr.length;i++){
                    for (int j = arr.length -1;j >= 0;j--){

                        System.out.print(arr[j][i] + " ");
                    }
                    System.out.println();
                }

            } else  if (angel ==  180){
                for (int i = arr.length -1; i >= 0;i--){
                    for (int j = arr.length-1;j >= 0;j--){
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }


            }else if (angel == 270){
                for (int i = arr.length-1;i >= 0;i--){
                    for (int j = 0;j < arr.length;j++){
                        System.out.print(arr[j][i] + " ");
                    }
                    System.out.println();
                }


            } else if (angel == 360){

               Ex1.printMatrix(arr);

            }



    }

    }



