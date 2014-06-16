package BASE.Base2;

import java.util.Scanner;

/**
 * Created by Partizanin on 22.12.13 10:20.
 * 1 KB - 1000 BYTE
 * 1 MB - 1000 KB
 * 1 GB - 1000 MB
 */
public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your variable:");
        int num = sc.nextInt();
        int result = converter(num);
        System.out.println("Your variable = " + result + "MB!!");
    }
    public static  int converter(int a){

     int resMB = a / 1000;
       int resGB = resMB / 1000;



    return resMB;

    }

}
