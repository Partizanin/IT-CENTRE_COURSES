package OOP.week2.classwork;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:26.01.14
 * Time: 12:45.
 * To change this template use File|Settings|File Templates.
 */
public class Numbers {

     int n1;
    double doubn1;

    public Numbers(int n1){
       this.n1 = n1;

    }

    public void plus(int n2){
     int res =  n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + res + ".");
    }

    public void minus(int n2){
        int res = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = "  + res + ".");
    }

    public void Delite(int n2){
        System.out.println(n1 + " : " + n2 + " = " + n1 / n2 + "." + n1 % n2 + ".");
    }

    public void fact (){
            int res = 1;
        if (n1 < 0){
            System.out.println("You input wrong number");
        }else if (n1 == 0 || n1 == 1){

            System.out.println(res);
        }


            for (int i = 2; i <= n1;i++){
                res *= i;

            }


        System.out.println("Factorial from " + n1 + " is: " + res);
    }

}
