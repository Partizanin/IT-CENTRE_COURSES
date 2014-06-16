package BASE.Base2;import java.lang.String;import java.lang.System;import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *User:Partizanin
 *Date:21.12.13 8:09
 *Time: 20:36.
 *To change this template use File|Settings|File Templates.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();

        int res = countA(s);
        System.out.println("count a = " + res);
    }
    public static int countA(String str){
      int res = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                res++;
            }

        }
        return res;

    }
}
