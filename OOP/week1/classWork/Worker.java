package OOP.week1.classWork;


/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:19.01.14
 * Time: 12:22.
 * To change this template use File|Settings|File Templates.
 */

public class Worker {

    String name;
    double salary;
    int id;
    Company company;


    void showID(){

        System.out.println("ID " + id);
    }

    void showCompany(){

        System.out.println("Company " + company);
    }

    public  String showWorkerInfo(){
        System.out.println();
        return "Worker name: " + name + "\n   Salary: " + salary + "$" + "\n   ID: " + id;

    }

    public Worker(){

    }
    public Worker(String name, double salary, int id){

        this.name = name;
        this.salary = salary;
        this.id = id;
    }
}
