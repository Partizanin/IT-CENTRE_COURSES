package BASE.Classwork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:28.12.13
 * Time: 16:55.
 * To change this template use File|Settings|File Templates.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        String[][] a ={{"abcd"},{"efg"},{"hijklmnop"},{"hijklmnop"},{"hijklmnop"},{"hijklmnop"}};
        printStringMatrix(a);

        printMatrix(matrix);
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
}
