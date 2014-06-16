package OOP.week3.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 13:00.
 * To change this template use File|Settings|File Templates.
 */
public class Rectangle extends Shape {

    final int side1;
    final int side2;

    public Rectangle(int side1,int side2){
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    public double getSquare(){
        double res = side1 * side2;
    return res;
    }
}
