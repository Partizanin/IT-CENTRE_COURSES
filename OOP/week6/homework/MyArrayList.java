package OOP.week6.homework;



import java.util.Arrays;
import java.util.Iterator;


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
public class MyArrayList <E> implements MyList <E>,Cloneable {



    private int size;

    private transient Object[] elementData;

    private static final int DEFAULT_CAPACITY = 4;




    public MyArrayList (int initialCapacity){


        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);

        this.elementData = new Object[initialCapacity];

    }


    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }




    @Override
    public int size() {
        return size;
    }


    public void printArray(){

        for (int i = 0; i < size ; i++) {

            System.out.println(elementData[i] + " ");

        }

    }

    @Override
    public void add(E element) {
        if (size < elementData.length){
         elementData[size] = element;
        size++;
        }else if (size >= elementData.length){

            elementData = Arrays.copyOf(elementData, size * 2);

            elementData[size] = element;
            size++;
        }

    }



    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {

        E oldValue = get(index);

        elementData[index] = element;

        return oldValue;

    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
        }


    @Override
    public E remoeve(int index) {

        E oldValue = get(index);

        int numMoved = size - index -1;

        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index ,numMoved);
       elementData[size] = null;
        size--;
        return oldValue;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                    numMoved);
        elementData[--size] = null; // clear to let GC do its work
    }

    @Override
    public boolean remove(Object o) {

        if (o == null) {
            for (int index = 0; index < size; index++)
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(elementData[index])) {
                    fastRemove(index);
                    return true;
                }
            size--;
        }
        return false;


    }

    private void ensureCapacity(){

        if (size >= elementData.length){

            elementData = Arrays.copyOf(elementData,DEFAULT_CAPACITY );
        }


    }


    public class MyIterator implements Iterator<E>{

        int start = 0;

        @Override
        public boolean hasNext() {
            return elementData[start] != null;
        }

        @Override
        public E next() {


            return (E) elementData[start++];
        }

        @Override
        public void remove() {

            throw new UnsupportedOperationException("Tis method don`t working");

        }
    }






}

