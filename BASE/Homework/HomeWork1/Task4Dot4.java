package BASE.Homework.HomeWork1;
/**
 * Created by Partizanin on 16.12.13.
 * Task:
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
import java.util.Scanner;
public class Task4Dot4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число:");


        double num = scan.nextDouble();

        if(num >=0 && num <= 1){
            System.out.println("Число " + num + " Лежит в диапазоне от 0 до 1");
        }else{
            System.out.println("Число " + num + " He лежит в диапазоне от 0 до 1");
        }



    }

}
