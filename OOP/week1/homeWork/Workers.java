package OOP.week1.homeWork;



/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:21.01.14
 * Time: 11:24.
 * To change this template use File|Settings|File Templates.
 */
public class Workers {

    String name;
    String surname;
    String mobnumber;
    int salary;
    Adress adress;
    String sex;
    int age;
    double worktime;


    public Workers(){

    }

    public Workers(String name,String surname,String mobnumber,int salary,String sex,int age,double worktime){
     this.name = name;
     this.surname = surname;
        this.mobnumber = mobnumber;
        this.salary = salary;
        this.sex = sex;
        this.age = age;
        this.worktime = worktime;




    }



    public String ShoworkerInfo(){
        System.out.println();

        return "Worker name: " + name + "\nSurname: " + surname +
               "\nMobile number: " + mobnumber + "\nSalary: " +
                salary  + "\nSex: " + sex +
                "\nAge: " + age + "\nWorked time: " + worktime + " - Month";



    }




}
