package OOP.week7.homework;

import OOP.week7.homework.QueueLinked.Node;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:10.03.14
 * Time:15:01
 * To change this template use File|Settings|File Templates.
 */
public class QueueMaxMin implements  Comparable<Node> {


    @Override
    public int compareTo(Node e) {
        Integer e1 = (Integer) e.getObj();
        Integer e2 = (Integer) e.getNext().getObj();

        if (e1 > e2){
            return 1;
        }else {
            return -1;
        }


    }
}
