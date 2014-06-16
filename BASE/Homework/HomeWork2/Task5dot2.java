package BASE.Homework.HomeWork2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 20:58.
 * To change this template use File|Settings|File Templates.
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157
 * 5.2 Проверить или является число простым
 */
public class Task5dot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите чило :");
        int a = sc.nextInt();
        numSimple(a);
    }

    public static void numSimple(int num) {

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if ((num % i) == 0) {
                isPrime = false;
                continue;
            }

        }
        if (isPrime) System.out.println("Число: " + num + " Простое");
        else System.out.println("Число: " + num + " Не простое");

    }

}
