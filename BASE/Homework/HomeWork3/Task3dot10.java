package BASE.Homework.HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:35.
 * To change this template use File|Settings|File Templates.
 *
 * 3.10*. Удалить из предложения слова которые повторяются.
 */
public class Task3dot10 {

    public static void main(String[] args) {

        String  s1 = "1 2 3 4 5 5 2 3 1 4 5 5 6 7 5 4 2 1 4 3 2 1 6 6";


        System.out.println(removeRepeats(s1));

    }

    public static String removeRepeats(String line){

        List<String> stringList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        Scanner sc = new Scanner(line);

        while (sc.hasNext()){

            stringList.add(sc.next());
        }

        for (String aStringList : stringList) {

            if (!resultList.contains(aStringList)) {

                resultList.add(aStringList);
            }

        }

        return resultList.toString();
    }
}
