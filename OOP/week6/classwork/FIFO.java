package OOP.week6.classwork;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:01.03.14
 * Time:13:40
 * To change this template use File|Settings|File Templates.
 */
public class FIFO {
   Object[] mas = new Object[6];

    int first;
    int last;

    public void push (Object o){



       mas[first] = o;

        last = first -(last + 1);
        first++;

    }

    public Object pop(){

        Object ret = mas[first -1];
        mas[first -1] = null;
        last--;
        first--;

        return ret;
    }

    public void showFIFO(){

        for (int i = 0; i < mas.length -1 ; i++) {

            System.out.println(mas[i] + " ");

        }
    }

}
