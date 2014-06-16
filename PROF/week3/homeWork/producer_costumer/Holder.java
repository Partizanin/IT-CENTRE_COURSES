package PROF.week3.homeWork.producer_costumer;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 19.05.2014
 * Time: 11:50
 * To change this template use File|Setting|File Templates.
 */

public class Holder {
    int n;
    boolean valueSet = false;
    int get(){
        while (!valueSet)
        System.out.println("Получено: " + n);
        valueSet = false;
        return n;
    }
    void put(int n){

        this.n = n;
        valueSet = true;

        System.out.println("Отправлено: " + n);

    }
}
