package PROF.week1.homeWork;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 10:53
 * To change this template use File|Setting|File Templates.
 */
public class MaxPartOfArray {

    public static void main(String[] args) {

        showMaxPart(createArre());

    }


    public static int[]  createArre(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество елементов в масиве");

        int howMuch = sc.nextInt();
        int[] arr = new int[howMuch];
        int num,num1;

        for (int i = 0; i < howMuch; i++) {

            num = (int) (1 + Math.random() * 10);
            num1 = (int) (10 + Math.random() * 100);


            if (i%2 == 0){

                arr[i] = num;
            }else {
                arr[i] = num1;
            }

        }

        return arr;
    }


    public static void showMaxPart(int[] arr){
        int res1 = 0;
        int res2 = 0;

        for (int i = arr.length -1; i >=(arr.length / 2) ; i--) {

            res2 += arr[i];

        }

        for (int i = 0; i < (arr.length / 2); i++) {

            res1 += arr[i];

        }

        res1 = res1/(arr.length/2);
        res2 = res2/(arr.length/2);
        System.out.println("Среднее арефметическое масива от 0 до " + (arr.length/2) + " = " + res1 + "\n" +
                "Среднее арефметическое масива от " + (arr.length/2) + " до " + arr.length + " = " + res2);

        if (res1 > res2){

            for (int i = 0; i < (arr.length / 2); i++) {
                System.out.println(arr[i]);
            }

        }else {

            for (int i = arr.length -1; i >=(arr.length / 2) ; i--) {

                System.out.println(arr[i]);
            }
        }

    }

}
