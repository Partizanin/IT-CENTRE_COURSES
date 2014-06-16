package BASE.Homework.HomeWork1; /**
 * Created by Partizanin on 16.12.13.
 * TASK:
 * 4.1.  Пользователь вводит параметр с консоли (время звонка от 0 до 24)
 Если время звонка от 8 до 21, то выводим "Привет", в другом случае "Абонент отдыхает!")
 */
import java.util.Scanner;
public class Task4Dot1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время для звонка от 0 до 24 часов:");

        int num = sc.nextInt();
        if(num < 8){
            System.out.println("Абонент отдыхает!\nПерезвоните позже или оставьте своё сообщение после сигнала!:)");
        }else if (  num > 21){
            System.out.println("Абонент отдыхает!\nПерезвоните позже или оставьте своё сообщение после сигнала!:)");

        }else {
            System.out.println("Абонент Partizanin вас слушает");
        }





    }

}


