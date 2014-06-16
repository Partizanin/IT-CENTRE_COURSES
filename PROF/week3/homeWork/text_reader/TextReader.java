package PROF.week3.homeWork.text_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 20.05.2014
 * Time: 20:22
 * To change this template use File|Setting|File Templates.
 */

/*
Написать текстовый ридер с плавным движением текста вниз. Текст читается из файла. Пауза от ентер.

Класс задания:
hw3.reader.TextReader
* */
public class TextReader extends Thread{


    public static void main(String[] args) {
        new TextReader().run();
    }


    private String text ;
    private Scanner console;
    public static volatile boolean isPaused;

    @Override
    public void run() {

        try {
            console = new Scanner(new FileReader("c:\\Users\\user\\Desktop\\Task1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (console.hasNext()){

            text += console.next().trim() + " /" ;
        }

        String[] s = text.split("/");


        for (;;){



        for (String value : s) {

            if (!isPaused){
            System.out.print(value);

            try {

                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            /*try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            }
        }


        }


        }

}
