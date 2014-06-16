package OOP.week2.homework;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:27.01.14
 * Time: 16:32.
 * To change this template use File|Settings|File Templates.
 */
public class Number {
    int number;
    double doubnumber;


    public Number(int number){
        this.number = number;
    }

    public Number(double doubnumber){
        this.doubnumber = doubnumber;
    }

    public int Plus(int number2){
       int res = number + number2;
        return res;
    }

    public int Minus(int number2){
        int res = number - number2;
        return res;
    }

    public int Division(int doubnumber2){
        int res = number % doubnumber2;
        return res;
    }

    public  int Factorial(){
        int res = 1;

        for (int i = 1; i <= number; ++i){
            res *= i;
        }

        return res;
    }

    public int Involution(int step){
        int res = number;
        for (int i = 2; i <= step; ++i){
            res *= number ;
        }
        return res;
    }

    public  double Modulo(int num){
       double res = number / num;
        return  res;
    }

    public String toString(){
       String s = Integer.toString(number);
        return s;
    }

    public boolean equals (int number2){
      if (number2 == number) return true;

      else return false;
      }

    }

