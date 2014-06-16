package OOP.week4.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 11:35.
 * To change this template use File|Settings|File Templates.
 */
public class TestCatClone {
    public static void main(String[] args) throws CloneNotSupportedException {


    Cat cat1 = new Cat("Murchik", 2);

    Cat cat2 = (Cat) cat1.clone();

        System.out.println(cat1.getName() == cat2.getName());
        System.out.println(cat1.getDate() == cat2.getDate());
        System.out.println(cat1 == cat2);
        System.out.println(cat2);
}
}