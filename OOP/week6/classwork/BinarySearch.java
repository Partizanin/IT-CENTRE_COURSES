package OOP.week6.classwork;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:02.03.14
 * Time:12:00
 * To change this template use File|Settings|File Templates.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        /*{9,2,1,4,5,3,8,6,7,10}*/

        /*{1,2,3,4,5,6,7,8,9,10}*/
        System.out.println(search(arr, 2));
    }

    public static int search(int[] mas,int value){
        int middle;
        int start = 0;
        int end = mas.length;


        while (start != end){
           middle = (end + start)/2;

            if (mas[middle] == value){

                return middle;

            }

            if (mas[middle] > value ){

                end = middle;
            }else {
                start = middle;
            }
        }

        return -1;
    }
}
