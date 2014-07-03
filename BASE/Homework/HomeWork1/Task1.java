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
        int result = d * e;
        if(d < e && d < f){
            System.out.println("min = " + d);
        }else if(e < d && e < f){
            System.out.println("min = " + e);
        }else if(f < d && f < e){
            System.out.println("min = " + f);
        }

        if(d > e && d > f){
            System.out.println("max = " + d);
        }else if(e > d && e > f){
            System.out.println("max = " + e);
        }else if(f > d && f > e){
            System.out.println("max = " + f);
        }

        if(result < f){
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
