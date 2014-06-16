package OOP.week1.classWork;




/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:19.01.14
 * Time: 12:25.
 * To change this template use File|Settings|File Templates.
 */

public class Company {

    Worker[] workers = new Worker[100];
    Adress adress;
    int index = 0;

    public Company() {

    }

    public Company(Adress address) {

        this.adress = address;
    }

    void showAllWorkers() {

        System.out.println("List of workers: ");

        for (int i = 0; i < index; i++) {

            System.out.println((i+1) + ". "+ workers[i].showWorkerInfo());
            System.out.println();
        }

    }

   public void addNewWorker(Worker worker) {

        workers[index] = worker;
        index++;

    }

    void changeAddress(Adress address) {

        this.adress = address;

    }

    public void showAddress() {

        System.out.println("Company Address");
        adress.shovAdress();

    }

}
