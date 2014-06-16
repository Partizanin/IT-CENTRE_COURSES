package PROF.week4.classWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 24.05.2014
 * Time: 17:08
 * To change this template use File|Setting|File Templates.
 */
public class Main {

    public static void main(String[] args) {
        Holder holder = new Holder();
        Producer producer = new Producer(holder);
        producer.start();
        Consumer consumer = new Consumer(holder);
        consumer.start();



    }





}
