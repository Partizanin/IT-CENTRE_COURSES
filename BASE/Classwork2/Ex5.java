package BASE.Classwork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:29.12.13
 * Time: 15:34.
 * To change this template use File|Settings|File Templates.
 *
 * Рекурсивне обчислення факторіала
 * 1) Умова руху.
 * 2)Умова виходу.
 *
 *
 *
 */
public class Ex5 {
    public static void main(String[] args) {

       showIndex(7);
    }
    public static int factorial(int n){
       if(n==1){
           return 1;
       }else{
           return factorial(n-1)*n;
       }
    }
    public  static void showIndex(int i){
        if(i == 10){
            return;
        }else{
            System.out.println(i);
            showIndex(i +1);
        }
    }
}
