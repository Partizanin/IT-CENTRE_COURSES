package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 12:14.
 * To change this template use File|Settings|File Templates.
 *
 * 4.7 Найти среднее арифметическое массива
 */
public class Task4dot7 {


    public static void ArrArifmet(int arrlength){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[arrlength];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите следующее число: ");
            arr[i] = sc.nextInt();
        }


            int sum = 0;
            double arif = 0;
            for(int i = 0;i < arr.length;i++){
                sum=sum + arr[i];
            }

            arif = sum / arr.length;
            System.out.println("В массиві ");
        ArrayUtils.printArr(arr);
        System.out.println("Середнє арефметичне = "+ arif);
        }

    }

