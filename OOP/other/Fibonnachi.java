package OOP.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 29.03.2014
 * Time: 13:09
 * To change this template use File|Setting|File Templates.
 */
public class Fibonnachi {

    public static void fib (int range){
        int res;
        int previousNum = 1;
        int next = 0;


        for (int i = 0; i < range ; i++) {


            res = previousNum + next;

            System.out.println(res + " ");

            previousNum = next;

            next = res;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input range");

        int range = Integer.parseInt(reader.readLine());

        fib(range);
    }
}
