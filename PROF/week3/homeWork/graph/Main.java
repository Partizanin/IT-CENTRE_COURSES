package PROF.week3.homeWork.graph;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 20.05.2014
 * Time: 12:16
 * To change this template use File|Setting|File Templates.
 */
class UserMenu {
    private Scanner scan = new Scanner(System.in);
    private ConsoleGraph.GraphX grX;
    private ConsoleGraph.GraphX2 grX2;
    private ConsoleGraph.GraphSinX grSinX;

    public UserMenu(){

    }

    public static void main(String[] args) {
        UserMenu prog = new UserMenu();
        prog.menuHello();
        prog.menuOneChoice();
    }

    private void menuHello(){
        System.out.println("*** **** **** **** *** *** *** ***");
        System.out.println("*** 'Console Math GraphX' by vg ***");
        System.out.println("*** **** **** **** *** *** *** ***");
        System.out.println();
    }

    private void menuOneChoice(){
        menuOne();
        String choice = scan.next();
        if (choice.equals("0")) {
            System.out.println(" >>> Вы вышли из программы..");
            System.exit(0);
        } else if (choice.equals("1")) {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println();
            startGraphX();
            continueProgram();
        } else if (choice.equals("2")) {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println();
            startGraphX2();
            continueProgram();
        } else if (choice.equals("3")) {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println();
            startGraphSinX();
            continueProgram();
        } else {
            System.out.println();
            System.out.println(" >>> Вы ввели недопустимое значение, попробуйте еще раз.");
            menuOneChoice();
        }
    }

    private void menuOne(){
        System.out.println("\t>>>\tВыбирете желаемый график для построения:\t<<<");
        System.out.println("'1'. Линейный (y = x )");
        System.out.println("'2'. Парабола (y = x^2)");
        System.out.println("'3'. Синусоидный (y = sin(x))");
        System.out.println("Для выхода нажмите '0'.");
        System.out.print("Сделайте ваш выбор: ");
    }

    private void continueProgram(){
        for (; ; ) {
            System.out.println(" >>> Для выхода нажмите 'enter' <<<");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextLine()){
                System.exit(0);
            }

        }
    }

    private void startGraphX(){
        try {
            grX = new ConsoleGraph.GraphX();
            grX.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startGraphX2(){
        try {
            grX2 = new ConsoleGraph.GraphX2();
            grX2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startGraphSinX(){
        try {
            grSinX = new ConsoleGraph.GraphSinX();
            grSinX.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}