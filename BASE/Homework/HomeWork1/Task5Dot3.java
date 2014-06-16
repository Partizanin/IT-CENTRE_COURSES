package BASE.Homework.HomeWork1;

import java.util.Scanner;

/**
 * Created by Partizanin on 16.12.13.
 * Task:
 * 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 5678  -   1
 5889  -   2
 8888  -   4
 989990  - 1
 */
public class Task5Dot3 {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число для подсчета совпадений: ");

        int num1 = sc.nextInt();
        String n1 = String.valueOf(num1);

        System.out.println("Введите второе число для подсчета совпадений: ");

        int num2 = sc.nextInt();
        String n2 = String.valueOf(num2);

        System.out.println("Введите третие число для подсчета совпадений: ");

        int num3 = sc.nextInt();
        String n3 = String.valueOf(num3);


        char[] symb1 = n1.toCharArray();
        int count1 = 0;
        for(int i = 0; i < symb1.length; ++i)
            if(symb1[i] == '8')
                ++count1;

        char[] symb2 = n2.toCharArray();
        int count2 = 0;
        for(int i = 0; i < symb2.length; ++i)
            if(symb2[i] == '8')
                ++count2;



        char[] symb3 = n3.toCharArray();
        int count3 = 0;
        for(int i = 0; i < symb3.length; ++i)
            if(symb3[i] == '8')
                ++count3;



        System.out.println("В числе №1 "+num1 +" встераеться  -  " + count1 + " cовпадение\nВ числе №2 " +num2 + " встераеться  -  " + count2 + " cовпадение  \nВ числе №3 "+num3 +" встераеться  -  " + count3 + " cовпадение ");}
}

