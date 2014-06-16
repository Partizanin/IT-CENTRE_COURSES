package OOP.week4.classwork;

import java.util.Date;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 13:05.
 * To change this template use File|Settings|File Templates.
 */
public class MyTimer {
    int interval;
    int period;
    Date dateBefore = new Date();
    Date dateAfter = new Date();




    public void Start(int interval,int period){

             for (int i = 0;i < period;i ++){

                 double milisec = dateAfter.getTime() - dateBefore.getTime();
                 double second = milisec / 1000;

                  System.out.println(second);


             }

    }

}
