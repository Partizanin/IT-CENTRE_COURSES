package BASE.Homework.HomeWork1;

/**
 * Created with Intellij IDEA.
 *User:Partizanin
 *Date:15.12.13
 *Time: 21:00.
 *To change this template use File|Settings|File Templates.
 */
public class Main {
    public static void main(String[] args) {

        int value1 = 87;
        int value2 = 12;
        int result = (value1 * value2) /2;
        boolean b1 = true;
        boolean b2 = value1 <= value2;

        String s = "Ilia";
        String s1 = " Word" + " Value";

        double d = 0.1;
        double d1 = value1 / d;


        String s2 = s +s1;
        System.out.println("String value " + s2 + "value " + result);
        System.out.println(result);

        if (value1 <= value2){
            System.out.println("if block - true: " + value1 + " <= " + value2);

        }else if (value1 == 85){
            System.out.println("else bloc  false");
        }



    }
}
