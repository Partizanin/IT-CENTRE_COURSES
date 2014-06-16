package PROF.week3.homeWork.text_reader;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 20.05.2014
 * Time: 20:40
 * To change this template use File|Setting|File Templates.
 */
public class Main2 {

    public static void main(String[] args) throws FileNotFoundException {
        TextReader txtr = new TextReader();
        Thread thread = new Thread(txtr);
        thread.start();

        try {
            while (System.in.read() == 10) {
                if (!txtr.isPaused) {
                    txtr.isPaused = true;
                } else {
                    txtr.isPaused = false;
                    synchronized (txtr) {
                        txtr.notifyAll();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
