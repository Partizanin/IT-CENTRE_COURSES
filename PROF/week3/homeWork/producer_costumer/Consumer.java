package PROF.week3.homeWork.producer_costumer;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 19.05.2014
 * Time: 12:04
 * To change this template use File|Setting|File Templates.
 */
public class Consumer extends Thread {
    Holder q;


    Consumer(Holder q, String name){
        this.q = q;
        currentThread().setName(name);
    }

    public void run(){
        for (int i = 0; i < 20; i++) {

            q.get();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
