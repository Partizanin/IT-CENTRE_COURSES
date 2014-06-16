package OOP.week3.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 12:40.
 * To change this template use File|Settings|File Templates.
 */
public class Triangle extends Shape {

   final int side1;
   final int side2;

    public Triangle(int side1,int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSquare() {
        return (side1 * side2) / 2;
    }





}
