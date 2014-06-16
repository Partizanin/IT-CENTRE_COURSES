package OOP.week4.classwork;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:08.02.14
 * Time: 11:52.
 * To change this template use File|Settings|File Templates.
 */
public class TestPerson {
    public static void main(String[] args) {

   /*     MyComparable comparable = new Person(5);
        Person p2 = new Person(6);
        comparable.compare(p2);

        if (comparable.compare(p2) == 1){
            System.out.println("man2  < man1");
        }else {
            System.out.println("man2 > ma1");
        }*/

     /*   Employee e = new Employee();
        e.getpay(true);
        e.goTrip(false);
        e.payTax(true);*/

        Person p1 = new Person(65);
        Person p2 = new Person(44);
        Person p3 = new Person(48);
        Person p4 = new Person(25);
        Person p5 = new Person(456);

        Person[] persons = new Person[5];

        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;
        persons[3] = p4;
        persons[4] = p5;


        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() <o2.getAge()){
                    return -1;
                }else if (o1.getAge() > o2.getAge()){
                    return 1;
                }
                return 0;
            }
        });
        System.out.println();
        System.out.println(Arrays.toString(persons));

}
}
