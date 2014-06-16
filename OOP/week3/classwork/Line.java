package OOP.week3.classwork;


/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 11:26.
 * To change this template use File|Settings|File Templates.
 */
final public class Line {
private final char[] value;

    public Line(char[] value){

        this.value = value;
    }



    public  char charAt(int i){
        if (i >= value.length || i < 0){
            return value[i];
        }else {
            System.out.println("Index error");
            return 0;
        }
    }
    @Override
    public java.lang.String toString() {
        java.lang.String  s =  "";

        for (int i = 0;i < value.length;i++){
            s += value[i];
        }
        return s;


    }

}