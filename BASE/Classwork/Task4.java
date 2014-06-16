package BASE.Classwork;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *User:Partizanin
 *MyDate:22.12.13 15:45
 *Time: 18:37.
 *To change this template use File|Settings|File Templates.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {56,66,22,56,554,486,654,35984,315,65,55};
        ArrayUtils.printArr(a);
        ArrayUtils.showMaxMin(a);
        System.out.println("Input length of array ");
        int length = sc.nextInt();
        System.out.println("Input rang of array");
        int range = sc.nextInt();
       int [] arr = ArrayUtils.generateArr(length,range);

        ArrayUtils.printArr(arr);

    }
}
