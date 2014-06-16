package OOP.week1.classWork;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin          1
 * Date:18.01.14
 * Time: 13:15.
 * To change this template use File|Settings|File Templates.
 */
public class Adress {
   String country;
    String city;
    String street;


       public Adress(String country,String city,String street){
           this.city = city;
           this.country = country;
           this.street = street;

    }

 public void shovAdress(){

        System.out.println("Country is: " + country + "\nCity is: " + city + "\nStreet is: " + street);
     System.out.println();
    }

   /* public String toString(){
        return "Salary: "+ salary + "\nPosition: " + position;
    }*/

}
