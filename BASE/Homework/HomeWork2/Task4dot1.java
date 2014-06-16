package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:24.12.13
 * Time: 19:51.
 * To change this template use File|Settings|File Templates.
 * <p/>
 * 4.1 Поменять две переменные местами, не используя дополнительную переменную
 */
public class Task4dot1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество елементо в массиве: ");
        int a = sc.nextInt();


        ArrayUtils.printArr(changePosition(a));


    }

    //num - int num
    public static int[] changePosition(int a) {       //int [] mass - массив в котором нада изменить переменные
        Scanner sc = new Scanner(System.in);
        int num1 = a;
        int[] numbers = new int[num1];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите следующее число: ");
            numbers[i] = sc.nextInt();
        }

        int size = numbers.length;
        for (int i = 0; i != 2; ++i) {
            int temp = numbers[i];

            for (int j = i; j != size - 1; ++j) {
                numbers[j] = numbers[j + 1];
            }
            numbers[size - 1] = temp;
        }
        return numbers;
    }

}
