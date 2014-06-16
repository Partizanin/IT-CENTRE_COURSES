package OOP.week7.classwork.ProgCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:16.03.14
 * Time:11:35
 * To change this template use File|Settings|File Templates.
 */
public class Person {

    private String fullname;
    private String age;
    private String sex;
    private String addres;
    private String creditCard;
    private String about;
    private List<Person> array = new ArrayList<Person>();


    public List<Person> getArray() {
        return array;
    }

    public String showInfo(){
        String ret = "";
        for (int i = 0; i < array.size() ; i++) {

            ret += array.toString();

        }
        return ret;
    }

    public void setArray(List<Person> array) {
        this.array = array;
    }

    public void setPersonToArray(Person p){
        array.add(p);
    }

    Person(String fullname, String age, String sex, String addres, String creditCard, String about){

        this.fullname = fullname;
        this.age = age;
        this.sex = sex;
        this.addres = addres;
        this.creditCard = creditCard;
        this.about = about;

    }



    public void SaveInfo(){

    }

    public String ReadInfo(){

        return null;
    }



    public String getAbout() {
        return about;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getAddres() {
        return addres;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getFullname() {
        return fullname;
    }

    public String toString(){
        return "Fullname: " + fullname + "\nAge: " + age + "\nSex: " + sex + "\nAders: " + addres + "\nCredit cards: " + creditCard + "\nAbout: " + about;
    }



}
