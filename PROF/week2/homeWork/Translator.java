package PROF.week2.homeWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 13.05.2014
 * Time: 15:10
 * To change this template use File|Setting|File Templates.
 */

/*Написать переводчик с английского языка на русский.
 В качестве аргументов передается ридер файла с оригенальным
  текстом и ридер со словарем (слово = перевод)

Класс задания hw2.trans.Translator
*/
public class Translator  {


    public static void main(String[] args) throws IOException {
        Translator trs = new Translator();

        Reader txt = new FileReader("D:\\Illia\\JAVA\\Курсы\\text.txt");
        Reader dictionary = new FileReader("D:\\Illia\\JAVA\\Курсы\\Dictionary.txt");

        trs.translate(txt,dictionary);


    }





    public  void test(){
        Map<String,String> map = new HashMap<>(5);

        map.put("Game","Гра");
        map.put("World","Світ");
        map.put("People","Люди");
        map.put("Life","Життя");
        map.put("Friends","Друзі");

        ArrayList<String> list = new ArrayList<>(10);


        list.add("Game");
        list.add("Life");
        list.add("People");
        list.add("World");
        list.add("Friends");


        for (Map.Entry<String, String> entry : map.entrySet()) {

            String key = entry.getKey();
            String value = map.get(key);


            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).equals(key)) {

                    list.set(i, value);
                }
            }

        }

        for (String s : list){

            System.out.println(s);
        }
    }


    public void translate(Reader txt,Reader dictionary) throws IOException {
        Scanner sc;
        String key;
        String text;

        Map<String,String> mapDictionary = new HashMap<>();


        ArrayList<String> listText = new ArrayList<>();


        sc = new Scanner(dictionary);

        while (sc.hasNext()){

            text = sc.nextLine();
            String[] words = text.split("=");
            key = words[0];
            String value = words[1];

            mapDictionary.put(key,value);
        }


        sc = new Scanner(txt);

        while (sc.hasNext()){

             text = sc.next();

            for (Map.Entry<String, String> entry : mapDictionary.entrySet()) {

                if (text.equals(entry.getKey())) {

                    listText.add(mapDictionary.get(entry.getKey()));
                }


            }
            listText.add("-------");

            }
        for (String s : listText){

            System.out.println(s + " ");
        }
        }


    }




