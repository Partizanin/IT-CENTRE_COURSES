package PROF.week3.classWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 17.05.2014
 * Time: 16:02
 * To change this template use File|Setting|File Templates.
 */
public class Tripleton {

    private static Tripleton instance;
    private static volatile int cout = 0;

    private Tripleton(){

    }


    public synchronized static Tripleton getInstance() {
        if (instance == null && cout < 3){
            instance = new Tripleton();
            cout++;
        }
        return instance;
    }

}
