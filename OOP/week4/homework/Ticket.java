package OOP.week4.homework;


import java.io.Serializable;
import java.util.Calendar;



/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:11.02.14
 * Time: 18:12
 * To change this template use File|Settings|File Templates.
 */

public class Ticket implements Serializable {


    public String date (){
       Calendar c =  Calendar.getInstance();

        c.add(Calendar.DAY_OF_YEAR,45);




        String day  = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
        String month = Integer.toString(c.get(Calendar.MONTH));
        String year = Integer.toString(c.get(Calendar.YEAR));
        String hour = Integer.toString(c.get(Calendar.HOUR));
        String minuts = Integer.toString(c.get(Calendar.MINUTE));
        String second = Integer.toString(c.get(Calendar.SECOND));


        return "День " + day + " Місяць " + month + " Рік " + year  +
                " Час " + hour + ":" + minuts + ":" + second;



    }



    private final String pointOfDeparture = "Brussels";
    private final String destination  = "Parish";

    private int trainNumber = 13521;

    private String wagonType;
    private int wagonNumber;
    private String seatType;
    private String seatLocation;
    private int seatNumber;
    private double price;
    private String date = date();

    public String getWagonType() {
        return wagonType;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getSeatLocation() {
        return seatLocation;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }




    public Ticket(int wagonNumber,int seatNumber,double price,String wagonType,String seatType,String seatLocation){



        this.wagonNumber = wagonNumber;
        this.seatLocation = seatLocation;
        this.seatType = seatType;
        this.wagonType = wagonType;
        this.seatNumber = seatNumber;
        this.price = price;


    }

    public Ticket(){

    }


    public String showTicketInfo(){
    return  "Цена: " + price + "$\nНомер поезда: " + trainNumber + "\nДата и время отправления: " + date + "\nВагон №: " + wagonNumber + "\nТип вагон: " + wagonType + "\nМесто №: " + seatNumber + "\nМесто тип: " + seatType + "," + seatLocation + "\nПункт отправления: " + pointOfDeparture + "\nМесто назначения: " + destination + "\n";

    }

}
