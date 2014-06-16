package PROF.week1.homeWork;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 16:43
 * To change this template use File|Setting|File Templates.
 */
public class FileChange {


    public static void main(String[] args) throws IOException {

        String PATH = "C:\\Users\\user\\Desktop\\Task1.txt";


        writeFile(changehWord(readFile(PATH)),PATH);

    }



    public static String  changehWord(List<String>  list) throws IOException {
        String result = "";
        String word1;
        String word2;
        String word3;
        String word4;


        for (int i = 0; i < list.size() - 4;) {

            word1 = list.get(i);
            word2 = list.get(i+1);
            word3 = list.get(i+2);
            word4 = list.get(i+3);

            list.set(i,word4);
            list.set(i+1,word3);
            list.set(i+2,word2);
            list.set(i+3,word1);

            i += 4;
        }

        for (String aList : list) {

            result += aList;
            result += "  ";

        }


        return result;
    }


    public  static List<String> readFile(String path) throws IOException {

        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(new FileReader(path));



        while (sc.hasNext()){

            list.add(sc.next());

        }
        sc.close();

        return list;


    }

    public static void writeFile(String text, String path) throws IOException{

        FileWriter fw = new FileWriter(path);

        fw.write(text);


        fw.close();

    }
}
