package OOP.week7.homework.testLinkedList;

/**
* Created with Intellij IDEA.
* Project name:Курсы
* User:user
* Date:08.03.14
* Time:9:54
* To change this template use File|Settings|File Templates.
*/
class ListNode {

    // Constructors

    public ListNode( Object theElement ) {

        this( theElement, null );

    }



    public ListNode( Object theElement, ListNode n ) {

        element = theElement;

        next = n;

    }



    public Object   element;

    public ListNode next;

}
