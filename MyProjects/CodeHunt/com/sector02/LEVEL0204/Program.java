package MyProjects.CodeHunt.com.sector02.LEVEL0204;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.06.2014
 * Time: 23:24
 * To change this template use File|Setting|File Templates.
 */

public class Program {
    public static int Puzzle(int[] v) {

        int returne = 0;
        for (int aV : v) {
            returne += aV;
        }
        return returne;
    }
}