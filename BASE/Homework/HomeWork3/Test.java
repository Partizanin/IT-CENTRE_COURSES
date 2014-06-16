package BASE.Homework.HomeWork3;

import BASE.Classwork.ArrayUtils;
import BASE.Classwork2.Ex1;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 13:00.
 * To change this template use File|Settings|File Templates.
 */
public class Test {
    public static void main(String args[]) {
        Task3dot11.TurnMatrix(5,90);
      // Task3dot5.ArrayChangeLine(5,5);
       // Task5dot4.Arrshift(10,5);
     //Task3dot6.ArrayLineSearch(10);
     //   int[] a ={1110001010};
       // Task3dot6.ArrayLineSearch(a,10);
       // MorsKoiBoi.Game(5);
    // Test(5,5);
       // Task3dot5.ArrayChangeLine(5,5);
      //  Task3dot9.MatrixMultiply(10);
    }
    public static void Test(int sizeline,int sizecolume){

            int[][] arr = new int[sizeline][sizeline];
            int[] sum = new int[sizecolume];
            int[] sum1 = new  int[sizeline];
            int max = 0;
            int min = 999999999;
            int MaxIndexLine = 0;
            int MinIndexLine = 0;


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = (int) (1 + Math.random() * 100);

                    sum[j] = arr[i][j] + sum[j];
                    sum1[i] = arr[i][j] + sum[i];



                }

            }
        ArrayUtils.printArr(sum);
        System.out.println();
        ArrayUtils.printArr(sum);
            System.out.println();


            for (int i = 0; i < sum.length; i++) {

                if (max < sum[i]) {

                    max = sum[i];

                    MaxIndexLine = i;
                }
                if(sum[i]< min ){

                    min = sum[i];

                    MinIndexLine = i;
                }

            }
            System.out.println("Minindex= "+MinIndexLine);
            System.out.println();
            System.out.println("Maxindex= "+MaxIndexLine);
            System.out.println();
            Ex1.printMatrix(arr);
            System.out.println();




            for (int j = 0; j < arr.length; j++) {
                for (int i = 0;i < arr.length;i++){

                arr[MaxIndexLine][i] = arr[MaxIndexLine][i] + arr[MinIndexLine][i];
                arr[MinIndexLine][i] = arr[MaxIndexLine][i] - arr[MinIndexLine][i];
                arr[MaxIndexLine][i] = arr[MaxIndexLine][i] - arr[MinIndexLine][i];
            }
            }
            Ex1.printMatrix(arr);


        }
    }

