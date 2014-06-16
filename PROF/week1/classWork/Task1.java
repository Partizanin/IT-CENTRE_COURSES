package PROF.week1.classWork;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 27.04.2014
 * Time: 15:42
 * To change this template use File|Setting|File Templates.
 */
public class Task1 {

    public static void main(String[] args) throws IOException {
        final String PATH = "e:\\TestText.txt";
        BufferedReader br = new BufferedReader(new FileReader(PATH));
        String line = null;
        readFile(line,br);

     }




    public static void readFile(String line,final BufferedReader br) throws IOException {

        try {
            List<String> list = new ArrayList<String>();

            while (br.readLine() != null){

                line = br.readLine();

                list.add(line);
            }

            for (int i = list.size() -1; i >= 0 ; i--) {

                System.out.println(list.get(i));

            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
