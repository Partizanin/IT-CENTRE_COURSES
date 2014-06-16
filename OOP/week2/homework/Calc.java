package OOP.week2.homework;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:29.01.14
 * Time: 16:48.
 * To change this template use File|Settings|File Templates.
 */
public class Calc {
    public static void main(String[] args) {

  Calc();
}

public static void Calc(){
    String plus =  "Сложение двух чисел";
    String minus= "Вычитание двух чисел";
    String division = "Деление двух чисел";
    String multiplay = "Умножение двух чисел";
    String factorial = "Факториал";

    System.out.println("\t0.- Выход из програмы\n"+
            "\t1.- "+ plus +"\n" +
            "\t2.- "+ minus +"\n" +
            "\t3.- "+ multiplay +" \n" +
            "\t4.- "+ division +" \n"+
            "\t5.- "+ factorial +"\n" );

    Scanner sc = new Scanner(System.in);

    int calc = 9;

    try {

       calc = sc.nextInt();

    }catch (InputMismatchException ex){
        System.out.println("Введите число!!!");


    }

    while (calc != 0){
        if (calc < 0 || calc > 5){
            System.out.println("\t0.- Выход из програмы\n"+
                    "\t1.- Сложение двух чисел\n" +
                    "\t2.- Вычитание двух чисел\n" +
                    "\t3.- умножение двух чисел\n" +
                    "\t4.- Деление двух чисел\n"+
                    "\t5.- Факториал\n" );

            System.err.println("Вы ввели неверное число");


            calc = sc.nextInt();

        }else if (calc == 1){


            System.out.println("\t\t" + plus);
        System.out.println("Введите первое число");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число");
        int n2 = sc.nextInt();
        int res = n1 + n2;


        System.out.println(n1 + " + " + n2 + " = " + res  + ".");
            System.out.println();
        System.out.println("\t0.- Выход из програмы\n"+
                "\t1.- Сложение двух чисел\n" +
                "\t2.- Вычитание двух чисел\n" +
                "\t3.- умножение двух чисел\n" +
                "\t4.- Деление двух чисел\n"+
                "\t5.- Факториал\n" );
        calc = sc.nextInt();
    }else if (calc == 2){
            System.out.println("\t\t" + minus);
        System.out.println("Введите первое число");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число");
        int n2 = sc.nextInt();
        int res = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + res  + ".");
            System.out.println();
        System.out.println("\t0.- Выход из програмы\n"+
                "\t1.- Сложение двух чисел\n" +
                "\t2.- Вычитание двух чисел\n" +
                "\t3.- умножение двух чисел\n" +
                "\t4.- Деление двух чисел\n"+
                "\t5.- Факториал\n" );
        calc = sc.nextInt();
    }else if (calc == 3){
            System.out.println("\t\t" + multiplay);
        System.out.println("Введите первое число");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число");
        int n2 = sc.nextInt();
        int res = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + res  + ".");
            System.out.println();
        System.out.println("\t0.- Выход из програмы\n"+
                "\t1.- Сложение двух чисел\n" +
                "\t2.- Вычитание двух чисел\n" +
                "\t3.- умножение двух чисел\n" +
                "\t4.- Деление двух чисел\n"+
                "\t5.- Факториал\n" );
        calc = sc.nextInt();

    }else if (calc == 4){
            System.out.println("\t\t" + division);
        System.out.println("Введите первое число");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число");
        int n2 = sc.nextInt();
            if (n2 == 0){
                System.out.println("Деленние на 0 невозможно\nВведите другое число: ");
                n2 = sc.nextInt();
                if (n2 == 0){
                    System.out.println("Деленние на 0 невозможно");
                    System.out.println();
                }
            }else{
        int res = n1 / n2;
        int res2 = n1 % n2;
        System.out.println(n1 + " / " + n2 + " = " + res  + "." + res2 + ".");
            System.out.println();
        System.out.println("\t0.- Выход из програмы\n"+
                "\t1.- Сложение двух чисел\n" +
                "\t2.- Вычитание двух чисел\n" +
                "\t3.- умножение двух чисел\n" +
                "\t4.- Деление двух чисел\n"+
                "\t5.- Факториал\n" );
        calc = sc.nextInt();

            }
    }else if (calc == 5){
            System.out.println("\t\t" + factorial);

        System.out.println("Введите  число");
       int n1 = sc.nextInt();
         if (n1 >= 32 || n1 < 0){
          System.err.print("Вы ввели неверное число\nВведите  число для вичисления факториала");

              n1 = sc.nextInt();
         } else {
        int res = 1;

        for (int i = 1; i <= n1; ++i){
            res *= i;
        }
             System.out.println();
        System.out.println("Факториал из числа " + n1 + " = " +res);
             System.out.println();

        System.out.println("\t0.- Выход из програмы\n"+
                "\t1.- Сложение двух чисел\n" +
                "\t2.- Вычитание двух чисел\n" +
                "\t3.- умножение двух чисел\n" +
                "\t4.- Деление двух чисел\n"+
                "\t5.- Факториал\n" );
        calc = sc.nextInt();

         }

    }
    }if (calc == 0){
        System.out.println("Конец программы! :)");

    }



}
}
