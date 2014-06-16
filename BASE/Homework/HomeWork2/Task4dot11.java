package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 12:15.
 * To change this template use File|Settings|File Templates.
 *
 * 4.11
 public static int[] splitArray(int[] arr, int autorization, int end) { // обрезать массив по границам autorization и end
 }
 */
public class Task4dot11 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = 10;
       ArrayUtils.printArr(splitArray(a,start,end));
    }

    public static int[] splitArray(int[] arr, int start, int end) {

        int[] result = new int[end-start];

      for(int i = start;i < end;i++){

         result[i-start] = arr[i];
      }


        return result;
    }


}
