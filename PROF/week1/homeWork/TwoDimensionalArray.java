package PROF.week1.homeWork;


/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 30.04.2014
 * Time: 23:11
 * To change this template use File|Setting|File Templates.
 */
public class TwoDimensionalArray {






    public int[][] makeArray(int capacity){
        int num = 0;

        int[][] array = new int[capacity][capacity];

        for (int i = 0; i < capacity;i++) {
            for (int j = 0; j < capacity; j++) {

            array[i][j] = num;
                num++;

            }
        }

        return array;
    }




    public void showArray(int[][] arr){
        System.out.println();


        for(int i = 0;i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }




    }



    public int[][] diagonalCoup(int[][] arr){

        int[][] arrTemp = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                arrTemp[(arr.length -1) - i][(arr.length -1)- j] = arr[i][j];

            }
        }



        return arrTemp;

    }
}
