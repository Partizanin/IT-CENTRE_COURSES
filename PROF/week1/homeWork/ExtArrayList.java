package PROF.week1.homeWork;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 01.05.2014
 * Time: 14:33
 * To change this template use File|Setting|File Templates.
 */
public class ExtArrayList<E> implements Iterable <E> {


        private Object arr[];
        int positionIterator;

        public ExtArrayList() {
            arr = new Object[10];
        }

        public void checkArrayForFreeSpace() {
            if (arr[arr.length - 1] != null) {
                Object[] newArray = new Object[arr.length + 10];
                System.arraycopy(arr, 0, newArray, 0, arr.length);
                arr = newArray;
            }
        }

        public void add(E obj) {
            checkArrayForFreeSpace();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = obj;
                    return;
                }
            }
        }

        public Object get(int index) {
            if (index >= arr.length && index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Object obj;
            obj = arr[index];
            return obj;
        }

        public void add(int index, E obj) {
            checkArrayForFreeSpace();
            try {
                if (arr[index] == null) {
                    arr[index] = obj;
                }
                if (arr[index] != null) {
                    for (int i = arr.length - 2; i >= index; i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[index] = obj;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        public void remove(int index) {
            if (index < 0 && index > arr.length - 1) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (index == arr.length - 1) {
                arr[index] = null;
                return;
            }
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }

        @Override
        public String toString() {
            return Arrays.toString(arr);
        }

        public void set(int index, E obj) {
            arr[index] = obj;
        }

        public int indexOf(E obj) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(obj)) {
                    return i;
                }
            }
            return -1;
        }

        public boolean contains(E obj) {
            for (Object value : arr) {

                if ((value != null) && value.equals(obj)) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return arr.length;
        }

        public void clear() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = null;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ExtArrayList that = (ExtArrayList) o;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != that.arr[i]) {
                    return false;
                }
            }
            return true;
        }

        public Iterator<E> iterator() {
            return new Iterator<E>() {
                @Override
                public boolean hasNext() {
                    try {
                        if (positionIterator != arr.length) {
                            return true;
                        }
                        return false;
                    } catch (ConcurrentModificationException e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                @Override
                public E next() {
                    try {
                        Object obj = ExtArrayList.this.get(positionIterator);
                        if(obj==null){
                            obj=0;
                        }
                        positionIterator++;
                        return (E) obj;
                    } catch (ConcurrentModificationException e) {
                        e.printStackTrace();
                    }
                    return null;
                }

                @Override
                public void remove() {
                    try {
                        if(positionIterator==0){
                            ExtArrayList.this.remove(positionIterator);
                            positionIterator--;
                        }else {
                            ExtArrayList.this.remove(positionIterator - 1);

                        }
                    } catch (ConcurrentModificationException e) {
                        e.printStackTrace();
                    }
                }
            };
        }



    }
