package OOP.week7.homework;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:06.03.14
 * Time:16:42
 * To change this template use File|Settings|File Templates.
 */
public class QueueArr {
 private int[] arr;
    int sizeElement;


    public int getSizeElement(){
        return sizeElement;
    }




    QueueArr(int size){

     arr = new int[size];

    }



    QueueArr(){

        arr = new int[10];

    }



    public void addEl(int el){

        if (arr.length > sizeElement){
        arr[sizeElement] = el;
        sizeElement ++;
        }else if (arr.length <= sizeElement){
            arr = Arrays.copyOf(arr,(sizeElement * 3) / 2 +1);//(oldCapacity * 3) / 2 + 1
            arr[sizeElement] = el;
            sizeElement ++;
        }
    }

    public void addToIndex(int obj,int index){

    System.arraycopy(arr,index,arr,index + 1, sizeElement - index);    //System.arraycopy(elementData, index, elementData, index + 1, size - index);

        arr[index] = obj;
        sizeElement++;

    }


    public void addElToStart(int el){




    }

    public int getFirstElement(){
        return arr[0];
    }


    public int searchElement(int value){

        for (int i = 0;i < sizeElement;i++){

            if (arr[i] == value){
                return arr[i];
            }




        }
        return Integer.parseInt(null);
    }


    public void changeElements(){

        int firstEl;

        int lastEl;


        firstEl = arr[0];

        lastEl = arr[sizeElement];


        arr[0] = lastEl;

        arr[sizeElement] = firstEl;


      }

    public void changeMaxMin(){
        int max = arr[0];
        int min = arr[0];

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0;i < sizeElement;i++){

            if ( max < arr[i] ){
                max = arr[i];
                maxIndex = i;
            }

            if (min > arr[i] ){
                min = arr[i];
                minIndex = i;
            }

        }

        arr[maxIndex] = min;
        arr[minIndex] = max;

    }


    public void sort(){
        System.out.println(Arrays.toString(arr));
        System.out.println();

            for (int j = 0; j < sizeElement -9;j++){

                if (arr[j + 1] < arr[j]){
                int tempvalue1 = arr[j + 1];
                int tempvalue2 = arr[j];

                arr[j] = tempvalue1;
                arr[j + 1] = tempvalue2;


            }


        }



        System.out.println(Arrays.toString(arr));



    }

    public void backOrder(){

        System.out.println();
        for (int i = 0; i < sizeElement * 2 ; i++) {

        for (int j = 0; j < sizeElement -1; j++) {

            if (arr[j + 1] > arr[j]){
                int tempvalue1 = arr[j + 1];
                int tempvalue2 = arr[j];

                arr[j] = tempvalue1;
                arr[j + 1] = tempvalue2;


            }


        }
        }
        System.out.println(Arrays.toString(arr));

}
    public void fullSort(){
        System.out.println();
        for (int i = 0; i < sizeElement * 2 ; i++) {

            for (int j = 0; j < sizeElement -1; j++) {

                if (arr[j + 1] < arr[j]){
                    int tempvalue1 = arr[j + 1];
                    int tempvalue2 = arr[j];

                    arr[j] = tempvalue1;
                    arr[j + 1] = tempvalue2;


                }


            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public void printArray(){

        for (int i = 0; i <sizeElement ; i++) {

            System.out.println(arr[i]);

        }
    }

    public void removeRepeatElements(){

        System.out.println();
        for (int i = 0; i < sizeElement * 2 ; i++) {


            for (int j = 0; j < sizeElement -1; j++) {
                int searchEl = arr[j + 1];

                if (arr[j] == searchEl){

                      arr[j] = 0;

                }


            }
        }
        System.out.println(Arrays.toString(arr));

    }

    }


