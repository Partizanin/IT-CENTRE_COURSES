package BASE.Homework.HomeWork1; /**
 * Created by Partizanin on 16.12.13.
 * Task:
 * 4.2.  Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
import java.util.Scanner;

public class Task4Dot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Good!Введите третье число:");
        int c = sc.nextInt();



        if(a < b && a < c){
            System.out.println("min number is " + a);
        }else if(b < a && b < c){
            System.out.println("min number is " + b);
        }else if(c < a && c < b){
            System.out.println("min number is " + c);
        }

        if(a > b && a > c){
            System.out.println("max number is " + a);
        }else if(b > a && b > c){
            System.out.println("max number is " + b);
        }else if(c > a && c > b){
            System.out.println("max number is " + c);
        }
        System.out.println("Goodbye!");


    }


}
