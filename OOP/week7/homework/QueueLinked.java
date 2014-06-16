package OOP.week7.homework;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:07.03.14
 * Time:12:22
 * To change this template use File|Settings|File Templates.
 */
public class QueueLinked <T> {

    protected class Node{
        public T getObj() {
            return obj;
        }

        private   T obj;

        public Node getNext() {
            return next;
        }

        private Node next;
    }


    public Node getFirst() {
        return first;
    }

    private Node first;
    private Node last;

    public void push(T t){

        Node newTop = new Node();

        newTop.obj = t;

        newTop.next = first;

        first = newTop;
        }



    public T pop(){
        T t = first.obj;
        first = first.next;

        return t;
    }


    public void showList(){
        System.out.println();

        for (Node f = first; f != null;f = f.next){

            if (f.obj != null){

            System.out.println(f.obj.toString());

            }
        }
        System.out.println();
    }

    public void addToStart(T t){

        Node newHead = new Node();

        newHead.obj = t;

        if (first == null){

            first = newHead;
            last = newHead;
        }else {

            newHead.next = first;
            first = newHead;

        }
        }

    public T  popFromHead(){

        T ret = null;

        for (Node f = first; f != null;f = f.next){

            ret = f.obj;

        }
        for (Node f = first; f != null;f = f.next){

            if (f.next == null){


                f.obj = null;

            }

        }

        return ret;
    }




    public boolean isEmpty(){
        return (first == null);
    }

    public T searchInputElement (T t){

            Node theLink = first;


        if (!isEmpty()){

            while( theLink.obj != t )


                if (theLink.next == null){
                    return null;
                }else {

                    theLink = theLink.next;


                }






        }


        System.out.println("Empty List");

        return (T) theLink.obj;
    }

    public void changeFirstAndLastElement(){

        T lastel = null;
        T firsel = first.obj;
        T tempel;

       Node previous = null;

        for (Node f = first; f != null;f = f.next){

            if (f.next != null){

                lastel = f.obj;
                previous = f;

            }


        }

        tempel = lastel;

        first.obj = tempel;

        previous.obj = firsel;



        showList();

    }

    public void changeMaxMin(){

        T max = first.obj;
        T min = first .obj;
        T temp;
        Node maxN = first;
        Node minN = first;
        Node tempN;

        for (Node f = first; f != null;f = f.next){

           /*if (f.getObj() > f.next.getObj())*/



    }




}
}


