package OOP.week4.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:08.02.14
 * Time: 12:53.
 * To change this template use File|Settings|File Templates.
 */
public class Employee implements ManInterface {

    boolean yesOrNo;

    @Override
    public boolean getpay(boolean yesOrNo) {
       if (yesOrNo == true){
           System.out.println("I have pay");
       }else
           System.out.println("I don`t have pay");

           return false;
    }

    @Override
    public boolean payTax(boolean yesOrNo) {
        if (yesOrNo == true){
            System.out.println("I payed tax");
        }else
            System.out.println("I don`t payed tax");

        return false;
    }

    @Override
    public boolean goTrip(boolean yesOrNo) {
        if (yesOrNo == true){
            System.out.println("I have a trip");
        }else
            System.out.println("I don`t have a trip");

        return false;

    }
}
