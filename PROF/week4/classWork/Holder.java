package PROF.week4.classWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 24.05.2014
 * Time: 17:03
 * To change this template use File|Setting|File Templates.
 */
public class Holder {
    Integer n;


    public synchronized Integer getN() throws InterruptedException {
        if (this.n == null){
            wait();
        }
        System.out.println("Получено: " + n);
        Integer temp = n;
        this.n = null;
        notify();
        return temp;

    }


    public synchronized void put(Integer n) throws InterruptedException {
        if (this.n != null){
            wait();
        }

        this.n = n;
        notify();
        System.out.println("Отправлено: " + n);
    }





}
