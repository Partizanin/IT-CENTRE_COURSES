package BASE.Homework.HomeWork1;
/**
 * Created with Intellij IDEA.
 *User:Partizanin
 *Date:15.12.13
 *Time: 21:01.
 *To change this template use File|Settings|File Templates.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {

 public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws Exception{

        searchMax1();

    }

    public static void serchMax2(int d,int e, int f){
        int a = d;
        int b = e;
        int c = f;
        int result = a * b;
        if(a < b && a < c){
            System.out.println("min = " + a);
        }else if(b < a && b < c){
            System.out.println("min = " + b);
        }else if(c < a && c < b){
            System.out.println("min = " + c);
        }

        if(a > b && a > c){
            System.out.println("max = " + a);
        }else if(b > a && b > c){
            System.out.println("max = " + b);
        }else if(c > a && c > b){
            System.out.println("max = " + c);
        }

        if(result < c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }





    }

    public static void searchMax1() throws IOException {

        System.out.println("Input range of numbers ");
        int range = Integer.parseInt(reader.readLine());
        int[] arr = new int[range];
        int max = arr[0];
        int min = arr[0];
        int currentNum;
        for (int i = 0; i < range ; i++) {

            System.out.println("Input next number");
            currentNum = Integer.parseInt(reader.readLine());
            arr[i] = currentNum;
            if (max < currentNum){

                max = currentNum;
            }

            if (min > currentNum){

                min = currentNum;
            }

            if ( i == range - 1){
                System.out.println("Max = " + max);
                System.out.println("Min = " + min);
            }
        }

    }
}
