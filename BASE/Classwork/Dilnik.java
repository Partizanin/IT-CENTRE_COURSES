package BASE.Classwork;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *User:Partizanin
 *Date:21.12.13
 *Time: 20:47.
 *To change this template use File|Settings|File Templates.
 */
public class Dilnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        dilnik(a,b);

    }

    public static void dilnik(int a,int b){

      int c = a%b;
        if(c == 0 && a > b){
            System.out.println("Найменший Спільний дільник = " + a);

        }else{
            int d = b%a;
            if(d == 0 && b > a){
                System.out.println("Найменший Спільний дільник = " + b);

        }



    }
    }
}

