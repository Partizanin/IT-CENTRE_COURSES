package OOP.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 29.03.2014
 * Time: 9:06
 * To change this template use File|Setting|File Templates.
 */

/*1ﶸ1. Напишите программу, которая считает от 1 до 15, печатает кажж
дое число и затем считает двойками в обратном направлении до 1,
снова печатая каждое число.*/

public class Glava1Task1_1 {

    public static void printCounter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input range number");

        int rang = Integer.parseInt(reader.readLine());

        for (int i = 0; i < rang ; i++) {
            System.out.println();

            System.out.println("Основне " + i );
            for (int j = i; j > 0;) {



                System.out.println();

                j = j - 2;

                if (j >= 0) {
                    System.out.println(j);
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        printCounter();
    }

}
