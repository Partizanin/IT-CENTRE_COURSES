package OOP.week4.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 12:01.
 * To change this template use File|Settings|File Templates.
 */
public class ManTest {
    public static void main(String[] args) throws CloneNotSupportedException {


    Man man1 = new Man("Pasha",12,"Kiev");

    Man man2 = (Man) man1.clone();

        System.out.println(man1.getName() == man2.getName());
        System.out.println(man1.getAdr() == man2.getAdr());
        System.out.println(man1.getAge() == man2.getAge());
        System.out.println(man1);
}
}
