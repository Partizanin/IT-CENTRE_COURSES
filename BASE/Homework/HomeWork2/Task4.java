package BASE.Homework.HomeWork2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:24.12.13
 * Time: 18:20.
 * To change this template use File|Settings|File Templates.
 *
 * 4. Массив вводить с консоли
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int a = sc.nextInt();



         ArrCreate(a);

    }
    public static void ArrCreate(int a) {
        Scanner sc = new Scanner(System.in);
        int length = a;
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите следующее число: ");
            numbers[i] = sc.nextInt();
        }
        for(int k : numbers)
            System.out.print(k + " ");
    }
}