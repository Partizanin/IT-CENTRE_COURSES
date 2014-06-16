package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:26.12.13
 * Time: 12:14.
 * To change this template use File|Settings|File Templates.
 *
 * 4.8 Вывести в консоль элементы той половины одномерного массива у которой
 среднее арифметическое максимальное
 */
public class Task4dot8 {
    public static void main(String[] args) {
      int[] a = ArrayUtils.generateArr(10,100);

      Arr(a);
    }



    public static void Arr(int[] a) {
        int[] arr = a;
        int half1 = arr.length / 2;



        double sum1 = 0;
        double sum2 = 0;
        double arif1 = 0;
        double arif2 = 0;
        int[] first = new int[half1];
        int[] second = new int [half1];


        for (int i = 0; i < half1; i++) {
            sum1 = sum1 + arr[i];
            first[i] = arr[i];

        }
        for (int i = half1; i < arr.length; i++) {
            sum2 = sum2 + arr[i];
            second[i - half1] = arr[i];


        }
        arif2 = sum2 / half1;
        arif1 = sum1 / half1;

        System.out.println("Sum = " + sum1);
        System.out.println("В першій половині  массиву - ");
        ArrayUtils.printArr(first);
        System.out.println("Середнє арефметичне = " + arif1);
        System.out.println();

        System.out.println("Sum = " + sum2);
        System.out.println("В другій половині  массиву ");
        ArrayUtils.printArr(second);
        System.out.println("Середнє арефметичне = " + arif2);
        System.out.println();

        if(arif1 > arif2){
            System.out.println("В першій половині  массиву ");
            ArrayUtils.printArr(first);
            System.out.println("середнє арефметичне " + arif1 + " більше ніж в другій!");
        }else{
            System.out.println("В другій половині  массиву ");
            ArrayUtils.printArr(second);
            System.out.println("середнє арефметичне "+ arif2 + " більше ніж в першій!");
        }
    }


}
