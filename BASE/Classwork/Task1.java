package BASE.Classwork;

/**
 * Created with IntelliJ IDEA.
 *User:Partizanin
 *Date:21.12.13
 *Time: 20:49.
 *To change this template use File|Settings|File Templates.
 */
public class Task1 {
    public static void main(String[] args) {
        int c = 45;
        String s = "My name";
        System.out.println(sum(7,c));
        ptintSomeVodrd();
        s.substring(0,3);

    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;

    }
    public static void ptintSomeVodrd(){
        String s = "Hellow World";
        System.out.println(s);
        System.out.println(s.charAt(4));
        System.out.println(s.length());

    }
}
