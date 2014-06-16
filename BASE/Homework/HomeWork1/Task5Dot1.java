package BASE.Homework.HomeWork1;

import java.util.Scanner;

/**
 * Created by Partizanin on 16.12.13.
 * Task:
 * 5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
 */

public class Task5Dot1 {

    public static void main(String[] args) {
        console();
    }

    public static  void console(){
        Scanner sc = new Scanner(System.in);
        int select;
        String menu = "1 - Convert number from decimal to binary\n" +
                      "2 - Convert number from binary to  decimal\n" +
                      "3 - Exit from program";

        for (;;){
            System.out.println(menu);
            System.out.println("\nSelect the action:");
            select = sc.nextInt();

            if (select == 1){
                System.out.println("Input decimal number: ");
                select = sc.nextInt();
                System.out.println("Number " +  select + " in binary = " + decConvert(select) + "\n");

            }else if (select == 2){
                System.out.println("Input binary number: ");
                select = sc.nextInt();
                System.out.println("Number " +  select + " in binary = " + binConvert(select) + "\n");

            }else if (select == 3){
                System.exit(1);
            }else {

                System.err.println("You input miss number,pleas try again");
            }

        }
    }


    public static String decConvert(int binaryNum){

        return Integer.toBinaryString(binaryNum);

    }


    public static String binConvert(int decimalNum){

        String num = String.valueOf(decimalNum);
        return String.valueOf(Integer.parseInt(num, 2));

    }

}






