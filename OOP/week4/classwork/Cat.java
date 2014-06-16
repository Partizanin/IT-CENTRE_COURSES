package OOP.week4.classwork;

import java.util.Date;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 11:17.
 * To change this template use File|Settings|File Templates.
 */

public class Cat implements Cloneable{
    private int age;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Object clone() throws CloneNotSupportedException{
        Cat cat = (Cat) super.clone();
        cat.name = this.name + "";
        cat.date = (Date) this.date.clone();
        return cat;

    }

    public String toString(){
        return "Cat [name = " + name + " age = " + age + "]";
    }


}
