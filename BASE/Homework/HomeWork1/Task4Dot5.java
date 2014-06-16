package BASE.Homework.HomeWork1; /**
 * Created by Partizanin on 16.12.13.
 * Task:4.5.
 * Вводим два числа, сравнить последнии цифры этих чисел
 124    4    -  true
 1456   567  -   false
 1      2    -   false
 18     98   -   true
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task4Dot5 {
    public static void main(String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число для сравнения:");

        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);

        System.out.println("Введите второе число для сравнения:");

        String num2 = reader.readLine();
        int number2 = Integer.parseInt(num2);
        int lastnum1 = number1 % 10;
        int lastnum2 = number2 % 10;



        if(lastnum1 == lastnum2){

            System.out.println("Последние цыфры совпадают!!!");
            System.out.println("Последняя цыфра первого числа = "+lastnum1 + "\nПоследняя цыфра второго числа = " + lastnum2);
        }else {
            System.out.print("Последии цыфры не совпадают!!!");

            System.out.println("\nПоследняя цыфра первого числа = "+lastnum1 + "\nПоследняя цыфра второго числа = " + lastnum2);
        }





}

}
