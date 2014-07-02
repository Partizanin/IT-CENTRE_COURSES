package MyProjects.CodeHunt.com.sector02.LEVEL0207;

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


        System.out.println("a = " + Puzzle(s,'a'));
        System.out.println("b = " + Puzzle(s1,'b'));
    }

    public static int Puzzle(String s, char x) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == x){

                count++;
            }
        }

        return count;
    }
}