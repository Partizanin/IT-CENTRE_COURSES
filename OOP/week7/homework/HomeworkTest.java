package OOP.week7.homework;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:06.03.14
 * Time:17:35
 * To change this template use File|Settings|File Templates.
 */
public class HomeworkTest {

    public static void main(String[] args) {

        QueueArr qarr = new QueueArr();

        qarr.addEl(1);
        qarr.addEl(2);
        qarr.addEl(3);
        qarr.addEl(4);
        qarr.addEl(5);
        qarr.addEl(6);
        qarr.addEl(7);
        qarr.addEl(4);
        qarr.addEl(5);
        qarr.addEl(6);
        qarr.addEl(4);
        qarr.addEl(5);
        qarr.addEl(6);
        qarr.addEl(7);
        qarr.addEl(4);
        qarr.addEl(5);
        qarr.addEl(6);
        qarr.printArray();
        qarr.removeRepeatElements();
        System.out.println();
        qarr.printArray();
        qarr.addToIndex(5,5);
        System.out.println();
        System.out.println(qarr.getSizeElement());
        System.out.println();
        qarr.printArray();



/*
        Integer n1 = 1;
        Integer n2 = 2;
        Integer n3 = 3;
        Integer n4 = 4;
        Integer n5 = 5;
        Integer n6 = 6;
        Integer n7 = 7;
        Integer n8 = 8;
        Integer n9 = 9;
        Integer n10 = 10;*/


/*
        QueueArr qA = new QueueArr(15);

        qA.addEl(array[0]);
        qA.addEl(array[1]);
        qA.addEl(array[2]);
        qA.addEl(array[3]);
        qA.addEl(array[4]);
        qA.addEl(array[5]);
        qA.addEl(array[6]);
        qA.addEl(array[7]);
        qA.addEl(array[8]);
        qA.addEl(array[9]);
        qA.addEl(array[10]);
        qA.addEl(array[11]);
        qA.addEl(array[12]);
        qA.addEl(array[13]);
        qA.addEl(array[14]);

        qA.sort();
        qA.backOrder();

        qA.fullSort();

        qA.removeRepeatElements();
*/

       /* QueueLinked <Integer> ql = new QueueLinked<Integer>();

        ql.push(n1);
        ql.push(n2);
        ql.push(n3);
        ql.push(n4);
        ql.push(n5);
        ql.push(n6);


        ql.showList();

        ql.addToStart(5);

        ql.showList();

        System.out.println(ql.popFromHead());
        ql.pop();
        ql.popFromHead();
        ql.pop();


        ql.showList();


        System.out.println(ql.searchInputElement(1));

        ql.changeFirstAndLastElement();*/










    }

}
