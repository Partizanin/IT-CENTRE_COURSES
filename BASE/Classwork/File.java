package BASE.Classwork;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:23.12.13
 * Time: 18:38.
 * To change this template use File|Settings|File Templates.
 */
public class File {
    public File(String s) {

    }

    public static void main(String[] args) {
        ar(2);


    }

    public static void ar(int a) {
        int[] arr = {1, 2, 3, 4, 5, 10};
        int half1 = arr.length / 2;
        int half2 = arr.length - half1;

        int sum1 = 0;
        int sum2 = 0;
        int arif1 = 0;
        int arif2 = 0;

        int[] second = new int[half1];


        for (int i = half1; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
            second[i - half1] = arr[i];


        }


        arif2 = sum1 / half1;

        System.out.println("Sum = " + sum1);
        System.out.println("В массиві ");
        ArrayUtils.printArr(second);
        System.out.println("Середнє арефметичне = " + arif2);
    }
}
