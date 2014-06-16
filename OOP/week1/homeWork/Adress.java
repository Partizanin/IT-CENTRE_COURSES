package OOP.week1.homeWork;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:21.01.14
 * Time: 17:55.
 * To change this template use File|Settings|File Templates.
 */
public class Adress {
    String country;
    String city;
    String street;
    String homeNumber;

    public Adress(String country,String city,String street,  String homeNumber){
        this.city = city;
        this.country = country;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public String shovAdress(){
        return"Country is: " + country + "\nCity is: " + city + "\nStreet is: " + street + "\nHomeNumber is: " + homeNumber;

    }

}



