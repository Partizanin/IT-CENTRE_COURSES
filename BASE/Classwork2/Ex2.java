package BASE.Classwork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:28.12.13
 * Time: 17:02.
 * To change this template use File|Settings|File Templates.
 */
public class Ex2 {
    public static void main(String[] args) {
        int[][] a =randomArr(4);

       Ex1.printMatrix(a);
        ArrMaxMin(a);
    }

    public static  int[][] randomArr(int length) {
        int[][] arr = new int [length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;



    }


    public static void ArrMaxMin(int[][] arr) {

        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                    if(min < arr[i][j]){
                        min = arr[i][j];
                    }
                    if(max > arr[i][j]){
                        max = arr[i][j];
                    }
            }
                }
                for(int i = 0; i < arr.length;i++){
                    for (int j = 0; j < arr[i].length; j++) {

                    if(arr[i][j] == max){
                        arr[i][j] = min;
                    }else if(arr[i][j] == min){
                        arr[i][j] = max;
                    }
                }
                }
        System.out.println();
        System.out.println("Max = " + max );
        System.out.println("Mai = " + min);
        System.out.println();
        Ex1.printMatrix(arr);
    }

    }

