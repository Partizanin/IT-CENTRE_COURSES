package PROF.week1.homeWork;

import java.math.BigDecimal;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 30.04.2014
 * Time: 13:21
 * To change this template use File|Setting|File Templates.
 */
public class Fish {

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    private BigDecimal price = BigDecimal.valueOf(15.6) ;

    private String ExpirationDate = "12.05.2014";

    private String Barcode = "11255";



    public void showPrice() {

        System.out.println("Price: " + price);

    }


    public void showExpirationDate() {

        System.out.println("Expiration Date: " + ExpirationDate);

    }


    public void ShowBarcodeAndPrice() {

        System.out.println("Barcode: " + Barcode + "\nPrice: " + price);

    }

    public void swim(){

        System.out.println("I swam 10 meters");
    }

    public void SwallowOtherFish(){

        System.out.println("I Swallow other fish");
    }
}
