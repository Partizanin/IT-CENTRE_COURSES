package OOP.week3.classwork;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:01.02.14
 * Time: 13:32.
 * To change this template use File|Settings|File Templates.
 */
public class Adres {

    String country;
    String city;
    String street;
    String house;

    public Adres(String country,String city,String street,String house){
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;

    }

    public String showAdes(){

        return "Country: " + country + "\nCity: " + city + "\nStreet: " + street + "\nHouse: " + house;
    }
}
