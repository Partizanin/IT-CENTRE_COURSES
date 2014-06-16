package MyProjects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.05.2014
 * Time: 12:43
 * To change this template use File|Setting|File Templates.
 */
/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
public class Test {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
//GregorianCalendar currDate = new GregorianCalendar();
        Date date = new Date(System.currentTimeMillis());
        String formattedDate = sdf.format(date);
        System.out.print(formattedDate);




    }


    public int badCode(int a,int b,int c){
        int res = 0;
        if (a < b && b < c) {
            res = b;
        }else if (a < c && c < b) {
            res = c;
        }else if (a < b && c < a) {
            res = a;
        }

        return res;
    }

    public  int myMethod(int a,int b,int c){
        int res = 0;

        if (a > b && a < c){
            res = a;
        }else if (b > a && b < c){
            res = b;
        }else if (c > a && c < b){
            res = c;
        }

        return res;
    }
}

