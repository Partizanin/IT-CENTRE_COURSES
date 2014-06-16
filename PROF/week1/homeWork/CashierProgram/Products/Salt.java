package PROF.week1.homeWork.CashierProgram.Products;

import PROF.week1.homeWork.ProductInSupermarket;

import java.math.BigDecimal;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 30.04.2014
 * Time: 14:24
 * To change this template use File|Setting|File Templates.
 */
public class Salt extends Products implements ProductInSupermarket {


    public Salt() {
        this.name = this.getClass().getName();
        this.expirationDate = "12.03.2014";
        this.manufacturingDate = "10.03.2014";
        this.price = BigDecimal.valueOf(2.55);
        this.barcode = "1110";
    }


    @Override
    public void showPrice() {

        System.out.println("Price: " + price);

    }

    @Override
    public void showExpirationDate() {

        System.out.println("Expiration Date: " + expirationDate);

    }

    @Override
    public void ShowBarcodeAndPrice() {

        System.out.println("barcode: " + barcode + "\nPrice: " + price);

    }

}
