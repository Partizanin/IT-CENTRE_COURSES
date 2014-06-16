package BASE.Homework.HomeWork3;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:33.
 * To change this template use File|Settings|File Templates.
 *
 * 3.6. Нули
 !! Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.

 Вход:
 10001101001

 Выход:
 2
 5
 *
 */
public class Task3dot6 {



    public static void main(String[] args) {
                  //012345678
        String s = "1111111000000010100011";
        ArrayLineSearch0(s);
        ArrayLineSearch1(s);
    }
    public static void ArrayLineSearch0(String s){
   String[] arr0 = s.split("1");
   String max0 = arr0[0];
   int count = 0;
   int max = 0;

   for (int i = 0;i < arr0.length;i++){
       if (max < arr0[i].length()){
             max = arr0[i].length();
             max0 = arr0[i];

       }


   }
        System.out.println(s.indexOf(max0) + 1);
    }


    public static void ArrayLineSearch1(String s){
     String[] arr1 = s.split("0");
     String max= arr1[0];
        int max1 = 0;
        for (int i = 0;i < arr1.length;i++){
            if (max1 < arr1[i].length()){
               max = arr1[i];
               max1 = arr1.length;
            }
        }
        System.out.println();
        System.out.println(s.indexOf(max ) + 1);
    }

}
