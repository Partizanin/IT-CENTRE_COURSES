package BASE.Homework.HomeWork1; /**
 * Created by Partizanin on 16.12.13.
 * Task
 * 4.3.  Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
 в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */
import java.util.Scanner;
public class Task4Dot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        int num3 = num1 / num2;
        int num4 = num2 / num1;
        int num5 = num1 % num2;
        int num6 = num2 % num1;

     if(num1 % num2 == 0){
         System.out.println("Число делиться без остачи " + num1+ ":" + num2 + " = " + num3 );

    }else if(num2 % num1 == 0){
         System.out.println("Число делиться без остачи " + num2+ ":" + num1 + " = " + num4);
    }else if(num1 % num2 != 0 ){
            System.out.println("Число делиться с остачей " + num1+ ":" + num2 + " = " + num3 + "." + num5);
        }else if(num2 % num1 != 0){
         System.out.println("Число делиться с остачей " + num2+ ":" + num1 + " = " + num4 + "." + num6 );
     }

    }
}


