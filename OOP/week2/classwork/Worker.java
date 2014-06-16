package OOP.week2.classwork;

/**
 * Created with IntelliJ IDEA.
 *User:partizanin
 *Date:25.01.14
 *Time: 18:48.
 *To change this template use File|Settings|File Templates.
 */
public class Worker extends Man {
  private   double salary;
  private   String position;

    public Worker(){

        System.out.println("In worker constructor");
    }

    public void work(){
        go();
        System.out.println("I`m working,my age " + age + "\nMy salary is " + salary);
    }

    public void go(){
        System.out.println("Im worker");
    }


    public void setSalary(double salary){
        if (salary > 500 && salary < 3000){
            this.salary = salary;
            System.out.println("My salary is : " + salary);

        }else {
            System.out.println("this,salary wrong!");
        }

    }

    public String toString(){
        return "Salary: "+ salary + "\nPosition: " + position;
    }

    public  double getSalary(){
        return salary;
    }

}
