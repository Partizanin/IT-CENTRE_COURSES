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
 * 4.6 Заполнить массив случайными значениями, поменять местами наибольший
 и наименьший элементы
 */
public class Task4dot6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input range of numbers in array");

        int a = sc.nextInt();

        ArrChange(a);

    }

    public static void ArrChange(int range){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array :");
        int length = sc.nextInt();



        int num = length;
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {

           arr[i] = (int) (Math.random() * range);
        }


        ArrayUtils.printArr(arr);
        System.out.println();

        int min = arr [0];
        int max = arr [0];
        for(int i = 0; i < arr.length;i++){
            if(min < arr[i]){
                min = arr[i];
            }
            if(max > arr[i]){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == max){
                arr[i] = min;
            }else if(arr[i] == min){
                arr[i] = max;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println();

        ArrayUtils.printArr(arr);

    }
}
