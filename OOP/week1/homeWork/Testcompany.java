package OOP.week1.homeWork;



/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:21.01.14
 * Time: 18:44.
 * To change this template use File|Settings|File Templates.
 */
public class Testcompany{

    public static void main(String[] args) {

        Company company = new Company();
        Adress adress = new Adress("USA","New York","Wall Street","10");
        company.adress = adress;

        Workers workers1 = new Workers("Petya","Kilihewich","380968942543",500,"Male",20,3.5);
        Adress adress1 = new Adress("Ukraine","Donetsk","Kreshchatik","12");
        workers1.adress = adress1;
       company.addNewWorker(workers1);

        Workers workers2 = new Workers("Vassa","Pupkin","380968942543",1500,"Female",20,121.5);
        Adress adress2 = new Adress("Ukraine","Kiev","Kreshchatik","12");
        workers2.adress = adress2;
        company.addNewWorker(workers2);

        Workers workers3 = new Workers("Denis","vasechkin","380968942543",1500,"Male",20,121.5);
        Adress adress3 = new Adress("Ukraine","Yalta","Kreshchatik","12");
        workers3.adress = adress3;
        company.addNewWorker(workers3);

        Workers workers4 = new Workers("Kolia","Morozov","380968942543",1500,"Female",20,121.5);
        Adress adress4 = new Adress("Ukraine","Kiev","Kreshchatik","12");
        workers4.adress = adress4;
        company.addNewWorker(workers4);

        Workers workers5 = new Workers("Yarik","Dimchuk","380968942543",150,"Male",20,11.5);
        Adress adress5 = new Adress("Ukraine","Vinniva","Kreshchatik","12");
        workers5.adress = adress5;
        company.addNewWorker(workers5);

        Workers workers6 = new Workers("Oleg","Melnichenko","380968942543",1500,"Male",20,131.5);
        Adress adress6 = new Adress("Ukraine","Kiev","Kreshchatik","12");
        workers6.adress = adress6;
        company.addNewWorker(workers6);

        Workers workers7 = new Workers("Stas","Zalogin","380968942543",1500,"Female",20,121.5);
        Adress adress7 = new Adress("Ukraine","Kiev","Kreshchatik","12");
        workers7.adress = adress7;
        company.addNewWorker(workers7);

        Workers workers8 = new Workers("Misha","Matiash","380968942543",1500,"Male",20,25.5);
        Adress adress8 = new Adress("Ukraine","Getomer","Kreshchatik","12");
        workers8.adress = adress8;
        company.addNewWorker(workers8);

        Workers workers9 = new Workers("Valera","Kolinkov","380968942543",1500,"Male",20,30.5);
        Adress adress9 = new Adress("Ukraine","Dnipropetrovsk","Kreshchatik","12");
        workers9.adress = adress9;
        company.addNewWorker(workers9);

        Workers workers10 = new Workers("Dmitri","Mostovi","380968942543",150,"Female",20,2.5);
        Adress adress10 = new Adress("Ukraine","Kiev","Kreshchatik","12");
        workers10.adress = adress10;
        company.addNewWorker(workers10);

        company.ShowAllWorkers();
        company.DismissBadEmployeer();










    }
}
