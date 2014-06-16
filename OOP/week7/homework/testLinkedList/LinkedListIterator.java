package OOP.week7.homework.testLinkedList;

/**

 * Linked list implementation of the list iterator

 *    using a header node.

 * @author Mark Allen Weiss

 * @see OOP.week7.homework.testLinkedList.LinkedList

 */

public class LinkedListIterator {

    /**

     * Construct the list iterator

     * @param theNode any node in the linked list.

     */

    LinkedListIterator( ListNode theNode ) {

        current = theNode;

    }



    /**

     * Test if the current position is a valid position in the list.

     * @return true if the current position is valid.

     */

    public boolean isValid( ) {

        return current != null;

    }



    /**

     * Return the item stored in the current position.

     * @return the stored item or null if the current position

     * is not in the list.

     */

    public Object retrieve( ) {

        return isValid( ) ? current.element : null;

    }



    /**

     * Advance the current position to the next node in the list.

     * If the current position is null, then do nothing.

     */

    public void advance( ) {

        if( isValid( ) )

            current = current.next;

    }



    ListNode current;    // Current position

}
