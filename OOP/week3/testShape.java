package OOP.week3;

import OOP.week2.homework.Array;
import OOP.week3.classwork.Rectangle;
import OOP.week3.classwork.Shape;
import OOP.week3.classwork.Square;

import java.util.ArrayList;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 11:27.
 * To change this template use File|Settings|File Templates.
 */
public class testShape {

    public static void main(java.lang.String[] args) {

        char[] c = {'a','b','c'};

        String s = new String(c);
      //  System.out.println(s);

        Shape sq = new Square(50);
        double res = sq.getSquare();
        //System.out.println(res);
        Shape rec = new Rectangle(12,15);

        ArrayList list = new ArrayList();
        list.add(sq);
        list.add(rec);
    }
}
