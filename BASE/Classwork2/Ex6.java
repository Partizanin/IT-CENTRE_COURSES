package BASE.Classwork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:29.12.13
 * Time: 15:49.
 * To change this template use File|Settings|File Templates.
 *
 * Рекурсія
 */
public class Ex6 {
    public static void main(String[] args) {
        ArrRecursive(0);
    }
    public static void  ArrRecursive(int a){
        int[] arr ={1,2,3,4,5,6,7,8,9};

        if(a >= arr.length ){
            return;
        }else{
            System.out.println(arr[a] + " ");
            ArrRecursive( a + 1);
        }


    }
}
