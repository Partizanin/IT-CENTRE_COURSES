package PROF.week1.homeWork;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 01.05.2014
 * Time: 13:21
 * To change this template use File|Setting|File Templates.
 */
public class MyArrayList {


    private int size;

    private transient Integer[] elementData;

    private static final int DEFAULT_CAPACITY = 4;


    public MyArrayList(int initialCapacity){

        if (initialCapacity < 0)

            throw  new IllegalArgumentException("Illegal Capacity: " +
             initialCapacity);
        this.elementData = new Integer[initialCapacity];
    }

    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }



    public void add(Integer value) {

        if (size < elementData.length){
            elementData[size] = value;
            size++;
        }else if (size >= elementData.length){

            elementData = Arrays.copyOf(elementData, size * 2);

            elementData[size] = value;
            size++;
        }



    }


    public void add(int index, Integer value) {


        if (index<= size){

            elementData[index] = value;
        }



    }


    public void remove(int index) {

        int numMoved = size - index -1;

        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index ,numMoved);
        elementData[size] = null;
        size--;

    }


    public void set(int index, Integer value) {




        elementData[index] = value;

    }


    public boolean contains(Integer value) {
        for (int i = 0; i < elementData.length; i++) {

            if (value.equals(elementData[i])){

                return true;
            }
        }

        return false;
    }


    public int size() {
        return size;
    }


    public void clear() {

        for (int i = 0; i < elementData.length; i++) {

            elementData[i] = null;

        }
        size = 0;

    }


    public boolean equals(MyArrayList list) {

        if (this.elementData.length == list.size && this.elementData[0].getClass().equals(list.elementData[0].getClass())){
            return true;
        }
        return false;
    }
}
