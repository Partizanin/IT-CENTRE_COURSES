package OOP.week6.classwork;


import java.util.Iterator;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:01.03.14
 * Time:13:01
 * To change this template use File|Settings|File Templates.
 */
public class Stack <T> implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class Node{
        T obj;
        Node next;
    }

    Node last;

    public void push(T t){
        Node NewTop = new Node();

        NewTop.obj = t;

        NewTop.next = last;

        last = NewTop;
    }


    public T pop(){

        T t = last.obj;
        last = last.next;

        return t;
    }

    public void showStack(){

        for (Node f = last; f != null; f = f.next) {

            System.out.println(f.obj.toString());

        }


    }

    public T getByIndex(int index){

        for (Node f = last;f != null;f = f.next){
            if (index == 0){
                T ret = (T) f;

                return ret;
            }

            index --;

        }

        return null;
    }

    private class StackIterator implements Iterator<T>{

        private Node start = last;

        @Override
        public boolean hasNext() {
            return start != null;
        }

        @Override
        public T next() {
            T item = start.obj;
            start = start.next;
            return item;
        }

        @Override
        public void remove() {
            throw  new UnsupportedOperationException("This method don`t work now!");
        }
    }
}
