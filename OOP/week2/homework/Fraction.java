package OOP.week2.homework;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:30.01.14
 * Time: 20:14.
 * To change this template use File|Settings|File Templates.
 */
public class Fraction {

  double n1;
    public Fraction(double n1){
        this.n1 = n1;
    }

    public double plus(double n2){
       double res = n1 + n2;
        return res;
    }

    public double minus(double n2){
        double res = n1 - n2;
        return res;
    }

    public  double myltipaly(double n2){
        double res = n1 * n2;
        return res;
    }

    public double division(double n2){
        double res = n1 / n2;

        return res;
    }

    public String line(){
        String res = Double.toString(n1);
        return res;
    }

    public void display(){
        System.out.println(n1);
    }


}
