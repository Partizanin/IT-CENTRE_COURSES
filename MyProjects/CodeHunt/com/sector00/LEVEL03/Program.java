package MyProjects.CodeHunt.com.sector00.LEVEL03;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.06.2014
 * Time: 23:01
 * To change this template use File|Setting|File Templates.
 */

public class Program {
    public static int Puzzle(int x) {
        if (x == 2) return 4;
        if (x == 6) return 12;

        return x*2;
    }
}