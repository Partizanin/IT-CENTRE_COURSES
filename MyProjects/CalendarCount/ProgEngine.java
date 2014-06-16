package MyProjects.CalendarCount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 27.04.2014
 * Time: 11:50
 * To change this template use File|Setting|File Templates.
 */
public class ProgEngine {

    Calendar c = Calendar.getInstance();


    public String getTime(){
        Calendar cal = c;
        cal.setTime(new Date());

        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int millisecond = c.get(Calendar.MILLISECOND);



        String ret = "Current Time: " + hour + ":" + minute + ":" + second  + ":" + millisecond;

        return cal.getTime().toString();

    }


    public Date creadteDate(int year, int month, int day, int hrs, int min){

        return new Date(year,month,day,hrs,min);
    }

    public Date addHour(Date date,int hour){

        Calendar c = new GregorianCalendar();

        c.setTime(date);

        c.add(Calendar.HOUR,hour);

        return c.getTime();
    }

    public Date addYear(Date date,int year){

        Calendar c = new GregorianCalendar();

        c.setTime(date);

        c.add(Calendar.YEAR,year);

        return c.getTime();


    }

    public Date addWeek(Date date,int week){
        Calendar c = new GregorianCalendar();

        c.setTime(date);

        c.add(Calendar.DAY_OF_YEAR,(week * 7));

        return c.getTime();

    }

    public Date addMonth(Date date,int month){
        Calendar c = new GregorianCalendar();

        c.add(Calendar.MONTH,month);

        return c.getTime();

    }

    public Date addDay(Date date,int day){

        Calendar c = new GregorianCalendar();

        c.setTime(date);

        c.add(Calendar.DAY_OF_YEAR,day);

        return c.getTime();


    }




    public String  getStringDateDifference(Date date1,Date date2){

        String ret;
        long year,month,week,day,hour;

        year = (date2.getYear() - date1.getYear());

        month = (date2.getMonth() - date1.getMonth());

        week = ((date2.getDay() / 7)-(date1.getDay() / 7));

        day = (date2.getDay() - date1.getDay());

        hour = (date2.getHours() - date1.getHours());



        ret = "Різниця в датах:" +
                "\nРоки: " + year +
                "\nМісяці: " + month +
                "\nТижні: " + week +
                "\nДні: " + day +
                "\nГодини: " + hour;

        return ret;
    }


    public String getFullStringDate(Date date){

        SimpleDateFormat format2 = new SimpleDateFormat("Хвилини: " + "mm" +
                                                       "\nГодини: " + "HH" +
                                                      "\nДень: " + "dd" +
                                                      "\nТиждень: " + "WW" +
                                                      "\nМісяць: " + "MM" +
                                                      "\nРік: " + "yyyy");

        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");

        SimpleDateFormat format3 = new SimpleDateFormat("HH:mm:ss:S");

        //25.02.2013

        return "\nCurrent Date: " + format1.format(date) + "\n" +
               "Current Time: " + format3.format(date) + "\n\n" + format2.format(date);



    }


    public String getStringDate(Date date){

        SimpleDateFormat format2 = new SimpleDateFormat("dd.MM.yyyy");
        //25.02.2013

        return "Current Date: " + format2.format(date);



    }


    public Date getCurrentDate() throws ParseException {

        return new Date();

    }

    public Date addMinutes(Date date, int minutes){

        Calendar c = new GregorianCalendar();

        c.setTime(date);

        c.add(Calendar.MINUTE,minutes);

        return c.getTime();

    }


    public void test() throws ParseException {
        Scanner sc = new Scanner(System.in);
        int choise;

        String all = "0 - Вийти з программи." +
                "\n1 - Створити свої дати." +
                "\n2 - Взяти поточну та створити свою." +
                "\n3 - Створити свою та  додати період." +
                "\n4 - Взяти поточну  та  додати період.";


        for (;;) {
            System.out.println(all);

            choise = sc.nextInt();


            if (choise == 0){

                System.exit(0);

            }else if (choise == 1){
                int year,month,day,hour,minute;
                Date date1,date2;

                System.out.println("Створіть першу дату" + "\nПриклад 13.02.2013");
                System.out.println();

                System.out.println("Введіть день:");
                day = sc.nextInt();

                System.out.println("Введіть місяць:");
                month = sc.nextInt();

                System.out.println("Введіть рік:");
                year = sc.nextInt();



                System.out.println("Введіть години:");
                hour = sc.nextInt();

                System.out.println("Введіть хвилини:");
                minute = sc.nextInt();

                date1 = new Date(year,month,day,hour,minute);




                System.out.println("Створіть другу дату дату" + "\nПриклад 13.02.2014");
                System.out.println();


                System.out.println("Введіть день:");
                day = sc.nextInt();


                System.out.println("Введіть місяць:");
                month = sc.nextInt();



                System.out.println("Введіть рік:");
                year = sc.nextInt();



                System.out.println("Введіть години:");
                hour = sc.nextInt();

                System.out.println("Введіть хвилини:");
                minute = sc.nextInt();


                date2 = new Date(year,month,day,hour,minute);


                System.out.println("Дата 1 -" + getFullStringDate(date1));
                System.out.println();
                System.out.println("Дата 2 -" + getFullStringDate(date2));

                System.out.println();

                System.out.println(getStringDateDifference(date1,date2));





            }else if (choise == 2){

                int year,month,day,hour,minute;
                Date date1,date2;

                System.out.println("Створіть дату" + "\nПриклад 13.02.2014");
                System.out.println();

                System.out.println("Введіть день:");
                day = sc.nextInt();


                System.out.println("Введіть місяць:");
                month = sc.nextInt();

                System.out.println("Введіть рік:");
                year = sc.nextInt();




                System.out.println("Введіть години:");
                hour = sc.nextInt();

                System.out.println("Введіть хвилини:");
                minute = sc.nextInt();

                date2 = new Date(year,month,day,hour,minute);

                date1 = getCurrentDate();




                System.out.println("Дата 1 -" + getFullStringDate(date1));
                System.out.println();
                System.out.println("Дата 2 -" + getFullStringDate(date2));

                System.out.println();

                System.out.println(getStringDateDifference(date1,date2));








            }else if (choise == 3){

                int year,month,day,hour,minute;
                Date date1;

                System.out.println("Створіть дату" + "\nПриклад 13.02.2014");
                System.out.println();


                System.out.println("Введіть день:");
                day = sc.nextInt();


                System.out.println("Введіть місяць:");
                month = sc.nextInt();

                System.out.println("Введіть рік:");
                year = sc.nextInt();


                System.out.println("Введіть години:");
                hour = sc.nextInt();

                System.out.println("Введіть хвилини:");
                minute = sc.nextInt();

                date1 = new Date(year,month,day,hour,minute);

                System.out.println("1 - Додати Рік." +
                                   "\n2 - Додати Місяць." +
                                   "\n3 - Додати день" +
                                   "\n4 - Додати години." +
                                   "\n5 - додати хвилини.");

                choise = sc.nextInt();

                if (choise == 1){
                    System.out.println("Введіть кількість років,які хочете додати");

                    year = sc.nextInt();

                    date1 = addYear(date1,year);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));

                }else if (choise == 2){
                    System.out.println("Введіть кількість місяців,які хочете додати");


                    month = sc.nextInt();

                    date1 = addMonth(date1, month);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));


                }else if (choise == 3){

                    System.out.println("Введіть кількість днів,які хочете додати");


                    day = sc.nextInt();

                    date1 = addDay(date1, day);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));



                }else if (choise == 4){

                    System.out.println("Введіть кількість годин,які хочете додати");



                    hour = sc.nextInt();

                    date1 = addHour(date1, hour);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));


                }else if (choise == 5){

                    System.out.println("Введіть кількість хвилин,які хочете додати");


                    minute = sc.nextInt();

                    date1 = addMinutes(date1, minute);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));



                }

            }if (choise == 4){

                int year,month,day,hour,minute;
                Date date1;

                date1 = getCurrentDate();

                System.out.println("1 - Додати Рік." +
                        "\n2 - Додати Місяць." +
                        "\n3 - Додати день" +
                        "\n4 - Додати години." +
                        "\n5 - додати хвилини.");

                choise = sc.nextInt();

                if (choise == 1){
                    System.out.println("Введіть кількість років,які хочете додати");

                    year = sc.nextInt();

                    date1 = addYear(date1,year);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));

                }else if (choise == 2){
                    System.out.println("Введіть кількість місяців,які хочете додати");


                    month = sc.nextInt();

                    date1 = addMonth(date1, month);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));


                }else if (choise == 3){

                    System.out.println("Введіть кількість днів,які хочете додати");


                    day = sc.nextInt();

                    date1 = addDay(date1, day);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));



                }else if (choise == 4){

                    System.out.println("Введіть кількість годин,які хочете додати");



                    hour = sc.nextInt();

                    date1 = addHour(date1, hour);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));


                }else if (choise == 5){

                    System.out.println("Введіть кількість хвилин,які хочете додати");


                    minute = sc.nextInt();

                    date1 = addMinutes(date1, minute);

                    System.out.println();

                    System.out.println(getFullStringDate(date1));



                }





            }else {
                System.out.println("Ви ввели невірне значення\nСпробуйте ще раз");
            }

        }

    }







}
