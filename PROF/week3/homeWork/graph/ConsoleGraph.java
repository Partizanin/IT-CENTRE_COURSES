package PROF.week3.homeWork.graph;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 20.05.2014
 * Time: 13:54
 * To change this template use File|Setting|File Templates.
 */
public class ConsoleGraph {

    static class GraphX extends  Thread{
        private int x;
        private int y;


        public GraphX(){
        }

        private void printPoint(){
            y = x + 10;
            for (int i=0; i < y; i++) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }

        @Override
        public void run() {

            try {
                for (x=0; x <= 1000; x++) {
                    printPoint();
                    sleep(1000);
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    static class GraphX2 extends Thread {
        private int x;
        private int y;


        public GraphX2(){
        }

        private void printPoint(){
            y = x*x + 10;
            for (int i=0; i < y; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        @Override
        public void run() {

            try {
                for (x=0; x <= 1000; x++) {
                    printPoint();
                    sleep(1000);
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    static class GraphSinX extends Thread {
        private double x;
        private double y;


        public GraphSinX(){
        }
        double w;
        private void printPoint(){
            y = ( Math.sin(x/3) * 10 ) + 20;
            w = y - w;
            for (int i=0; i < y; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            w = y ;
        }

        @Override
        public void run() {

            try {
                for (x=0; x <= 1000; x++) {
                    printPoint();
                    sleep(1000);
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }



}
