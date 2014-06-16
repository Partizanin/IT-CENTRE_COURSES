package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 22:52.
 * To change this template use File|Settings|File Templates.
 *
 * 5.1 Инвертировать массив - сделать вывод задом на перед - [1,2,3,4,5] -[5,4,3,2,1]
 */
public class Task5dot1 {
    public static void main(String[] args) {
        int[] a ={12,25,44,53};
        Arrinvert(a);
    }
    public static void Arrinvert(int[] arr){

       int[] arr2= new int[arr.length];
        System.out.println("Array before inver :");
        ArrayUtils.printArr(arr);
        System.out.println();
        System.out.println("Array after invert :");

     for(int i = arr.length - 1; i >= 0 ;i--){

         arr2[i] = arr[i];
         System.out.print(arr[i] + " ");

     }
        System.out.println();
        System.out.println("");



    }
}
