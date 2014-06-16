package BASE.Classwork;

/**
 * Created by Partizanin on 22.12.13 15:43.
 * Ctrl+Alt+L-format code style
 */
public class ArrayUtils {
    public static void printArr(int[] mas) {
        for (int i = 0; i < mas.length; i++) {

            System.out.print(mas[i] + " ");
        }
        System.out.println();

    }

    public static void showMaxMin(int[] mas) {
        int min = mas[0];
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }

            if (min > mas[i]) {
                min = mas[i];
            }

        }
        System.out.println("min = " + min + "\nmax = " + max);
    }

    public static int[] generateArr(int length, int range) {
        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range);
        }
        return mas;
    }

    public static void printArrparne(int length, int range) {
        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i++) {
            int ran = (int) (Math.random() * range);
            if (ran % 2 == 0) {
                mas[i] = ran;
            } else {
                mas[i] = ++ran;
            }

        }


    }

    public static void ArrStep(int length) {
        int a;
        for (int i = 0; i < length; i++) {
     //       a = length[i] * a;
        }
   //     return a;

    }


    public static void printMatrix(int[][] matrix){
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0; j <matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void printStringMatrix(String[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length;j++){

                System.out.print(mas[i][j] + " ");


            }
            System.out.println();

        }


    }

    public static void printArrString(String[] a){
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i] + " ");
        }


    }

}

