package OOP.week8.classwork;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:23.03.2014
 * Time:11:23
 * To change this template use File|Settings|File Templates.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
