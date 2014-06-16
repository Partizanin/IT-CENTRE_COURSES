package BASE.Homework.HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:27.
 * To change this template use File|Settings|File Templates.
 *
 * 3.3. Написать метод, который проверяет является ли строка палиндромом
 * !! Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 */
public class Task3dot3 {

    private static boolean isPolindrom(String s) {
        String first = s.toLowerCase();
        String second = new StringBuffer(first).reverse().toString();
        if(first.equals(second)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str = String.valueOf(in.readLine());
        if(str.length() != 5) {
            System.out.println("Incorrect size");
        }
        else {
            System.out.println(isPolindrom(str));
        }
    }





}
/**

    public static void main(String[] args) {

        String s = "Live not on evil";
        String s1 ="Acje abc ba ejcA";

        pal(s1);
    }

   public static void pal(String s) {

        String s1 = s.replaceAll(" ", "");
        System.out.println(s1);
        StringBuffer s2 = new StringBuffer(s1);
        s2.reverse();
        String s3 = s2.toString();
        System.out.println(s3);
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }      **/


