package PROF.week1.classWork;

import java.math.BigDecimal;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 26.04.2014
 * Time: 17:15
 * To change this template use File|Setting|File Templates.
 */
public class Man {

    private String name;
    private int age;
    private BigDecimal money;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }


    public Man(String name, int age, BigDecimal money) {

        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Man(){

    }


    @Override
    public boolean equals(Object obj) {
        boolean ret = false;
        Man man = (Man) obj;

        if (obj == null && obj.getClass() != this.getClass()) {
            ret =  false;
        }

        if (man.name != null || man.money != null || man.age != 0) {


            ret = man.money == this.money && man.name == this.name && man.age == this.age;



        }
        return ret;

        }
    }



