package OOP.week1.homeWork;




/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:21.01.14
 * Time: 17:51.
 * To change this template use File|Settings|File Templates.
 */
public class Company {
    Workers [] workers = new Workers[100];
    Adress adress;
    int index = 0;

    public  Company(){

    }


    public Company(Adress adress){
        this.adress = adress;

    }

    void ShowAllWorkers(){
        System.out.println();
        System.out.println("List of workers: ");

        for (int i = 0;i < index;i++){

            System.out.println((i+1) + ". " +workers[i].ShoworkerInfo());
            System.out.println();
        }


    }

    void Showemployees(){
        System.out.println();
        System.out.println("Employees in company is: " + index + ".");

    }



    public void addNewWorker(Workers worker){

        workers[index] = worker;
        index++;
    }

    public void showAdress(){
        System.out.println("Company Adress");
        adress.shovAdress();
    }
    public void  ShowCompanyInfo(){
       showAdress();
        Showemployees();
        ShowAllWorkers();

    }

    public void showTwelwsYearWorkers(){
        System.out.println();
        System.out.println("Workers who work more year");

        for (int i = 0;i < index;i++){
            if (workers[i].worktime > 12){

                System.out.println((i+1) + ". " +workers[i].ShoworkerInfo());
                System.out.println();
            }


        }

    }

    public void showGirlsWhoLiveInKiev(){
        System.out.println();
        System.out.println("Girls who live in kiev");
        for (int i = 0;i < index;i++){
            if (workers[i].adress.city.equals("Kiev") && workers[i].sex.equals("Female")){

                System.out.println((i+1) + ". " +workers[i].ShoworkerInfo());
                System.out.println();
            }


        }

    }

    public void DismissLastEmployeer(){
      index --;
        for (int i = 0;i < index;i++){
            workers[i] = workers[i];
            System.out.println((i+1) + ". " +workers[i].ShoworkerInfo());
            System.out.println();
        }


    }

    public void DismissBadEmployeer(){

        for (int i = 0;i < index;i++){

            if (workers[i].salary < 1000 && workers[i].worktime < 12){

                Workers temp = workers[i];
                workers[i] = workers[index-1];
                workers[index-1]=temp;

                index--;
            }
            System.out.println((i + 1) + ". " + workers[i].ShoworkerInfo());
        }

    }



    public void LisWorkersManAndGirls(){

        for (int i = 0;i < index;i++){
            if (workers[i].sex.equals("Male")){

                System.out.println((i+1) + ". " +workers[i].ShoworkerInfo());
                System.out.println();
            }




        }
        for (int i = 0;i < index;i++){

        if (workers[i].sex.equals("Female")){
            System.out.println((i+1) + ". " +workers[i].ShoworkerInfo());
            System.out.println();
        }
        }

    }








}
