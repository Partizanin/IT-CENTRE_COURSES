package OOP.week2.classwork;

/**
 * Created with Intellij IDEA.
 *User:partizanin
 *Date:25.01.14
 *Time: 21:29.
 *To change this template use File|Settings|File Templates.
 */

import java.text.ParseException;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) throws ParseException {


    Date dateBefore = new Date();

       // SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd hh:mm");
       //Date d = f.parse("2014-01-25 14:14");
       // System.out.println("My formated date = " + d);

            randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);
        randomArrTime(10000000);





        Date dateAfter = new Date();

        double milisec = dateAfter.getTime() - dateBefore.getTime();
        double second = milisec / 1000;
        double  minute = second / 60;
        double houre = minute / 60;

   //     long milisec =

        System.out.println( "Time is:   " +  "\nMilisec is: " + milisec + "\nSecond is: "+ second + "\nMinutes is: " + minute + "\nHoure is : " + houre );
    }

    public static void randomArrTime(int size){
       long[] arr = new long[size];

        for (int i = 0;i < arr.length;i++){
            arr[i] = (int) (Math.random() * 10);


        }



    }
}
