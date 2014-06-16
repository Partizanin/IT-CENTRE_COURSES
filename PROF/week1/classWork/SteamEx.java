package PROF.week1.classWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 27.04.2014
 * Time: 15:31
 * To change this template use File|Setting|File Templates.
 */
public class SteamEx {

    public static void main(String[] args) {
    final String FILE_NAME = "text.txt";
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(FILE_NAME));

            String line = br.readLine();
            System.out.println(line);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }

            } catch (IOException e)  {
                e.printStackTrace();
            }
        }
        }

    }

