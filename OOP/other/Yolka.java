package OOP.other;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 29.03.2014
 * Time: 9:48
 * To change this template use File|Setting|File Templates.
 */
public class Yolka {

    public static void printYolka(int range){

        int count = range;



        for (int i = 0; i < range ; i++) {




            for (int j = count; j > 0 ; j--) {

                System.out.print(" ");

                count--;
            }



            for (int j = 0; j < i ; j++) {

                System.out.print("   " + i);


            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printYolka(10);
    }
}
