package OOP.week4.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:11.02.14
 * Time: 18:13
 * To change this template use File|Settings|File Templates.
 */

public class TicketCash {
    public double getCash() {
        return cash;
    }

    public int getTicketsBuy() {
        return ticketsBuy;
    }

    public int getTicketsReturn() {
        return ticketsReturn;
    }

    public int getPlacCoupCout() {
        return placCoupCout;
    }

    public int getPlacSideCount() {
        return placSideCount;
    }

    public int getCoupOnlyCount() {
        return coupOnlyCount;
    }

    public int getSleeppedCount() {
        return sleeppedCount;
    }

    public int getCountRreturntTickets() {
        return countRreturntTickets;
    }

    public List<Ticket> getList() {
        return list;
    }

    public int[] getCounters(){
        return counters;

    }

    public List<Ticket> getTicketsBuys() {
        return ticketsBuys;
    }

    double cash;
    int all;
    int ticketsBuy; //Щетчик рахує кількість куплених квитків
    int ticketsReturn;//Щетчик рахує кількість повернутих квитків
    int placCoupCout = 0;//Щетчик рахує кількість  квитків в касі,квитки Плацкарт купе місця
    int placSideCount = 0;//Щетчик рахує кількість  квитків в касі,квитки Плацкарт Бокові місця
    int coupOnlyCount = 0;//Щетчик рахує кількість  квитків в касі,квитки тільки купе місця
    int sleeppedCount = 0;//Щетчик рахує кількість  квитків в касі,квитки Спальні місця
    int countRreturntTickets = 1;//Щетчик рахує кількість  квитків в масиві проданих квитків
    int saveCounter = 0;//Щетчик рахує кількість збереження  разів
    List<Ticket> list = new ArrayList<Ticket>();//Массив квитків в кассі
    List<Ticket> ticketsBuys = new ArrayList<Ticket>();//Массив куплених  квитків
   int[] counters = new int[9];//Масив щотчиків


    /**
     * Метод повернення квитка в касу
     *
     * @param choise - значення яке вибрав юзер
     */

    public void returnTicket(int choise) {


        if (ticketsBuy > 0) { //Перевірка на те чи повернено хоч один квиток
            int index = choise - 1;    // індекс квитка який обрав юзер


            ticketsReturn++; //щотчик повернення квитка
            ticketsBuy--;//щотчик куплених квитків


            Ticket removed = ticketsBuys.get(index); //Береться квиток який вибрав юзер

            list.add(removed); // Додається квиток яки повертається в кссу
            ticketsBuys.remove(removed);//Видаляється квиток з масиву проданих квитків
            countRreturntTickets = 1; // Індекс обнуляється

        }
    }

    /**
     * Метод показує список проданих квитків
     */
    public void showPurchasedTickets() {
        if (ticketsBuy > 0) { //Перевірка на наявність проданих квитків
            System.out.println("\t\t\tСписок проданих квитків: ");
            for (int i = 0; i <= ticketsBuys.size() - 1; i++) {  //Цикл


                System.out.println(countRreturntTickets + ") " + ticketsBuys.get(i).showTicketInfo()); //Виводиться список з порядковим номером,для
                                                                                                      // того щоб юзер міг вибрати квиток по номеру
                countRreturntTickets++;


            }
        } else {         //якщо проданих квитків немає то вивисти повідомлення
            System.out.println("Ви не можете здати квиток\nЩе не куплено жодного квитка!!");
        }

    }

    /**
     * Метод показує гроші в в касі та інше
     */
    public void encashment() {
        int all = placCoupCout + placSideCount + coupOnlyCount + sleeppedCount;
        System.out.println();
        System.out.println("\n1 Грошей в кассі: " + cash + "\n2 Повернено білетів: "
                + ticketsReturn + "\n3 Куплено білетів: " + ticketsBuy + "\n4 Всього в касі " + all +" білетів");
        System.out.println();
    }

    /**
     * Метод створює список квитків в касі
     */
    public void ticketsCreate() {
              //int wagonNumber,int seatNumber,int price,String wagonType,String seatType,String seatLocation
        for (int i = 0; i <= 36; i++) {                     //Цикл від 0 до 36 включно
            if (i % 2 != 0) {                               //перевірка індекса на непарність
                Ticket cupeTop = new Ticket(1, i, 700.50, "Плацкарт", "Купейне місце", "Нижня полиця"); //створюється квиток індекс співпадає з номером місця
                list.add(cupeTop);                                  //додається створений квиток в масив
            } else if (i % 2 == 0) {        // перевірка індекса на парність
                Ticket cupeLower = new Ticket(1, i, 700.50, "Плацкарт", "Купейне місце", "Верхня полиця");//аналогічно
                list.add(cupeLower);     //аналогічно
            }
        }

        for (int i = 37; i <= 54; i++) {             //аналогічно
            if (i % 2 != 0) { //аналогічно
                Ticket SideTop = new Ticket(1, i, 600.25, "Плацкарт", "Бокове місце", "Нижня полиця");//аналогічно

                list.add(SideTop);//аналогічно
            } else if (i % 2 == 0) {//аналогічно
                Ticket SideLower = new Ticket(1, i, 600.27, "Плацкарт", "Бокове місце", "Верхня полиця");//аналогічно

                list.add(SideLower);//аналогічно
            }


        }

        for (int i = 0; i <= 36; i++) {                       //аналогічно

            Ticket cupeOnly = new Ticket(2, i, 800.15, "Купейний", "Купейне місце", "Верхняя полка");        //аналогічно
            list.add(cupeOnly); //аналогічно
        }

        for (int i = 1; i <= 18; i++) {                    //аналогічно
            Ticket sleeped = new Ticket(3, i, 600.33, "Спальний", "Купейне місце", "");    //аналогічно      Полка не вказана
            list.add(sleeped);        //аналогічно

        }

    }

    /**
     * Метод покупки квитка ,Приймає номер вагону і місце,томущо немає однакових вагонів  з однаковими місцями
     * @param wagonNumber - вагон який вибрав юзер
     * @param seatNumber - місце яке вибрав юзер
     */
    public void buyTicket(int wagonNumber, int seatNumber) {
        ticketsBuy++;    //Щотчик кількості куплених квитків

        for (int i = 0; i < list.size(); i++) {      //Цикл

            if (list.get(i).getWagonNumber() == wagonNumber && list.get(i).getSeatNumber() == seatNumber) { //якщо прийняте місце і ваго співпадає з місцем і вагоном в масиві квитків

                ticketsBuys.add(list.get(i));                                                              // то квиток додається в масив проданих квитків


                cash += list.get(i).getPrice();//Ціна квитка додається в касу



                list.remove(list.get(i));//квиток видаляється з масиву //квиток видаляється з масиву


                //Логіка керування щотчиками


                if (list.get(i).getWagonNumber() == 1) {
                    if (list.get(i).getSeatNumber() >= 1 && list.get(i).getSeatNumber() <= 36) {

                        placCoupCout--;
                    }else if (list.get(i).getSeatNumber() >= 37 && list.get(i).getSeatNumber() <= 54) {

                        placSideCount--;

                    }



                }else  if (list.get(i).getWagonNumber() == 2) {
                    if (list.get(i).getSeatNumber() > 0 && list.get(i).getSeatNumber() <= 36){

                        coupOnlyCount++;
                    }
                }else if (list.get(i).getWagonNumber() == 3) {

                    if (list.get(i).getSeatNumber() > 0 && list.get(i).getSeatNumber() <= 18) {

                        sleeppedCount--;

                    }

                    }


                        all = placCoupCout + placSideCount + coupOnlyCount + sleeppedCount;




            }

        }



    }

    /**
     * Метод перевіряє чи існує в касі квиток з параметрами які приймаються
     *
     * @param wagonNumber - вагон який вибрав юзер
     * @param seatNumber - - місце яке вибрав юзер
     * @return - повертає тру або фолс
     */
    public boolean ticketsEaqualsChekerd(int wagonNumber, int seatNumber) {

        for (Ticket aList : list) {//Робота з об`єктами через фор іч
            // находитсья совпадєніє в масіві обєктов
            if (aList.getWagonNumber() == wagonNumber && aList.getSeatNumber() == seatNumber) { //порівняються параметри

                return true;//якщо співпало ир вертається тру
            }
        }

        return false;//В іншому випадку вертаєтся фолс
    }


    public boolean ticketsEaqualsForShow(int wagonNumber, int seatNumber) {  //Метод визначає показувати список квитків чи ні,метод не дороблений і наврядчи доробиться


        if (true) {
            for (Ticket aList : list) {//цикл фор іч
                if (aList.getWagonNumber() == wagonNumber && aList.getSeatNumber() == seatNumber) {

                    System.out.println(aList.showTicketInfo());

                    return true;
                }

            }
            return false;

        } else {
            for (Ticket ticketsBuy1 : ticketsBuys) {
                if (ticketsBuy1.getWagonNumber() == wagonNumber && ticketsBuy1.getSeatNumber() == seatNumber) {

                    System.out.println("Квиток проданий,і ви його не можете купити!!!");
                    System.out.println(ticketsBuy1.showTicketInfo());

                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Метод показує список проданих квитків
     */
    public void showPurchasedListOfTicket() {
        int counT = 1;
        if (ticketsBuy > 0) {
            System.out.println("\t\t\tСписок проданих квитків: ");
            for (int i = 0; i <= ticketsBuys.size() - 1; i++) {

                System.out.println(counT + ")" + ticketsBuys.get(i).showTicketInfo());
                counT++;

            }
        } else {
            System.out.println("Ще не куплено жодного квитка!!");
        }
    }

    /**
     *  метод показує один проданий кивток який вибере юзер
     * @param wagonNumber - - вагон який вибрав юзер
     * @param seatNumber - - місце яке вибрав юзер
     */
    public void showOnePurchasedTicket(int wagonNumber, int seatNumber) {
        for (Ticket aList : ticketsBuys) {
            if (aList.getWagonNumber() == wagonNumber && aList.getSeatNumber() == seatNumber) {

                System.out.println(aList.showTicketInfo());
            }

        }
    }


    /**
     * метод показує один квиток в касі
     * @param wagonNumber - - вагон який вибрав юзер
     * @param seatNumber - - місце яке вибрав юзер
     */
    public void showTicketInfo(int wagonNumber, int seatNumber) {


        for (Ticket aList : list) {
            if (aList.getWagonNumber() == wagonNumber && aList.getSeatNumber() == seatNumber) {

                System.out.println(aList.showTicketInfo());
            }

        }


    }

    /**
     * метож показує список квитків в касі та іншу інформацію
     */
    public void showAllInfo() {

        if (list.size() > 0){// перевіряєтсья чи масив не порожній
            placCoupCout = 0;//щотчики анулюютьяс щоб
            placSideCount = 0;// порахувати нові значення,
            coupOnlyCount = 0;// томущо квитки купують та
            sleeppedCount = 0;// повертають та значення змінюються

        System.out.println("List of tickets: ");
        for (int i = 0; i <= list.size() - 1; i++) { //Цикл
            if (list.get(i).getWagonNumber() == 1) { //Перевіряється якщо в білеті який береться вагон співпадає з тим що ми просим то кузнєчік проходе далі
                if (list.get(i).getSeatNumber() >= 1 && list.get(i).getSeatNumber() <= 36) { //Перевіряється якщо місце в білаті який береться лежить в діапазоні
                                                                                            // від 1 - 36 то  білет виводиться
                    System.out.println();                                                   //Відступаєм місце від минулого квитка який вивівся
                    System.out.println(list.get(i).showTicketInfo());                       //виводим наступний квиток
                    placCoupCout++;//додаємо 1 в щотчик місць в цьому вагоні                //в цьому циклі ми іфами так сказати визначили квики які будем виводити,
                                                                                            // і можемо стверджувати,що всі квитки з вагону "Плацкарт"

                } else if (list.get(i).getSeatNumber() >= 37 && list.get(i).getSeatNumber() <= 54) {//аналогічно

                    System.out.println(list.get(i).showTicketInfo());
                    placSideCount++;
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {//аналогічно

            if (list.get(i).getWagonNumber() == 2) {
                if (list.get(i).getSeatNumber() > 0 && list.get(i).getSeatNumber() <= 36) { //аналогічно

                    System.out.println(list.get(i).showTicketInfo());
                    coupOnlyCount++;
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getWagonNumber() == 3) {

                if (list.get(i).getSeatNumber() > 0 && list.get(i).getSeatNumber() <= 18) { //аналогічно

                    System.out.println(list.get(i).showTicketInfo());
                    sleeppedCount++;

                }
            }
            //таким чином ми виводим всі квитки які моглиб бути в масиві квитків каси
            if (i >= list.size() - 1) { // якщо індекс більше або дорівнює довжині масиву -1 це означає що квитки всі вивелись і томожна вивести інформацію,
                                        // виводиться інформація
              all = placCoupCout + placSideCount + coupOnlyCount + sleeppedCount;
                System.out.println();
                System.out.println("Всього місць: " + all + ".\n\n1 Вагон плацкарт:\nКупейних місць: " + placCoupCout + "\nБокових місць: " + placSideCount +
                        "\n\n2 Купейний вагон:\nТільки купейних місць: " + coupOnlyCount + "\n\n3 Вагон спальний:\nТільки купейних місць: " + sleeppedCount + "\n\n4 Куплено білетів: " + ticketsBuy
                        + "\n\n5 Повернено білетів: " + ticketsReturn + "\n\n6 Грошей в кассі: " + cash);
            }

        }
        }else {                                     //якщо в касі квитків немає то виводитсья це повідомлення
            System.out.println("Квитків в кассі не залишилось");
        }
        System.out.println();
    }

     /**
      * Метод зберігає данні в программі
      * @throws IOException - Викидаємо помилку далі
      */
    public void saveCounters() throws IOException {
        counters[0] = ticketsBuy;//Заливаємо значення щотчиків в масив
        counters[1]= ticketsReturn;
        counters[2] = placCoupCout;
        counters[3] = placSideCount;
        counters[4] = coupOnlyCount;
        counters[5] = sleeppedCount;
        counters[6] = countRreturntTickets;
        counters[7] = saveCounter;


        FileOutputStream fos = new FileOutputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveCounters.txt");//створюємо поток та прописуєм щлях
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(counters);            //Записуєм масив в файл як байткод
        oos.close();                         //закриваємо поток

    }

    /**
     * Метод завантажує значенняв программу, які зберегли в файлі
     * @throws IOException - Викидаємо помилку далі
     * @throws ClassNotFoundException - Викидаємо помилку далі
     */
    @SuppressWarnings("unchecked")                //кажеммо компілятору що ми вкурсі що може виникнути помилка
    public void downloadCounters() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveCounters.txt");//створ.ємо поток та прописуєм шлях де збережені данні
        ObjectInputStream ois = new ObjectInputStream(fis);

        counters = (int[]) ois.readObject();// присвоюємо завантажене значення нашій змінній
        ois.close();                        //закриваємо поток для економії пам'яті віртуальної машини


        ticketsBuy = counters[0];          //присвоюємо зна завантажені
        ticketsReturn = counters[1];       // значення нашим зміннним
        placCoupCout = counters[2];
        placSideCount = counters[3];
        coupOnlyCount = counters[4];
        sleeppedCount = counters[5];
        countRreturntTickets = counters[6];
        saveCounter = counters[7];



    }

    /**
     * Аналогічний метод тільки записує інтове значення а не масив
     * @throws IOException - Викидаємо помилку далі
     */
    public void saveSaveCounter() throws IOException {

        FileOutputStream fos = new FileOutputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveCounter.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Integer saveCounters = saveCounter;                  //створюємо оболочку інта та присвоюємо їй значення

        oos.writeObject(saveCounters);                       //Записуємо значення в файл

        oos.close();                                         //Закриваємо поток

       FileOutputStream fos2 = new FileOutputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveCash.txt");
        ObjectOutputStream ois2 = new ObjectOutputStream(fos2);

        Double d = cash;                                          //Створюємо оболочку присвоюємо їй відповідне значення
        ois2.writeObject(d);                                      //записуємо Об'єкт в файл

    }

    /**
     *   Метод завантажує та присвоює завантажені значення
     * @throws IOException - Викидаэмо помилку далі
     * @throws ClassNotFoundException Викидаэмо помилку далі
     */
    public void downloadSaveCounter() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveCounter.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Integer w = (Integer) ois.readObject();

        saveCounter  =  w;

        ois.close();






    }

    /**
     *
     * @throws IOException - Викидаэмо помилку далі
     */
    public void saveArrayList() throws IOException{
        //path E:\SaveArray.txt
       //E:\SaveInt.txt

       FileOutputStream fos1 = new FileOutputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveArray1.txt");
       ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
        oos1.writeObject(list);
        oos1.close();

        FileOutputStream fos2 = new FileOutputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveArray2.txt");

        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
        oos2.writeObject(ticketsBuys);
        oos2.close();


        FileOutputStream fos3 = new FileOutputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveInt.txt");

        ObjectOutputStream oos3 = new ObjectOutputStream(fos3);


        Integer w1 = ticketsBuy;


        oos3.writeObject(w1);

        oos3.close();

    }


    @SuppressWarnings("unchecked")
    public void downloadArrayLists() throws IOException, ClassNotFoundException {

        FileInputStream fis1 = new FileInputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveArray1.txt");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);

        list = (List<Ticket>) ois1.readObject();

        ois1.close();

        FileInputStream fis2 = new FileInputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveArray2.txt");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);

        ticketsBuys = (List<Ticket>) ois2.readObject();
        ois2.close();


        FileInputStream fis3 = new FileInputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveInt.txt");
        ObjectInputStream ois3 = new ObjectInputStream(fis3);

        Object w = ois3.readObject();
        Integer w1 = (Integer) w;
        ticketsBuy  =  w1;

        ois3.close();


        FileInputStream fis4 = new FileInputStream("D:\\Illia\\JAVA\\Курсы\\SaveTickets\\SaveCash.txt");
        ObjectInputStream ois4 = new ObjectInputStream(fis4);
        Double d = (Double) ois4.readObject();

        cash = d;

        ois4.close();




    }


    public void cashTest() throws IOException, ClassNotFoundException { // Метод створює консольну программу яка ємулює касовий апарт
        Scanner sc = new Scanner(System.in);
        int checkDownload = 0;
        if (true){

            try {

                downloadSaveCounter();                                // Метод завантажує щотчик кількості збережень,для того,щоб перевірити чи є збережені файли
            }catch (FileNotFoundException e){                     //Ловим помилку
                System.out.println("Файл не найден");

            }
        }



        for (int w;;){  //безкінечний цикл
        if (saveCounter != 0){ //Після того як ми завантажили це значення, визначаємо чи є збереженні файли


        System.out.println("Виберіть пункт з меню");
        System.out.println("1 - Завантажити старий список квиткиів\n2 - Створити новий список квитків");

       checkDownload = sc.nextInt();



        if (checkDownload == 1){     //якщо юзер вибрав 1 то
            downloadArrayLists(); //завантажується минулі данні які збереглись після виходу з програми
            downloadCounters();
            downloadSaveCounter();


            break;  //зупиняється цикл тому що він безкінечний і сам не зупиниться
        }else if (checkDownload < 1 | checkDownload > 2){  //перевіряєтсья щоб значення було правильно введене

            System.out.println("Ви вибрали невірне число\nВиберіть будь ласка правильне число");
            System.out.println();
            System.out.println();








        }else if (checkDownload == 2){ // якщо юзер вибрав 1 то ми створюємо новий масив квиткив а інші значення анолювались при запуску програми

            ticketsCreate();
            break; //зупиняємо цикл тому що він безкінечний

        }


        }else { // якщо файли ніразу не зберігались ми атоматично створюємо новий масив квитків а значення анульовані при запускі програми

            ticketsCreate();
            break;
        }

        }
               // створюємо меню
        String showOneTicketInfo = "Дізнатися інформацію про квитки";
        String buyTicket = "Купити квиток";
        String returTicket = "Вернути квиток";
        String incasate = "Провести інкасацію";

        System.out.println("\t0.- Вийти з программи\n" + //виводемо меню на екран
                "\t1.- " + showOneTicketInfo + "\n" +
                "\t2.- " + returTicket + " \n" +
                "\t3.- " + buyTicket + " \n" +
                "\t4.- " + incasate + "\n");



        int selected = 9;  //ініціалізуємо значення для вибору в меню

        try { // створюємо трай кеч ловимо помилку якщо введуть не цифру а інший знак

            selected = sc.nextInt();

        } catch (InputMismatchException ex) {           //ловимо помилку
            System.err.print("Ви ввели літери введіть число!!!");  //виводемо повідомлення

            System.out.println();


            System.out.println("\t0.- Вийти з программи\n" + //виводемо меню на екран
                    "\t1.- " + showOneTicketInfo + "\n" +
                    "\t2.- " + returTicket + " \n" +
                    "\t3.- " + buyTicket + " \n" +
                    "\t4.- " + incasate + "\n");


            selected = sc.nextInt();
        }
        while (selected != 0) {
            if (selected < 0 || selected > 5) {
                System.out.println("\t0.- Вийти з программи\n" +
                        "\t1.- " + showOneTicketInfo + "\n" +
                        "\t2.- " + returTicket + " \n" +
                        "\t3.- " + buyTicket + " \n" +
                        "\t4.- " + incasate + "\n");



                System.err.println("Ви ввели невірне число");


                selected = sc.nextInt();

            }





            while (selected == 1) { //якщо юзерр ввів число 1 то виконуєм команду під номером 1

                System.out.println();
                System.out.println("\t\t" + showOneTicketInfo);
                System.out.println();


                System.out.println("Виберіть команду із списка:");   //виводем ще одне меню
                System.out.println("1 - Показати список проданих квитків\n" +
                        "2 - Показати список квитків в кассі\n3 - Вибрати квиток самому\n" +
                        "4 - Повернутися в попереднє меню");
                int checked = sc.nextInt();   //  приймаємо нове значення яке введе юзер

                if (checked == 4){             // якщо ввів 4 то
                    System.out.println("\t0.- Вийти з программи\n" + //Виводемо меню на екран
                            "\t1.- " + showOneTicketInfo + "\n" +
                            "\t2.- " + returTicket + " \n" +
                            "\t3.- " + buyTicket + " \n" +
                            "\t4.- " + incasate + "\n");

                    selected = sc.nextInt();     //приймаємо значення
                }else if (checked == 1) {  //Якщо вівв 1 то
                    showPurchasedListOfTicket(); // викликаємо мето
                    break;               //виходемо з  цикл
                } else if (checked == 2) {           //якщо ввів 2 то
                    showAllInfo();              //викликаємо метод
                    break;          //виходемо з цикла
                } else if (checked == 3) {     //якщо ввів 3 то запускаємо процедуру вибора вагону


                    int seatNum = 0;

                    System.out.println("Введіть номер вагону");

                    System.out.println("1 - Плацкарт" + "\n2 - Купейний" + "\n3 - Спальний");
                    int wagonNum = sc.nextInt();


                    if (wagonNum == 1) {

                        System.out.println("1 - Купейне місце\n2 - Бокове  Місце");
                        int checkSeatPlace = sc.nextInt();


                        System.out.println("1 - Верхня полиця\n2 - Нижня полиця");
                        int polka = sc.nextInt();
                        int chekSeatNum = 0;

                        if (checkSeatPlace == 1 && polka == 1) { //якщо вагон і полка == 1 то

                            for (int i; ; ) { //створюємо безкінечний цикл

                                System.out.println("Введіть парний номер місця \nвід 2 до 36");
                                chekSeatNum = sc.nextInt();              //приймаємо значення від 2 до 36


                                if (chekSeatNum % 2 == 0 && chekSeatNum >= 2 && chekSeatNum <= 36) { //перевіряємо чи справді
                                                                                                    // юзер ввів значення в межах та чи значення парне

                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) {               //в іфі викликаємо метод який повертає тру якщо квиток існує в касі

                                        showTicketInfo(1, chekSeatNum);                         //якщо метод повернув тру то викликається метод показу квитка
                                        break;               //виходим з циклу
                                    } else {         //в іншому випадку

                                        showOnePurchasedTicket(1, chekSeatNum); // показує квиток який проданий
                                        break;                     //виходе з циклу

                                    }
                                } else { //в іншому випадку

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз"); // виводе повідомлення
                                }
                            }

                        }

                        if (checkSeatPlace == 2 && polka == 2) { // і так далі і тп...аналогічне логіці яка написана вище

                            for (int i; ; ) {

                                System.out.println("Введіть парний номер місця \nвід 37 до 53\n37,39,41,43,45,47,49,51,53");

                                chekSeatNum = sc.nextInt();

                                if (chekSeatNum % 2 != 0 && chekSeatNum >= 37 && chekSeatNum <= 53) {


                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) {

                                        showTicketInfo(1, chekSeatNum);
                                        break;
                                    } else {

                                        showOnePurchasedTicket(1, chekSeatNum);
                                        break;

                                    }

                                } else {

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");
                                }


                            }

                        }

                        if (checkSeatPlace == 2 && polka == 1) {

                            for (int i; ; ) {

                                System.out.println("Введіть парний номер місця \nвід 38 до 54");
                                chekSeatNum = sc.nextInt();

                                if (chekSeatNum % 2 == 0 && chekSeatNum >= 38 && chekSeatNum <= 54) {


                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) {

                                        showTicketInfo(1, chekSeatNum);
                                        break;
                                    } else {

                                        showOnePurchasedTicket(1, chekSeatNum);
                                        break;

                                    }

                                } else {

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");
                                }


                            }

                        }


                        if (checkSeatPlace == 1 && polka == 2) {

                            for (int i; ; ) {

                                System.out.println("Введіть парний номер місця \nвід 1 до 35");
                                chekSeatNum = sc.nextInt();

                                if (chekSeatNum > 1 && chekSeatNum <= 35) {

                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) {

                                        showTicketInfo(1, chekSeatNum);
                                        break;
                                    } else {

                                        showOnePurchasedTicket(1, chekSeatNum);
                                        break;

                                    }

                                } else {

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");
                                }


                            }

                        }


                    } else if (wagonNum == 2) {
                        int chekSeatNum = 0;

                        for (int i; ; ) {


                            System.out.println("Введіть номер місця \nвід 1 до 36");
                            chekSeatNum = sc.nextInt();

                            if (chekSeatNum > 0 && chekSeatNum <= 36) {

                                if (ticketsEaqualsChekerd(2, chekSeatNum)) {

                                    showTicketInfo(2, chekSeatNum);
                                    break;
                                } else {

                                    showOnePurchasedTicket(2, chekSeatNum);
                                    break;

                                }
                            } else {

                                System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");

                            }

                        }


                    } else if (wagonNum == 3) {
                        int chekSeatNum = 0;

                        for (int i; ; ) {
                            System.out.println("Введіть номер місця \nвід 1 до 18");
                            chekSeatNum = sc.nextInt();

                            if (chekSeatNum > 0 && chekSeatNum <= 18) {

                                if (ticketsEaqualsChekerd(3, chekSeatNum)) {

                                    showTicketInfo(3, chekSeatNum);
                                    break;
                                } else {

                                    showOnePurchasedTicket(3, chekSeatNum);
                                    break;

                                }
                            } else {

                                System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");

                            }

                        }


                        showTicketInfo(wagonNum, seatNum);

                        // після всіх операцій виводе попереднє меню

                        System.out.println();
                        System.out.println("\t0.- Вийти з программи\n" +
                                "\t1.- " + showOneTicketInfo + "\n" +
                                "\t2.- " + returTicket + " \n" +
                                "\t3.- " + buyTicket + " \n" +
                                "\t4.- " + incasate + "\n");

                        selected = sc.nextInt();

                    }
                }
            }

            while (selected == 2) {
                System.out.println();


                System.out.println("Виберіть команду із списка:");
                System.out.println("1 - Повернути квиток\n" +
                        "2 - Вернутись в попереднє меню");
                int checked = sc.nextInt();

                if (checked == 2){ // якщо юзер вибрав операцює під номером 2 то

                    System.out.println();
                    System.out.println("\t0.- Вийти з программи\n" + // виводитсья на екран меню
                            "\t1.- " + showOneTicketInfo + "\n" +
                            "\t2.- " + returTicket + " \n" +
                            "\t3.- " + buyTicket + " \n" +
                            "\t4.- " + incasate + "\n");

                    selected = sc.nextInt();            // приймається значення

                }else if (checked == 1){ // якщо юзер вибрав операцію під номером 1 то


                int checked1 ;
                System.out.println("\t\t" + returTicket);

                if (ticketsBuys.size() > 0) {      //перевіряється наявність об'єктів в масиві з повернутими квитками
                    showPurchasedTickets(); // якщо так то викликається метод який виводе список проданих квитків на екран


                    System.out.println("Виберіть квиток:");
                     checked1   = sc.nextInt();      //приймається порядковий номер квитка який написаний біля квитка
                    returnTicket(checked1);         // викликаєтсья метод який видаляє квтиток по порядковому номеру
                    System.out.println("Ви повернули квиток");
                    System.out.println();
                    break; // після всіх орперацій вистрибуємо з цикла


                } else  { // якщо проданих квитків немає виводиться повідомлення
                    System.out.println("Ви не можете здати квиток\nЩе не куплено жодного квитка!!");

                }
                }else if ( checked < 1 | checked > 2){   // якщо юзер ввів невірне число то виводитсья повідомлення про це
                    System.out.println("Ви ввели невірне значення");
                }



            }


                while (selected == 3) { // якщо юзе рвибрав дію під номером 3 то
                    int seatNum = 0;             //ініціалізується значення яке буде прийматися пізніще
                    int wagonNum = 0;
                    System.out.println("\t\t" + buyTicket);

                    System.out.println("Введіть номер вагону");

                    System.out.println("1 - Плацкарт" + "\n2 - Купейний" + "\n3 - Спальний");
                     wagonNum = sc.nextInt(); //приймається значення яке вів юзер

                                      // йде розпізнання значення яке вів юзер
                    if (wagonNum == 1) {      // якщо вибрав вагон 1

                        System.out.println("1 - Купейне місце\n2 - Бокове  Місце");// вибирає місце
                        int checkSeatPlace = sc.nextInt();


                        System.out.println("1 - Верхня полиця\n2 - Нижня полиця"); //вибирає полицю
                        int polka = sc.nextInt();
                        int chekSeatNum = 0;

                        if (checkSeatPlace == 1 && polka == 1) { // якщо місце і полиця дорівнюють 1 то

                            for (int i; ; ) {

                                System.out.println("Введіть парний номер місця \nвід 2 до 36");
                                chekSeatNum = sc.nextInt();


                                if (chekSeatNum % 2 == 0 && chekSeatNum >= 2 && chekSeatNum <= 36) {

                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) {

                                        seatNum = chekSeatNum;
                                        break;
                                    } else {
                                        System.out.println("Квиток вже куплений\nБудь ласка виберіть інше місце");
                                        System.out.println();
                                    }
                                } else {

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");
                                }
                            }

                        }


                        if (checkSeatPlace == 2 && polka == 2) {// якщо місце і полиця дорівнюють 2 то

                            for (int i; ; ) {

                                System.out.println("Введіть непарний номер місця \nвід 37 до 53");
                                chekSeatNum = sc.nextInt();

                                if (chekSeatNum % 2 != 0 && chekSeatNum >= 37 && chekSeatNum <= 53) {


                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) {
                                        seatNum = chekSeatNum;
                                        break;
                                    } else {
                                        System.out.println("Квиток вже куплений\nБудь ласка виберіть інше місце");
                                        System.out.println();
                                    }

                                } else {

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");
                                }


                            }

                        }


                        if (checkSeatPlace == 2 && polka == 1) { // якщо місце 2  полиця дорівнює 1 то

                            for (int i; ; ) {

                                System.out.println("Введіть парний номер місця \nвід 38 до 54");
                                chekSeatNum = sc.nextInt();

                                if (chekSeatNum % 2 == 0 && chekSeatNum >= 38 && chekSeatNum <= 54) { //перевіряється чи введене значення в межах та парне


                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) { //перевіряється чи існує такий квиток методом
                                        seatNum = chekSeatNum;   //якщо так значення присвоюється іншому значенню після чого квиток буде куплений
                                        break;                   // випргуємо з безкінечного цикла
                                    } else {        // якщо киток не існує в масиві квитків то виводеться повідомлення про це
                                        System.out.println("Квиток вже куплений\nБудь ласка виберіть інше місце");
                                        System.out.println();
                                    }

                                } else {

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");
                                }


                            }

                        }


                        if (checkSeatPlace == 1 && polka == 2) {// якщо місце 1 полиця дорівнює 2 то і далі все аналогічно логіці яка написана вище

                            for (int i; ; ) {

                                System.out.println("Введіть парний номер місця \nвід 1 до 36");
                                chekSeatNum = sc.nextInt();

                                if (chekSeatNum > 1 && chekSeatNum <= 35) {


                                    if (ticketsEaqualsChekerd(1, chekSeatNum)) {
                                        seatNum = chekSeatNum;
                                        break;
                                    } else {
                                        System.out.println("Квиток вже куплений\nБудь ласка виберіть інше місце");
                                        System.out.println();
                                    }

                                } else {

                                    System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");
                                }


                            }

                        }


                    } else if (wagonNum == 2) {
                        int chekSeatNum = 0;

                        for (int i; ; ) {


                            System.out.println("Введіть номер місця \nвід 1 до 36");
                            chekSeatNum = sc.nextInt();

                            if (chekSeatNum > 0 && chekSeatNum <= 36) {

                                if (ticketsEaqualsChekerd(2, chekSeatNum)) {
                                    seatNum = chekSeatNum;
                                    break;
                                } else {
                                    System.out.println("Квиток вже куплений\nБудь ласка виберіть інше місце");
                                    System.out.println();
                                }
                            } else {

                                System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");

                            }

                        }


                    } else if (wagonNum == 3) {
                        int chekSeatNum = 0;

                        for (int i; ; ) {
                            System.out.println("Введіть номер місця \nвід 1 до 18");
                            chekSeatNum = sc.nextInt();

                            if (chekSeatNum > 0 && chekSeatNum <= 18) {

                                if (ticketsEaqualsChekerd(3, chekSeatNum)) {

                                    seatNum = chekSeatNum;
                                    break;
                                } else {
                                    System.out.println("Квиток вже куплений\nБудь ласка виберіть інше місце");
                                    System.out.println();
                                }
                            } else {

                                System.out.println("Ви ввели невірне значення!!\nБудь ласка введіть значення ще раз");

                            }

                        }


                    }else if (wagonNum < 1 | wagonNum > 3){ // якщо юзер вибрав вагон якого неіснує то виведеться повідомлення про це
                        System.out.println("Ви ввели не вірне значення " +
                                "будь ласка введіть значення ще раз");
                        System.out.println();
                        break;


                    }

                    System.out.println("\t\t\tВи купили квиток: ");
                    showTicketInfo(wagonNum, seatNum);

                    buyTicket(wagonNum, seatNum);


                    System.out.println("\t0.- Вийти з программи\n" +
                            "\t1.- " + showOneTicketInfo + "\n" +
                            "\t2.- " + returTicket + " \n" +
                            "\t3.- " + buyTicket + " \n" +
                            "\t4.- " + incasate + "\n");

                    selected = sc.nextInt();

                }


                while (selected == 4) {      // якщо юзер вибрав 4 то
                    System.out.println("\t\t" + incasate);

                    encashment();     // викликається метод який показує кількість грошей в касі та іншу корисну інформацію


                    System.out.println("\t0.- Вийти з программи\n" + // після чого виводиться попереднє меню
                            "\t1.- " + showOneTicketInfo + "\n" +
                            "\t2.- " + returTicket + " \n" +
                            "\t3.- " + buyTicket + " \n" +
                            "\t4.- " + incasate + "\n");

                    selected = sc.nextInt();


                }
                if (selected == 0) {   // якщо юзер вибрав 0 то
                    saveCounter++;  // щотчик кількості разві збереження програми спрацьовую та
                    saveArrayList();// вся інформація зберігається
                    saveCounters();
                    saveSaveCounter();

                    System.out.println("Кінець программи! :)");
                }

            }

        }
    }


