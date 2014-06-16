package OOP.week7.homework.newLinkedList;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:08.03.14
 * Time:14:37
 * To change this template use File|Settings|File Templates.
 */
public class Link {



        // Set to public so getters & setters aren't needed

        public String bookName;
        public int millionsSold;

        // Reference to next link made in the LinkList
        // Holds the reference to the Link that was created before it
        // Set to null until it is connected to other links

        public Link next;

        public Link(String bookName, int millionsSold){

            this.bookName = bookName;
            this.millionsSold = millionsSold;

        }

        public void display(){

            System.out.println(bookName + ": " + millionsSold + ",000,000 Sold");

        }

        public String toString(){

            return bookName;

        }

        public static void main(String[] args) {

            LinkList theLinkedList = new LinkList();

            // Insert Link and add a reference to the book Link added just prior
            // to the field next

            theLinkedList.insertFirstLink("Don Quixote", 500);
            theLinkedList.insertFirstLink("MultiJabberServer Tale of Two Cities", 200);
            theLinkedList.insertFirstLink("The Lord of the Rings", 150);
            theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);

            theLinkedList.display();

            System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");

            // Removes the last Link entered

            theLinkedList.removeFirst();

            theLinkedList.display();

            System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");

            theLinkedList.removeLink("MultiJabberServer Tale of Two Cities");

            System.out.println("\nMultiJabberServer Tale of Two Cities Removed\n");

            theLinkedList.display();

        }






    }