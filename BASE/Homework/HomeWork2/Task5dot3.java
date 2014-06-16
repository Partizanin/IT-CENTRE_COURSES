package BASE.Homework.HomeWork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:02.01.14
 * Time: 17:57.
 * To change this template use File|Settings|File Templates.
 */
public class Task5dot3 {

    public static int gcd(int a, int b) {
        int fi = a;
        int si = b;
        int min;
        int nod = 0;
        if(fi > si)
            min = si;
        else
            min = fi;

        for(int count = 1;count <= min;count++){

        if(fi > si)
            min = si;
        else
            min = fi;
        }
        for(int count = 1;count <= min;count++)
        {
            if(fi % count == 0 && si % count == 0){
                if(count>nod)
                    nod = count;
            }
        }
        return nod;
      /**  if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);
  **/

}
}
