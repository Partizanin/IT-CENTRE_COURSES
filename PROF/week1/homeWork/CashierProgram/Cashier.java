package PROF.week1.homeWork.CashierProgram;

import PROF.week1.homeWork.CashierProgram.Products.Bread;
import PROF.week1.homeWork.CashierProgram.Products.Butter;
import PROF.week1.homeWork.CashierProgram.Products.Meat;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 30.04.2014
 * Time: 13:55
 * To change this template use File|Setting|File Templates.
 */
public class Cashier {

    Bread bread = new Bread();
    Butter butter = new Butter();
    Meat meat = new Meat();
    List<String> listOfProducts = new ArrayList<String>(3);
    List<Double> counterProducts = new ArrayList<Double>(3);


    Scanner sc = new Scanner(System.in);


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private BigDecimal price = BigDecimal.valueOf(0.00);

    public String getLOGIN() {
        return "Partizanin";
    }

    public String getPASSWORD() {
        return "95999599w";
    }

    Cashier(){

        listOfProducts.add(0,"bread");
        listOfProducts.add(1,"butter");
        listOfProducts.add(2,"meat");

        counterProducts.add(0,0.0);
        counterProducts.add(1,0.0);
        counterProducts.add(2,0.0);

    }




    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        cashier.test();

    }



    public void createBuying(){
        int choice;



        String all = "0 - Завершить покупку" +
                "\n1 - Добавить товар " +
                "\n2 - убрать товар " +
                "\n3 - Отменить покупку";


        for (;;){
            System.out.println();
            System.out.println(all);
            choice = sc.nextInt();

            if (choice >=0 && choice <=3){

                if (choice == 3){

                    counterProducts.clear();


                }

                if (choice == 2){
                    int delete;

                    showlistOfProducts();

                    System.out.println("Виберіть який із товарів убати: ");

                    System.out.println();
                    System.out.println("1 - " + listOfProducts.get(0) + "\n" +
                            "2 - " + listOfProducts.get(1) + "\n 3 - " + listOfProducts.get(2));
                    delete = sc.nextInt();

                    if (delete == 1){

                        counterProducts.set(0,0.0);
                    }

                    if (delete == 2){

                        counterProducts.set(1,0.0);
                    }

                    if (delete == 3){

                        counterProducts.set(2,0.0);
                    }

                    System.out.println();

                    showlistOfProducts();


                }

                if (choice == 1){
                    int buying;
                    double number;
                    System.out.println("1 - По штрихкоду\n2 - По списку");
                    buying = sc.nextInt();

                    if (buying == 1){
                        int code;

                        System.out.println("Введите код продкута");
                        code = sc.nextInt();

                        if (code == 111){


                            System.out.println("Укажите количество товара: ");
                            number = sc.nextInt();

                            price  = price.add((bread.getPrice().multiply(BigDecimal.valueOf(number))));

                            BigDecimal.valueOf(number).multiply(bread.getPrice());
                            counterProducts.add(0,number);



                        }else if (code == 112){


                            System.out.println("Укажите количество товара: ");
                            number = sc.nextInt();

                            price  = price.add((meat.getPrice().multiply(BigDecimal.valueOf(number))));


                            BigDecimal.valueOf(number).multiply(bread.getPrice());
                            counterProducts.add(1,number);


                        }else if (code == 113){



                            System.out.println("Укажите количество товара: ");
                            number = sc.nextInt();

                            price  = price.add((meat.getPrice().multiply(BigDecimal.valueOf(number))));


                            BigDecimal.valueOf(number).multiply(bread.getPrice());
                            counterProducts.add(2,number);


                        }else {
                            System.err.println("Ви ввели невірний код");
                        }



                    }


                    if (buying == 2){
                        int prod;
                        System.err.println("Виберете продукт:");
                        showlistOfProducts();

                        prod = sc.nextInt();
                        if (prod == 1){



                            System.out.println("Укажите количество товара: ");
                            number = sc.nextInt();


                            price  = price.add((bread.getPrice().multiply(BigDecimal.valueOf(number))));

                            BigDecimal.valueOf(number).multiply(bread.getPrice());
                            counterProducts.add(0,number);

                        }else if (prod == 2){



                            System.out.println("Укажите количество товара: ");
                            number = sc.nextInt();


                            price  = price.add((butter.getPrice().multiply(BigDecimal.valueOf(number))));

                            BigDecimal.valueOf(number).multiply(bread.getPrice());

                            counterProducts.add(1,number);


                        }else if (prod == 3){


                            System.out.println("Укажите количество товара: ");
                            number = sc.nextInt();


                            price  = price.add((meat.getPrice().multiply(BigDecimal.valueOf(number))));


                            BigDecimal.valueOf(number).multiply(bread.getPrice());
                            counterProducts.add(2,number);

                        }

                    }


                }


                if (choice == 0){


                    showlistOfBuyingProducts();

                    System.out.println();
                    System.out.println("Сумма покупки: " + price + "$");

                    System.exit(0);
                }


            }else {
                System.err.println("Ви вибрали неверное значение");
            }
        }



    }

    public void showlistOfProducts(){

        for (int i = 0; i < listOfProducts.size(); i++) {



            System.out.println((i+1) + " - " + listOfProducts.get(i));

        }
        System.out.println();

    }

    public void showlistOfBuyingProducts(){

        System.out.println();

        for (int i = 0; i < listOfProducts.size(); i++) {



            System.out.println((i+1) + " - " + listOfProducts.get(i) + " = " + counterProducts.get(i) + " $");

        }
        System.out.println();

    }


    public boolean signIn(){


        System.err.print("Input Login and Password for Sing In!!!");

        System.out.println("\n\nInput your Login\nLogin:");

        String login = sc.next();

        System.out.println();
        System.out.println("Input your Password\nPassword:");

        String password = sc.next();


        if (password.equals(getPASSWORD()) && login.equals(getLOGIN())){

            System.out.println("Welcome to the program <Cashier> ");

            return true;
        }

        if (!login.equals(getLOGIN()))
            System.err.println("Login is incorrect");

        if (!password.equals(getPASSWORD()))
            System.err.println("Password is incorrect");

        return false;
    }



    public void test(){
        Scanner sc = new Scanner(System.in);

        String all = "\n0 - Выход " +
                "1 - Cоздать покупку";
        boolean login = false;
        int choice = 3;



            /*login = signIn();*/

        if (true){

            for (;;) {

                System.out.println();
                System.out.println(all);




                if (choice == 3) {
                    try {

                        choice = sc.nextInt();

                    } catch (NullPointerException e) {
                        System.err.println("Ви ввели невірне значення\n Спробуйте ще раз");
                    } catch (InputMismatchException e) {
                        System.err.println("Ви ввели невірне значення\n Спробуйте ще раз");
                    }
                }




                if (choice == 0){

                    break;
                }else if (choice == 1){

                    createBuying();
                }else {
                    System.err.println("Ви ввели невірне число\nВведіть число знову");
                    choice = 3;
                }








            }



        }



    }

}

