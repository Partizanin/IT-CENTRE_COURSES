package BASE.Classwork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:29.12.13
 * Time: 15:06.
 * To change this template use File|Settings|File Templates.
 *
 * Вивести двомірний массив в парних рядках парні числа в не парних рядках непарні числа
 *
 */
public class Ex4 {
    public static void main(String[] args) {


      arrPar(5);
    }
    public static void arrPar(int length){
        int max = 100;

        int[][] arr = new int[length][length];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr.length;j++){

                if(i % 2 ==0){
                    arr[i][j] = (int) (2 + Math.random() *(max / 2 + 1))*2;
                }
                if(i % 2 !=0){
                    arr[i][j] = (int) (1 + Math.random() *(max / 2 + 1));
                }




    }
        }
        Ex1.printMatrix(arr);
    }
}
