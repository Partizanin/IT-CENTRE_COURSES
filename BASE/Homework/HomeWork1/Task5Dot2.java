package BASE.Homework.HomeWork1;
/**
 * Created with Intellij IDEA.
 *User:Partizanin
 *Date:16.12.13.
 *Time: 15:28.
 *To change this template use File|Settings|File Templates.
 * Task: 5.2. Вычислить факториал числа
 */
import java.util.Scanner;

public class Task5Dot2 {
    public static void main(String[] args)throws Exception{
        int sum;
        int num;
         do {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала:");

         num = scan.nextInt();
        if(num < 0)
            System.out.println("Вы ввели не верноне значение!!!");
         sum = 1;
        for (int i = 2; i <= sum;i++){
            sum *= i;
        }

         }while (num < 0);{
            System.out.println("Факториал из числа:" + num +"! = " + sum +"."+ "\nКонец програмы :)");}



    }
}


