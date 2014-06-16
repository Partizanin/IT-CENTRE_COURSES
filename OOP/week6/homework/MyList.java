package OOP.week6.homework;

/**
 * Created with Intellij IDEA.
 * Project name:Ex
 * User:Home
 * Date:21.02.14
 * Time:10:23
 * To change this template use File|Settings|File Templates.
 */
public interface MyList <E>{

    int size();

    void add(E element);


    E get(int index);


    E set(int index,E element);

    int indexOf(Object o);

    E remoeve(int index);

    Object[] toArray();



    boolean isEmpty();

    boolean contains (Object o);

    boolean remove(Object o);











}
