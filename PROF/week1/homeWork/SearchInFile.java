package PROF.week1.homeWork;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 16:04
 * To change this template use File|Setting|File Templates.
 */
public class SearchInFile {

    public static void main(String[] args) throws IOException {

        String PATH = "C:\\Users\\user\\Desktop\\Task1.txt";

        System.out.println(searchWord(PATH));

    }



    public static int searchWord(String  path) throws IOException {
         Scanner sc1 = new Scanner(System.in);
         String word;
        int counter = 0;

        System.out.println("Input word for search: ");

        String Searchword = sc1.next();



        Scanner sc = new Scanner(new FileReader(path));

        while (sc.hasNext()) {

           word = sc.next();

            if (Searchword.equals(word)){


                counter++;

            }

        }
        sc1.close();
        sc.close();

        return counter;
    }

    }

