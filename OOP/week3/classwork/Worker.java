package OOP.week3.classwork;


/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 13:32.
 * To change this template use File|Settings|File Templates.
 */
public class Worker {


    String name;
    double salary;
    int id;
    Company company;

    void showID() {

        System.out.println("ID " + id);
    }

    void showCompany() {

        System.out.println("Company " + company);
    }

    public String showWorkerInfo() {

        return "Worker name " + name + " salary " + salary + " ID " + id;
    }

    public Worker() {

    }

    public Worker(String name, double salary, int id) {

        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this == null) return false;
        if (obj.getClass() != Worker.class) return false;

        Worker w = (Worker) obj;

        boolean res = this.id == w.id && this.name.equals(w.name);
        return res;


    }
}

