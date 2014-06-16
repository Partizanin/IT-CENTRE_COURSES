package PROF.week4.classWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 24.05.2014
 * Time: 17:03
 * To change this template use File|Setting|File Templates.
 */
public class Producer extends Thread {

    private Holder instance;

    Producer(Holder h){

        instance = h;

    }


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            try {
                instance.put(i);
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
       currentThread().interrupt();
    }
}
