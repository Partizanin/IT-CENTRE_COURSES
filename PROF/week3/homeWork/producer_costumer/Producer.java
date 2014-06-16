package PROF.week3.homeWork.producer_costumer;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 19.05.2014
 * Time: 11:51
 * To change this template use File|Setting|File Templates.
 */

/*Один поток генерирует числа второй выводит на экран используя промежуточное хранилище.

Классы задания:

hw3.threads.Producer
hw3.threads.Consumer
hw3.threads.Holder
*/
public class Producer extends Thread {
    Holder q;

    Producer(Holder q,String name){
        this.q = q;
         currentThread().setName(name);
    }

    public void run(){
        int i = 0;
        for (int j = 0; j < 20; j++) {

            q.put(i++);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
