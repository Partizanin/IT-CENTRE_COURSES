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
 * 4.5 Заполнить массив случайными значениями
 */
public class Task4dot5 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Input rang nunbers in array : ");

        int range = sc.nextInt();

       ArrRandom(range);

    }

    public static void ArrRandom(int range){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array :");
        int length = sc.nextInt();



        int num = length;
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * range);
        }


        ArrayUtils.printArr(numbers);
    }

}
