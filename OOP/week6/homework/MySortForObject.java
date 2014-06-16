package OOP.week6.homework;



import BASE.Classwork.ArrayUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name:Ex
 * User:Home
 * Date:18.02.14
 * Time:11:49
 * To change this template use File|Settings|File Templates.
 */
public class MySortForObject {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        int[] arr ={40,30,20,10,5};

        /*ArrayUtils.printArr(insertionSort(arr));*/
        System.out.println("Before");
        ArrayUtils.printArr(arr);
        System.out.println("After");
        System.out.print("Insert ");
        ArrayUtils.printArr(insertionSort(arr));
        System.out.print("Quick  ");
        ArrayUtils.printArr(quickSort(arr, 0, arr.length - 1));





        ArrayList<Integer> array = new ArrayList<Integer>(1);



       /* arrayGen(array,10);
        System.out.println(array);
        Sort(array);
        System.out.println(array);*/

    }


    public static int[] insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int currElem = arr[i];                //Значення поточного елемент
            int prevKey = i - 1;                  //Індекс попереднього елементу
            while(prevKey >= 0 && arr[prevKey] > currElem){  //Якщо індекс попереднього елементу більше або дорівнює нулю і значення попереднього елементу більше поточного то вони міняються місцями
                arr[prevKey+1] = arr[prevKey]; //поточний елемент дорівнює попередньому
                arr[prevKey] = currElem; //попередній елемент дорівнює поточному
                prevKey--; //від Індексу  попереднього елементу віднімається одиниця
                          //Операція повторюється доти доки індекс попереднього елементу не стане -1 тоді фор запуститься знову і індекс буде вже + 1
            }
        }
        return arr;
    }


   public static int[] quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
     
            return arr;
    }

    static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }





 public static ArrayList<Integer> arrayGen(ArrayList<Integer> arr,int size){

     for (int i = 0; i < size; i++) {

         Integer num = (int)(Math.random() * 100);

         arr.add(i,num);

     }
     return arr;
 }



    public static List<Integer> Sort(List<Integer> arr){


        for (int i = 0; i < arr.size(); i++) {

            int curElem = i;
            Integer curEleme = arr.get(i);
            int prevKey = i -1;

            while (prevKey >= 0 && arr.get(prevKey) > curEleme){

                arr.set(prevKey + 1,arr.get(prevKey));
                arr.set(prevKey,curEleme);
                prevKey --;




            }

        }
        return arr;

}
}

