package BASE.Homework.HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:34.
 * To change this template use File|Settings|File Templates.
 *
 * 3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
 *
 */
public class Task3dot7 {

    public static void main(String[] args) {

        String s = "Найти самое длинное слово в строке(разделенное одним пробелом)";

        System.out.println(searchLongWord(s));
    }
    public static String searchLongWord(String words){

        String result = "";

        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(words);

        while (sc.hasNext()){

            list.add(sc.next());
        }

        for (String aList : list) {

            if (result.length() < aList.length()) {

                result = aList;
            }
        }

        return  result;
    }

}
