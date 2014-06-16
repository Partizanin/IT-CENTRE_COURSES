package OOP.week4.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 12:40.
 * To change this template use File|Settings|File Templates.
 */
public class TestGroup {
    public static void main(String[] args) {
    Group g = new Group();

        g.AddStudent("Vasa",12,1);
        g.AddStudent("Petya",13,2);
        g.AddStudent("Stas",15,3);
        g.AddStudent("Valera",123,4);

        g.ShowAllStudent();

        g.RemouveStudent(1);
        g.ShowAllStudent();


    }
}
