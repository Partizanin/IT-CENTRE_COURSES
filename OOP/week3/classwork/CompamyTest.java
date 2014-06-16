package OOP.week3.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 13:33.
 * To change this template use File|Settings|File Templates.
 */
public class CompamyTest {

    public static void main(String[] args) {

        Company comp = new Company();
        Worker w1 = new Worker("Vasa",300,12);
        comp.addNewWorker(w1);

        Worker w2 = new Worker("Petya",500,11);
        comp.addNewWorker(w2);

        Worker w3 = new Worker("Gala",600,12);

        comp.showAllWorkers();


    }

}
