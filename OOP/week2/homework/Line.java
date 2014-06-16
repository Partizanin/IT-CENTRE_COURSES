package OOP.week2.homework;

import java.util.logging.StreamHandler;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:31.01.14
 * Time: 14:28.
 * To change this template use File|Settings|File Templates.
 */
    public class Line {

        char[] line = {'H','e','l','l','o','W','o','r','l','d'};

    String l1;
    String l2;

    public Line (){

    }
        public Line (String l1,String l2){
           this.l1 = l1;
            this.l2 = l2;
        }

    void display(){
        for (int i = 0;i < line.length;i++){

            System.out.print(line[i] + " ");
        }
        System.out.println();
    }
        public String concat(){
            String s = new String(line);



            return s;

    }

    public String Downcase(){
        String s = new String(line);
        String res = s.toLowerCase();
        return res;
    }

    public String Upcase(){
        String s = new String(line);
        String res = s.toUpperCase();
        return res;

    }

    public String LineSearch(String l1,String l2){
      String res;
        if (l1.indexOf(l2) != -1){
            res = "Строка 1 содержит подстроку 2";
        } else {
            res = "Строка 1 не содержит подстроку 2";
        }
        return res;


    }




}
