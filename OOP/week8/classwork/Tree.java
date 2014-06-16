package OOP.week8.classwork;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:23.03.2014
 * Time:12:14
 * To change this template use File|Settings|File Templates.
 */
public class Tree{

    private class Node{
        int obj;
        Node left;
        Node right;


    }

    Node root;


    public void add(int addObj){
        for(Node start = root;start != null;)

            if (start.obj > addObj){
                if (start.left != null){
                    start = start.left;
                }else {
                    start.left.obj = addObj;
                }
            }else {

                if (start.right != null){
                    start = start.left;
                }else {
                    start.right.obj = addObj;
                }
            }

    }



    public void showtree(){

    }

    public static void main(String[] args) {
        Tree t = new Tree();

        t.add(100);
        t.add(90);
        t.add(901);
        t.add(10);




        }
    }

