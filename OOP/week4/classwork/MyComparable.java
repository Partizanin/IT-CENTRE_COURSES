package OOP.week4.classwork;

import java.util.Objects;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:08.02.14
 * Time: 11:37.
 * To change this template use File|Settings|File Templates.
 */
public interface MyComparable {

    static final int COUNT_IMPLEMENT = 5; //Константа-значення яке не мыняється,і пишуться з великої!


    Integer compare(Object o);
}
