package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:25.12.13
 * Time: 15:13.
 * To change this template use File|Settings|File Templates.
 *
 * 4.3 Найти минимальное и максимальное значения в массиве и поменять местами наибольший
 и наименьший элементы

 */
public class Task4dot3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество елементо в массиве: ");
        int a = sc.nextInt();


        int b = 0 ;
        ArrChangeMaxMin(a,b);
    }



    public static void ArrChangeMaxMin  (int  a,int b){

        Scanner sc = new Scanner(System.in);
        int num = a;
        int[] numbers = new int[num];
        for (int i = b; i < numbers.length; i++) {
            System.out.println("Введите следующее число: ");
            numbers[i] = sc.nextInt();
        }
        ArrayUtils.printArr(numbers);

        int min = numbers [0];
        int max = numbers [0];
        for(int i = 0; i < numbers.length;i++){
            if(min < numbers[i]){
                min = numbers[i];
            }
            if(max > numbers[i]){
                max = numbers[i];
            }
        }


            for(int i = 0; i < numbers.length;i++){

               if(numbers[i] == max){
                   numbers[i] = min;
               }else if(numbers[i] == min){
                   numbers[i] = max;
               }
            }
        System.out.println();
        System.out.println("Max = "+ min);
        System.out.println("Min = "+max);
        System.out.println();
        ArrayUtils.printArr(numbers);





    }

}
