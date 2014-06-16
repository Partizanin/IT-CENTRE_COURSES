package PROF.week1.homeWork;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 15:41
 * To change this template use File|Setting|File Templates.
 */
public class SummFromOneNumber {

    public static void main(String[] args) {
        System.out.println(summ());
    }


    public static int summ(){
      int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");

        String num = sc.nextLine();

        char[] chars = num.toCharArray();

        num = String.copyValueOf(new char[]{chars[0]});

        sum = Integer.parseInt(num);

        num = String.copyValueOf(new char[]{chars[1]});

        sum += Integer.parseInt(num);
        return sum;
    }
}
