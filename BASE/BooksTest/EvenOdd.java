package BASE.BooksTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:12.02.14
 * Time: 18:41
 * To change this template use File|Settings|File Templates.
 */

public class EvenOdd {

    List even = new ArrayList();
    List odd = new ArrayList();

    int a;
    int b;


    @Override
    public String toString() {
        return "EvenOdd" +
                "even=" + even +
                ", odd=" + odd +
                ", a=" + a +
                "b = " + b ;
    }

    public void shovNumbers(int a,int b){
    for (int i = a; i < b; i++) {
        if (i % 2 != 0) {
          even.add(i);
          /*  System.out.print("Не четные \b" + i + " ");*/


}else{
           odd.add(i);
            /*System.out.print("\bЧетные \b" + i + " ");*/
        }
 if (i == b-1){
     String evenres = even.toString();
     String oddres = odd.toString();
     System.out.print("\nЧетные\n Кільккість " + even.size() + "\n" + evenres);

     System.out.println("\nHe Четные\n Кільккість " +odd.size() + "\n" + oddres);
 }

    }
    }
}