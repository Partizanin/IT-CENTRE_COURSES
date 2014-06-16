package OOP.week8.homework;


import java.io.Serializable;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:17.03.14
 * Time:11:08
 * To change this template use File|Settings|File Templates.
 */
public class Worker implements Serializable {

    String name;
    String surname;
    int age;
    double salary;
    int id;
    String country;
    String city;
    String street;
    String house;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }



    public Worker() {

    }

    public Worker(String name,String surname,int age,double salary, int id,String country,String city,String street,String house) {

        this.surname = surname;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.age = age;
    }

    public Worker(String name,String surname,int age,double salary,String country,String city,String street,String house) {

        this.surname = surname;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }




    public String showWorkerInfo() {

        return "Worker name " + name + " age " + age + " salary " + salary + " ID " + id ;
    }


    public String toString(){
        return "Name: " + name  + "       Sername: " + surname + "       \nAge: " + age +

                "       \nID: " + id ;
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

