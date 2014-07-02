package MyProjects.CodeHunt.com.sector02.LEVEL0203;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.06.2014
 * Time: 23:24
 * To change this template use File|Setting|File Templates.
 */


public class Program {
    public static int[] Puzzle(int n) {
        int[] returne = new int[n];
        int z = 0;
        for(int i = 0; i < n;i++){

            returne[i] = i*i;

        }
        return returne;
    }
}
