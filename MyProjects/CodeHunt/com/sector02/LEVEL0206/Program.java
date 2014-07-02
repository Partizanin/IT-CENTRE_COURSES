package MyProjects.CodeHunt.com.sector02.LEVEL0206;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.06.2014
 * Time: 23:24
 * To change this template use File|Setting|File Templates.
 */

public class Program {
    public static void main(String[] args) {

        String s = "aaabbbccc";//3
        String s1 = "aaaabbabcacca";//7


        System.out.println("s = " + Puzzle(s));
        System.out.println("s1 = " + Puzzle(s1));

    }

    public static int MyPuzzle(String s) {
        int count = 0;
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher(s);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int Puzzle(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}