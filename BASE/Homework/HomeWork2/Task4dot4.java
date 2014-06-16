package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 12:13.
 * To change this template use File|Settings|File Templates.
 *
 * 4.4 Заданы два массива одинаковой длинны с любыми значениями
 скопировать данные из первого массива во второй
 */
public class Task4dot4 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        ArrCopy(a);
    }

    public static void ArrCopy(int arr1 []){
      int[] arr2 = new int[arr1.length];
        System.out.println("HashCode arr1 "+arr1.hashCode());
        System.out.print("Arr1 = ");
        ArrayUtils.printArr(arr1);
        System.out.println();
        for(int i = 0;i < arr1.length;i++){
           arr2[i] =  arr1[i];
        }
        System.out.println("HashCode arr2 "+arr2.hashCode());
        System.out.print("Arr1 = ");
        ArrayUtils.printArr(arr2);

    }
}



/**    int[] a={1,2,3,4,5,6,7,8,9,0};
 System.out.println("hash массива a " + a.hashCode());
 for (int i=0;i<a.length;i++)
 System.out.print(a[i] + " ");

 System.out.println();

 int[] b=a;
 System.out.println("hash массива b " + b.hashCode());
 for (int k=0;k<b.length;k++)
 System.out.print(b[k] + " ");
 **/
