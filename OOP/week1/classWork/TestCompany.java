package OOP.week1.classWork;



/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:19.01.14
 * Time: 13:24.
 * To change this template use File|Settings|File Templates.
 */

public class TestCompany {
    public static void main(String[] args) {
        Company company = new Company();
        Adress adress = new Adress("Ukraine","Kiev","Bogdana");
        company.adress = adress;


        Worker worker1 = new Worker("Masha",3800,1);
        worker1.company = company;
        company.addNewWorker(worker1);

        Worker worker2 = new Worker("Petya",1000,2);
        company.addNewWorker(worker2);

        Worker worker3 = new Worker("Vasa",2000,3);
        company.addNewWorker(worker3);

        Worker worker4 = new Worker("Dasha",3000,4);
        company.addNewWorker(worker4);

        Worker worker5 = new Worker("Max",4000,5);
        company.addNewWorker(worker5);

        Worker worker6 = new Worker("Oleg",5000,6);
        company.addNewWorker(worker6);

        Worker worker7 = new Worker("Kolia",6000,7);
        company.addNewWorker(worker7);

        Worker worker8 = new Worker("Stas",700,8);
        company.addNewWorker(worker8);

        Worker worker9 = new Worker("Ivan",8006,9);
        company.addNewWorker(worker9);

        Worker worker10 = new Worker("Dima",6546,10);
        company.addNewWorker(worker10);





        company.showAddress();
        company.showAllWorkers();
    }
}

