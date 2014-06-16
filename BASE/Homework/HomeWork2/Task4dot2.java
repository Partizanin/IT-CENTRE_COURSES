package BASE.Homework.HomeWork2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:25.12.13
 * Time: 15:04.
 * To change this template use File|Settings|File Templates.
 *
 * 4.2 Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Task4dot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество елементо в массиве: ");
        int a = sc.nextInt();


        int b = 0 ;


        showMaxMin(a,b);
    }

    public static void showMaxMin(int a,int b) {

        Scanner sc = new Scanner(System.in);
        int num = a;
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите следующее число: ");
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }

            if (min > numbers[i]) {
                min = numbers[i];
            }

        }
        System.out.println("min = " + min + "\nmax = " + max);
    }
}
