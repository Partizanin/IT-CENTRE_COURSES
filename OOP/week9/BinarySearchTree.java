package OOP.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 04.04.2014
 * Time: 14:45
 * To change this template use File|Setting|File Templates.
 */
public class BinarySearchTree<T extends Comparable> {

    public class Node<T extends Comparable> {
        T value;
        Node left;
        Node right;

        public Node(T x) {

            this.value = x;
        }


    }
    private int mark = 0;

    Node root;


    private Node<T> find(  Node<T> findNode, T findValue ) {

    /*    *//*public T2 get(T1 k) {
        Node<T1, T2> x = root;
        while (x != null) {
                int cmp = k.compareTo(x.key);
                if (cmp == 0) {
                        return x.value;
                }
                if (cmp < 0) {
                        x = x.left;
                } else {
                        x = x.right;
                }
        }
        return null;
}*//*

        while (findNode != null){

            if (findNode.value.compareTo(findValue) == 0) {

                return findNode;
            }

                if (findNode.value.compareTo(findValue) == 1) {
                    findNode = findNode.left;
                }else if (findNode.value.compareTo(findValue) == -1) {

                   findNode = findNode.right;
                }
        }

        return null;*/
        if (findNode == null) {

            return null;
        }

        if (findNode.value.compareTo(findValue) != 0) {

            if (findNode.value.compareTo(findValue) == 1) {
                return find(findNode.left, findValue);
            }

            if (findNode.value.compareTo(findValue) == -1) {

                return find(findNode.right, findValue);
            }
        }

        return findNode;
    }




    public void add(T addObj){


        try {
            insert(root,addObj);
        }catch (NullPointerException e){
            System.err.println("Root == null");

        }
    }

    public Node insert(Node<T> node, T value) {
        if (root == null) {
            root = new Node<T>(value);
            System.out.println("Корень " + root.value);
            return root ;
        }

        if (node.value.compareTo(value) == 1){
            if (node.left == null){
                node.left = new Node(value);
                System.out.println("Father " + node.value + " left " + value + " right " +
                        "" + node.right.value);
            } else {
                insert(node.left, value);
            }
        }else {
            if (node.right == null ){
                node.right = new Node(value);
                System.out.println("Father " + node.value + " left " + node.left.value + " right " + value);
            }else {
                insert(node.right,value);
            }
        }
        return null;
            }

    private void show_private(Node node){
        if (node == null) return;
        String left = (node.left == null ? "нету" : node.left.value + " ");
        String right = (node.right == null ? "нету" : node.right.value + " ");
        System.out.println("Kopeнь " + node.value + "  Левий ребенок " + left + "  Правий ребенок " + right);
        show_private(node.left);
        show_private(node.right);
    }

    public void showTree(){

        show_private(root);


    }




    /*private BinaryNode remove( Comparable x, BinaryNode t ){
            if( t == null )
                return t;   // Item not found; do nothing
            if( x.compareTo( t.element ) < 0 )
                t.left = remove( x, t.left );
            else if( x.compareTo( t.element ) > 0 )
                t.right = remove( x, t.right );
            else if( t.left != null && t.right != null ) // Two children{
                t.element = findMin( t.right ).element;
                t.right = remove( t.element, t.right );
            }else
                t = ( t.left != null ) ? t.left : t.right;
            return t;
        }*/



    public Node<T>  remove(Node<T> start ,T value){




        if (start == null){
            mark++;
            System.err.println("Element not found");
            return start;
        }

        if (value.compareTo(start.value) < 0){
            start.left = remove(start.left,value);

        }else if (value.compareTo(start.value) > 0){

            start.right = remove(start.right,value);

        }else if (start.left != null && start.right != null){

            Node<T> nodeminValue = min(start.right);

            T minValue = nodeminValue.value;
          /*  start.value = min(start.right).value;*/
            start.value =  minValue;

            start.right = remove(start.right,start.value);
        }else

            start = (start.left != null) ? start.left : start.right;

            return start;



    }

    public Node<T> searchodeValue(Node<T> start,Node<T> findNode){

        while (start != null){

            if (start.value.compareTo(findNode.value) != 0){

                if (start.value.compareTo(findNode.value) == 1){

                    start = start.left;
                }else if (start.value.compareTo(findNode.value) == -1){

                    start = start.right;
                }
            }

            return start;

        }

        return null;
    }



    private Node<T> searchValue(Node<T> start,T findValue){

        while (start != null){

            if (start.value.compareTo(findValue) != 0) {

                if (start.value.compareTo(findValue) == 1){

                    start = start.left;
                }else if (start.value.compareTo(findValue) == -1){

                    start = start.right;
                }
            }else {

                return start;
            }

        }

        return null;
    }



    private String showValue(Node<T> start,Node<T> show){

        while (start != null){

            if (start.value.compareTo(show.value) != 0){

                if (start.value.compareTo(show.value) == 1){

                    start = start.left;
                }

                if (start.value.compareTo(show.value) == -1){

                    start = start.right;
                }
            }else {

                String left = "\nЛевый ребенок = " + (start.left.value == null ? "Нету" :start.left.value);

                String right = "\nПравий ребенок = " + (start.right.value == null ? "Нету" :start.right.value);

                String ret = "Узел = " + start.value + left + right;

                return ret;
            }

        }


        return null;


    }




    public int treeDeep(Node<T> start){

        int maxCount = 0;
        int minCount = 0;
        Node<T> root = start;

        while (start.left != null){
            start = start.left;
            minCount ++;
        }

        start = root;

        while (start.right != null){

            start = start.right;

            maxCount ++;
        }

        return minCount + maxCount;
    }



    public Node<T> max(Node<T> start){


        while (start.right != null){

            start = start.right;
        }

        return start;

    }




    public Node<T> min(Node<T> start){

        while (start.left != null){

            start = start.left;
        }

        return start;
    }







    private void changeLeftRight(Node<T> start){

        Node<T> nodeTemp;
        if (start != null){

            if (start.left != null && start.right != null){

                nodeTemp = start.left;

                start.left = start.right;

                start.right = nodeTemp;
            }
        }else {
            return;
        }

    }






    public void test() throws IOException {
        int selectNum = 03;

        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        Scanner sc = new Scanner(System.in);


     /*   System.out.println("Введите количество цифр в дереве:");

        int howMuch = sc.nextInt();

        for (int i = 0; i < howMuch; i++) {
            bst.add((int) (Math.random() * 1000));
            bst.add((int) (Math.random() * 500));
            bst.add((int) (Math.random() * 100));
            bst.add((int) (Math.random() * 50));
            bst.add((int) (Math.random() * 10));
            bst.add((int) (Math.random() * 5));


        }
        for (int i = 0; i < 5; i++) {


        bst.add(500 - i);
        }
*/



        for (;;) {



            String all = "1 - Добавить \n" +
                         "2 - Удалить\n" +
                         "3 - Найти елемент\n" +
                         "4 - Вивести на екран все елементы\n" +
                         "5 - Вывод елемента из заданого узла\n" +
                         "6 - Проверить глубину\n" +
                         "7 - Найти минимальное и максимальное\n" +
                         "8 - поменять каждого левого ребенка и правого местами\n" +
                         "0 - выход с программы";


            System.out.println();
            System.out.println();
            System.out.println(all);





            if (selectNum == 03){


                try {
                    selectNum = sc.nextInt();
                } catch (NumberFormatException e) {
                    System.err.println("Введите пожалуйста цифру");

                } catch (InputMismatchException e){
                    System.err.println("Введите пожалуйста цифру");
                }

            }





            if (selectNum >=0 && selectNum < 9){

                if (selectNum == 1){
                    int select;

                        for (;;) {
                            System.out.println();
                            System.out.println("Введите обект для добавления в дерево\n\n0 - вернуться в прошлое меню");
                            System.out.println();

                            select = sc.nextInt();
                            if (select != 0){


                            try {

                                bst.add(select);
                            } catch (NumberFormatException e) {
                                System.out.println("Input number");
                            }

                        }else {
                                break;
                            }

                        }



                }

                if (selectNum == 2){
                    Node <T> ret = null;
                    System.out.println("Введите значение которое хоитите удалить");

                    Integer w = sc.nextInt();
                    T value = (T) w ;

               try {
               remove(bst.root,value);
               }catch (NullPointerException e){
                   System.err.println("Element not found");
                   mark = 0;
               }

                    if (mark == 0 ) {
                        System.err.println("Element delete");

                    }


                }

                if (selectNum == 3){

                    System.out.println("Введите искомое значение:");
                    Integer w = sc.nextInt();
                    T value = (T) w ;

                   Node<T> ret = find(bst.root,value);

                    if (ret == null){
                        System.err.println("Not found");
                    }else {
                        String left = (ret.left == null ? "нету" : ret.left.value + " ");
                        String right = (ret.right == null ? "нету" : ret.right.value + " ");



                        System.out.println("Element found");
                        System.out.println("Корень = " + ret.value + "\nЛевый ребенок = " + left +  "\nПравый ребенок = " + right);
                    }




                }

                if (selectNum == 4){

                    bst.showTree();


                }



                if (selectNum == 5){

                    System.out.println("Введите значение узла:");
                    Integer w = sc.nextInt();
                    T value = (T) w ;


                   Node<T> nodeRet = searchValue(bst.root,value);


                    System.out.println(showValue(bst.root,nodeRet));


                }

                if (selectNum == 6){

                    System.out.println("Глубина дерев: " + treeDeep(bst.root));




                }



                if (selectNum == 7){

                    System.out.println();
                    System.out.println("Максимальное значение: " + max(bst.root).value);
                    System.out.println();
                    System.out.println("Минимальное значение: " + min(bst.root).value);




                }

                if (selectNum == 8){

                    BinarySearchTree<Integer> save = bst;


                    int select;


                    for (;;){
                        System.out.println("0 - поменять местами" +
                                " 1 - вернуть прошлое" + " 2 - Вернуться в прошлое меню");
                        select = sc.nextInt();

                        if (select == 0){
                            changeLeftRight(bst.root);
                        }

                        if (select == 1){
                            bst = save;
                        }

                        if (select == 2){

                            break;


                        }



                    }




                }


                if (selectNum == 0){
                    System.exit(0);
                }
                selectNum = 03;

            }else {
                System.err.println("Вы выбрали неправильную цифру\nВиберите заново");

                selectNum = 03;
            }





        }
    }


}


