package BASE.Base2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *User:Partizanin
 *Date:21.12.13
 *Time: 20:38.
 *To change this template use File|Settings|File Templates.
 */
public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int a = sc.nextInt();
           int c;

        c = a % 2 ;
        if(c == 0 ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
