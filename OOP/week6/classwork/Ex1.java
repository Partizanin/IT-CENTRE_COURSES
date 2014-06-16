package OOP.week6.classwork;

/**
 * Created with Intellij IDEA.
 * Project name:${PROJECT_NAME}
 * User:user
 * Date:01.03.14
 * Time:12:24
 * To change this template use File|Settings|File Templates.
 */public class Ex1 {
    public static void main(String[] args) {


        Stack<Integer> s = new Stack<Integer>();
        FIFO fifo = new FIFO();

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

        s.push(n1);
        s.push(n2);
        s.push(n3);
        s.pop();
        s.showStack();

        /*

        fifo.push(n1);
        fifo.push(n2);
        fifo.push(n3);
        fifo.push(n4);
        fifo.push(n5);


        fifo.showFIFO();
        fifo.pop();
        fifo.pop();

        System.out.println();
       */
/* fifo.pop();*//*

        fifo.showFIFO();


        */
/*s.showStack();*//*


*/







    }

    public static <T extends Comparable<T>> T min(T[] mas){
        T min = mas[0];

        for (int i = 1; i <mas.length ; i++) {

            if (min.compareTo(mas[i]) < 0){

                min = mas[i];

            }


        }
        return min;

    }
}
