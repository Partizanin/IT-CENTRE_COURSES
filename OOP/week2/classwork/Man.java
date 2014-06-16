
package OOP.week2.classwork;

import OOP.week1.classWork.Adress;

import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:18.01.14
 * Time: 11:56.
 * To change this template use File|Settings|File Templates.
 */

public class Man{
    Scanner sc = new Scanner(System.in);

    int age;
    String name;
    double payment;
    int hour;
    Man bestFriend;
    Adress adress;

    public Man(){

    }

    public Man(int age,String name){
        this.name= name;
        this.age = age;

    }

    public Man(String name,int age,Adress adress,Man bestFriend,double salary){
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.bestFriend = bestFriend;
        this.payment = salary;


    }


    public  void Say(int age,String name,double payment){

          if (payment < 1000){
              System.out.println("I`m " + name + "My age = " + age + " My payment norm");
          }else{
              System.out.println("I`m " + name + " My age = " + age + " My payment = " + payment);
          }
    }

    public void go(int hour){

        if (hour > 7 && hour < 21){
         if (hour > 7 && hour < 8){
             System.out.println(" Gigiena ");
         }
            if (hour > 10 && hour < 18){
                System.out.println(" Work ");
            }
            if (hour > 18 && hour < 21){
                System.out.println(" relax ");
            }
        }


    }

    public  void sayHello(){
        System.out.println("I`m " + name + " My age = " + age);

    }

    public   void Game(String s){

        if (s == "Marko"){
            System.out.println("Polo");
        }else if (s == "Polo"){
            System.out.println("Marko");
        }else {
            System.out.println("I dont anderstand you!!!");
        }

    }

    void meet(Man friend){
    bestFriend = friend;

    }

    void TellAboutFriend(){
        System.out.println("My friend is = " +bestFriend.name);
        System.out.println("My friend age = " + bestFriend.age);
        System.out.println("My friend payment = " + bestFriend.payment);
    }








}

