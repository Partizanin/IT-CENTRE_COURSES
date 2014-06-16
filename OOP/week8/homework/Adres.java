package OOP.week8.homework;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:17.03.14
 * Time:11:08
 * To change this template use File|Settings|File Templates.
 */
public class Adres {

    @Override
    public String toString() {
        return "Adres{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    String country;
    String city;
    String street;
    String house;



    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

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
