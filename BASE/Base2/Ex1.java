package BASE.Base2;
/**
 * Created with IntelliJ IDEA.
 *User:Partizanin
 *Date:21.12.13
 *Time: 20:33.
 *To change this template use File|Settings|File Templates.
 */

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово для подщета символов:");
     String s = sc.nextLine();


        char [] symb = s.toCharArray();
        int b = 0;
        for(int a = 0;a < symb.length; a++)
            if(symb[a] == 'а');
                        ++b;

        char[] symb3 = s.toCharArray();
        int count3 = 0;
        for(int i = 0; i < symb3.length; i++)
            if(symb3[i] == 'a'&& symb3[i] == 'а')
        ++count3;


        int randomInt = (int)(Math.random() * 20);
        System.out.println("randomInt = " + randomInt);



        System.out.println("В вашему слове: "+ count3 + " букв а!");
        System.out.println("В вашему слове: "+ b + " букв а!");





    }


}
