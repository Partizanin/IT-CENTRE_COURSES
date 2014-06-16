package OOP.week3.homework;


/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:06.02.14
 * Time: 15:31.
 * To change this template use File|Settings|File Templates.
 */
public class DOfficeTest {
    public static void main(String[] args) {


    DentalOffice den = new DentalOffice();

    Patient p1 = new Patient("Pasha",12,4,200);
    Patient p2 = new Patient("Vasa",14,5,250);
    Patient p3 = new Patient("Petya",13,7,350);

        den.addNewPatient(p1);
        den.addNewPatient(p2);
        den.addNewPatient(p3);


        den.ShowAgeList();



}
}