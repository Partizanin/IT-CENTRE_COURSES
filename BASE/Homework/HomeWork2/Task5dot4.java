package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 13:46.
 * To change this template use File|Settings|File Templates.
 *
 * 5.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 4 = {2,3,4,5,1}
 Количество позиций и массив указывает пользователь
 *
 */
public class Task5dot4 {


        public static void Arrshift(int size,int shift){
        int arr[] = new int[size]; //Массив, который будем сдвигать

         for(int i = 0;i < arr.length;i++){

           arr[i]= i + 1 ;
         }
            System.out.println("Array before: ");
            ArrayUtils.printArr(arr);
            System.out.println();

            int[] after = arr.clone();

            int length = arr.length;

            for (int i = 0; i < arr.length; i++) {
                int pos = (i + shift) % length;
               after[pos] = arr[i];
        }
            System.out.println("Array after shift to "+ shift +" position: ");
        ArrayUtils.printArr(after);



        }
    }


