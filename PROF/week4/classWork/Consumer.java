package PROF.week4.classWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 24.05.2014
 * Time: 17:03
 * To change this template use File|Setting|File Templates.
 */
public class Consumer extends Thread {

    Consumer(Holder h){

        instance = h;

    }

    private Holder instance;

    @Override
    public void run() {

       while (true) {

        try {
            instance.getN();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
    }
}
