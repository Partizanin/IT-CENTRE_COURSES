package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 12:15.
 * To change this template use File|Settings|File Templates.
 * <p/>
 * 4.10 Задать два массива случайными числами от 8 до 80. Определить у какого из массива размерность
 * Трико больше.(размерность Трико массива - это количество четных элементов).
 */
public class Task4dot10 {
    public static void main(String[] args) {
        ArryaRandom(5);
    }

    public static void ArryaRandom(int length) {
        Scanner sc = new Scanner(System.in);


        int num = length;

        int[] array1 = new int[num];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (8 + Math.random() * 73);

        }
        ArrayUtils.printArr(array1);


        int[] array2 = new int[num];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (8 + Math.random() * 73);

        }
        ArrayUtils.printArr(array2);

           int a = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 ==0){

          a = +1;
            }

        }
        int b = 0 ;
        for (int i = 0; i < array2.length; i++){
            if(array2[i] % 2 ==0){
                 b = +1;
            }
        }

       if(a > b){
           System.out.println("размерность Трико в масиве № 1 = " + a + "больше чем в масиве №2" );
       }else {
           System.out.println("размерность Трико в масиве № 2 = "  + b + " больше чем в масиве №1 " );
       }



    }
}
