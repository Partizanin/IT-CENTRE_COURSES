package OOP.week2.homework;

import BASE.Classwork.ArrayUtils;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:27.01.14
 * Time: 16:43.
 * To change this template use File|Settings|File Templates.
 */
public class Test {
    public static void main(String[] args) {
        Number n = new Number(10);


        int plus = n.Plus(5);
        int minus = n.Minus(4);
        int division = n.Division(4);
        int fact =  n.Factorial();
        double modulo = n.Modulo(5);
        int invol = n.Involution(5);
        String num = n.toString();
        boolean equals = n.equals(10);


       /* System.out.println("Plus is: " + plus);
        System.out.println("minus is: " + minus);
        System.out.println("division is: " + division);
        System.out.println("factorial is: " + fact);
        System.out.println("modulo is: " + modulo);
        System.out.println("Involution is: " + invol);
        System.out.println("toStinrg is: " + num);
        System.out.println("equals is: " + equals);
*/



       Array a = new Array(10);
  int arr[] = a.randomArr();
        /*ArrayUtils.printArr(arr);
        ArrayUtils.printArr(a.sizePlus(1));
*/
      int[] res = a.arrSort(arr);
       /*a.printArr();
        System.out.println();
        ArrayUtils.printArr(res);*/


Fraction f = new Fraction(0.39);

        double pl = f.plus(0.56);
        double min  = f.minus(0.29);
        double mylti = f.myltipaly(0.350);
        double div = f.division(0.15);
        String line = f.line();
       // f.display();

        System.out.println("Plus: " + pl + "\nMinus: " + min + "\nMyltiplay: " +  mylti + "\nDivision: " + div + "\nLine: " + line);
        System.out.printf("Myltiplay: " + "%.f2", mylti);

        Line line1 = new Line();

      //  line1.display();

        String concat = line1.concat();
        String lowCase = line1.Downcase();

       // String lineSearch = line1.LineSearch("Hellow","Hellow");

        //System.out.println(lineSearch);




    }

}
