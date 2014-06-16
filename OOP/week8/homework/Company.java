package OOP.week8.homework;



/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:17.03.14
 * Time:11:08
 * To change this template use File|Settings|File Templates.
 */

public class Company {


    Adres address = new Adres("Ukraine","Kiev","Bratska","6/13");
    String name = "IT-CENTRE";
    ProgEngine pe;


    public Company() {


    }



   public void showAllWorkers() {

        System.out.println("List of workers: ");
        for (Worker worker : pe.list) {
            System.out.println(worker.showWorkerInfo());
        }
    }

   public void addNewWorker(Worker worker) {


        pe.list.add(worker);


       }



    public void changeAddress(Adres address) {

        this.address = address;

    }

    public void showInfo() {

        System.out.println("Address " + address);
        System.out.println("Name: " + name);

    }

}



