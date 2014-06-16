package PROF.week3.homeWork.producer_costumer;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 19.05.2014
 * Time: 12:05
 * To change this template use File|Setting|File Templates.
 */
public class Main {

    public static void main(String[] args) {
        Holder q = new Holder();
        Consumer costumer = new Consumer(q,"Потребитель");
        Producer producer = new Producer(q,"Поставщик");
        producer.start();
        costumer.start();


    }


}

