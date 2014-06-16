package PROF.week2.classWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 11.05.2014
 * Time: 15:46
 * To change this template use File|Setting|File Templates.
 */

public class FileTranslate {


    public static void main(String[] args) throws FileNotFoundException {
        FileTranslate fts = new FileTranslate();
        String PATH = "C:\\Users\\user\\Desktop\\Task1.txt";

        fts.translateFile(PATH);
    }
    String PATH = "C:\\Users\\user\\Desktop\\Task1.txt";
    Map<String,String>  map = new HashMap<String, String>();
    ArrayList<String> translate = new ArrayList<String>();




    public void translateFile(String PATH) throws FileNotFoundException {
        map.put("error","помилка");
        map.put("failed","не вдалося");
        map.put("to","до");
        map.put("push","штовхати");
        map.put("some","деякий");
        Scanner sc = new Scanner(new FileReader(PATH));
        String s = "";
        Set<Map.Entry<String,String>> entries = map.entrySet();

        while (sc.hasNext()){

            s = sc.next();

            for (Map.Entry<String,String> entry : entries){

                if (s.equals(entry.getKey())){

                    translate.add(entry.getValue());
                }else {

                    translate.add("------");
                }


            }

        }

        for (String list : translate){

            System.out.println(list);
        }

    }

}
