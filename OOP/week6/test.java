package OOP.week6;


import OOP.week6.homework.MyArrayList;
import OOP.week6.homework.MyList;

import java.util.*;

/**
 * Created with Intellij IDEA.
 * User:Home
 * Date:17.02.14
 * Time:18:09
 * To change this template use File|Settings|File Templates.
 */

public class test {
        public static void main(String args[]) {


            List <Integer> list = new ArrayList<Integer>();


            MyList<Integer> arr = new MyArrayList<Integer>();

            Integer n1 = 1;
            Integer n2 = 2;
            Integer n3 = 3;
            Integer n4 = 4;
            Integer n5 = 5;
            Integer n6 = 6;
            Integer n7 = 7;
            Integer n8 = 8;
            Integer n9 = 9;
            Integer n10 = 10;
            Integer n11 = 11;
            Integer n12 = 12;
            Integer n13 = 13;
            Integer n14 = 14;
            Integer n15 = 15;


            arr.add(n1);
            arr.add(n2);
            arr.add(n3);
            arr.add(n4);
            arr.add(n5);

            list.add(n1);
            list.add(n2);
            list.add(n3);
            list.add(n4);
            list.add(n5);






            System.out.println("\t\tMetod size()");
            System.out.println("MyArrayList  " + arr.size());
            System.out.println("Metod JAVAArrayList " + list.size());
            System.out.println();

            System.out.println("\t\tMetod  void add(E element); ");

            System.out.println("Before");

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));

            System.out.println("After");

            list.add(n1);
            arr.add(n1);

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));


            System.out.println("\t\tMetod   E get(int index); ");
            System.out.println("JavaArrayList " + list.get(2).toString()  );
            System.out.println("MyArrayList " + arr.get(2).toString());

            System.out.println("\t\tMetod E set(int index,E element); ");


            System.out.println("Before");

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));

            System.out.println("After");

            list.set(2,n5);
            arr.set(2,n5);

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));


            System.out.println("\t\tMetod int indexOf(Object o); ");
            System.out.println("JavaArrayList " + list.indexOf(n4)  );
            System.out.println("MyArrayList " + arr.indexOf(n4));

            System.out.println("\t\tMetod     E remoeve(int index); ");


            System.out.println("Before");

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));

            System.out.println("After");

            list.remove(3);
            arr.remoeve(3);

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));

            System.out.println("\t\tMetod Object[] toArray(); ");
            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));

            System.out.println("\t\tMetod boolean isEmpty();");
            System.out.println("JavaArrayList " + list.isEmpty()  );
            System.out.println("MyArrayList " + arr.isEmpty());

            System.out.println("\t\tMetod      boolean contains (Object o);");
            System.out.println("JavaArrayList " + list.contains(n5)  );
            System.out.println("MyArrayList " + arr.contains(n5));

            System.out.println("\t\tMetod  boolean remove(Object o);");
            System.out.println("Before");

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));

            System.out.println("After");

            System.out.println("JavaArrayList " + list.remove(n5));
            System.out.println("MyArrayList " + arr.remove(n5));

            System.out.println("JavaArrayList " + Arrays.toString(list.toArray()));
            System.out.println("MyArrayList " + Arrays.toString(arr.toArray()));










        }
    }

