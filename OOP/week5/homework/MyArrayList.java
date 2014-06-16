package OOP.week5.homework;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name:Ex
 * User:Home
 * Date:17.02.14
 * Time:18:33
 * To change this template use File|Settings|File Templates.
 */
/*
MyList<integer>array = new MyArrayList<integer>();
- add
        - get
        - set
        - indexOf
        - remove
        - toArray*/
public class MyArrayList <E> implements MyList <E> {

    private int size = 0;


    public static void main(String[] args) {

        List <Integer> array = new ArrayList<Integer>();

      /*  array.size();
        array.add();
        array.get();
        array.set();
        array.indexOf();
        array.remove();*/

    }


    public MyArrayList (){

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, E element) {


    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public E remoeve(int index) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }
}

