package BASE.Homework.HomeWork1; /**
 * Created by Partizanin on 16.12.13.
 * Task:
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19

 */
import java.util.Scanner;
public class Task4Dot6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        int num3 = num1 + num2;
        if(num3 <=19 && num3 >= 11 ){
            System.out.println(num1 + " + " + num2 + " = " + num3 +".\nСума находиться в диапазоне от 11 до 19");
        }else{
            System.out.println(num1 + " + " + num2 + " = " + num3 +".\nСума находиться  вне диапазоне от 11 до 19");
        }
    }
}
