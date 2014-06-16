package BASE.Classwork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:28.12.13
 * Time: 18:56.
 * To change this template use File|Settings|File Templates.
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, …
 */
public class Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        fib(Integer.parseInt(reader.readLine()));

    }

    /**
     *
     * @param length -number of end
     * return numbers fibona4i
     * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, …
     * 1 1 1 3 5 9
     */
    public static void fib(int length){
        int fib;
        int previousNum = 0;
        int next = 0;
        int previoussNum = 1;

      for(int i = 0; i <= length;i++){

          fib = next + previousNum + previoussNum;

          System.out.println(fib + " ");

          previoussNum = previousNum;

          previousNum = next;

          next = fib;
      }
    }
}
