package OOP.week3.homework;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:06.02.14
 * Time: 10:22.
 * To change this template use File|Settings|File Templates.
 */
public class Patient {
    String name;
    int age;
    int numOfCalls;
    int pay;


    public Patient(){

    }

    public Patient(String name,int age,int numOfCalls,int pay){
        this.name = name;
        this.age = age;
        this.numOfCalls  = numOfCalls;
        this.pay = pay;
    }

public String ShowPatientInfo(){

    return "Name: " + name + "\n\t\t\t\tAge: " + age + "\n\t\t\t\tNumOfCalls: " + numOfCalls + "\n\t\t\t\tPay: " + pay;

}


}
