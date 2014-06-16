package OOP.week3.classwork;


import java.util.ArrayList;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 13:32.
 * To change this template use File|Settings|File Templates.
 */
public class Company {


    ArrayList<Worker> workers = new ArrayList<Worker>();
    Adres address;
    int index = 0;

    public Company() {

    }

    public Company(Adres address) {

        this.address = address;
    }

    void showAllWorkers() {

        System.out.println("List of workers: ");
        for (Worker worker : workers) {
            System.out.println(worker.showWorkerInfo());
        }
    }

    void addNewWorker(Worker worker) {

        workers.add(worker);

    }

    void changeAddress(Adres address) {

        this.address = address;

    }

    public void showAddress() {

        System.out.println("Address ");
      //  address.tellAdr();

    }

}



