package BASE.Homework.HomeWork2;

import BASE.Classwork.ArrayUtils;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:29.12.13
 * Time: 14:09.
 * To change this template use File|Settings|File Templates.
 */
public class test2 {
    public static void main(String[] args) {
        String a = "Partizаnin";
     //   changeSimbol(a);
       // Yolka(5);
    }


    public static void changeSimbol(String line) {
        char[] symb3 = line.toCharArray();
        int count3 = 0;
        for (int i = 0; i < symb3.length; ++i) {
            if (symb3[i] == 'a')
                symb3[i] = '@';

            if(symb3[i] == 'а')
                symb3[i] = '@';
            if(symb3[i] == 'а')
            symb3[i] = '@';



        }
        System.out.println(symb3);
    }

    public static void Yolka(int size){
       String[][] a = new String[size][size];

        for (int i = 0;i < size;i++){
          for (int j = size;j > 0;j--){
            String s = "*";

             a[i][j-1] = s;
          }

        }
       ArrayUtils.printStringMatrix(a);
    }
}
