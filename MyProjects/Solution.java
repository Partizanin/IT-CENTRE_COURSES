package MyProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 12.06.2014
 * Time: 20:31
 * To change this template use File|Setting|File Templates.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       /* String time = reader.readLine();
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + time + " лет. Му-ха-ха!");*/

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + " " + "захватит мир через" + " " + nAge + " " + "лет. Му-ха-ха!");
    }
}
//vasa захватит мир через 12 лет. Му-ха-ха!
//vasa захватит мир через 12 лет. Му-ха-ха!