package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 12:14.
 * To change this template use File|Settings|File Templates.
 *
 * 4.9 Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива
 который получается в результате суммы arr1[i] + arr2[i]
 */
public class Task4dot9 {
    public static void main(String[] args) {
        ArraySum(5,5);
    }


    public static void ArraySum(int arr1length,int arr2length){
        Scanner sc = new Scanner(System.in);

        int arr1 = arr1length;
        int[] numbers1 = new int[arr1];
        int arr2 = arr2length;
        int[] numbers2 = new int[arr2];
        int[] numbers3 = new int[arr1];

        if(arr1length == arr2length){
            for (int i = 0; i < numbers1.length; i++) {
                System.out.println("Введите следующее число: ");
                numbers1[i] = sc.nextInt();
            }
            for(int i = 0;i <numbers2.length;i++){
                System.out.println("Введите следующее число: ");
                numbers2[i] = sc.nextInt();

            }

        }else{
            System.out.println("Длинна масивов не может быть разной!!!");
        }

        for(int i = 0;i < numbers1.length; i++){
           numbers3[i] = numbers2[i] + numbers1[i];
        }
        System.out.println("Array number 1");
        ArrayUtils.printArr(numbers1);
        System.out.println("Array number 2");
        ArrayUtils.printArr(numbers2);
        System.out.println("Result");
        ArrayUtils.printArr(numbers3);









}
}
