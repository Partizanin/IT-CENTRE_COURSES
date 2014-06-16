package OOP.week3.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 12:23.
 * To change this template use File|Settings|File Templates.
 */
public class Square extends Shape {

    private int  side;

    public  Square (int side){
        this.side = side;
    }


    @Override
    public double getSquare() {
        return side * side;
    }



}
