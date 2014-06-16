package PROF.week4.classWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 24.05.2014
 * Time: 15:56
 * To change this template use File|Setting|File Templates.
 */
public class Printer {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread("First thread");
        Thread thread2 = new Thread("Second thread");

        Printer printer = new Printer();

        printer.printer(thread1);
        System.out.println();
        printer.printer(thread2);


    }



    public synchronized void printer(Thread thread) throws InterruptedException {

        for (int i = 0; i < 3; i++) {

            System.out.print("[" + thread);
            thread.sleep(1);
            System.out.print("]");
            System.out.println();
        }
    }
}
