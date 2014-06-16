package PROF.week1.homeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 30.04.2014
 * Time: 11:20
 * To change this template use File|Setting|File Templates.
 */
public class FileView {

    int start = 0;
    int end = 10;
    List<String> list;






    public static List<String> readFile() throws IOException {

        List<String>  list = new ArrayList<String>();

        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\Task1.txt");
        Scanner sc = new Scanner(new FileReader("C:\\Users\\user\\Desktop\\Task1.txt"));


        int count = 0;

        while (sc.hasNext()){
            list.add(sc.nextLine());
            count++;
        }
        fr.close();

        return list;

    }


    public String  flipPageForward(List<String> list){

        String res = "";

        if (end <= list.size()) {

            for (int i = start; i < end; i++) {

                res += list.get(i);

                res += "  ";
                res += "\n";

            }

            start = end;

            end += 10;


            return res;
        }
        System.err.println("This is last page");


        return res;
    }


    public String  flipPageBack(List<String> list){

        String res = "";

        if (end <= 10){

            for (int i = end; i >= start; i--) {

                res += list.get(i);
                res += "  ";
                res += "\n";

            }

            System.err.println("This is first page");

            return res;

        }


        for (int i = end; i > start; i--) {

            res += list.get(i);
            res += "  ";
            res += "\n";

        }

        start -= 10;
        end -= 10;

        return res;

    }

    public void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String chosen;
        list = readFile();



        for (;;) {

             chosen = br.readLine();

            if (chosen.equals("")){

                System.out.println(flipPageForward(list));

            }

            if (chosen.equals("b")){

                System.out.println(flipPageBack(list));
            }

        }

    }

    public static void main(String[] args) throws IOException {

        FileView fv = new FileView();

        fv.test();
    }
}
