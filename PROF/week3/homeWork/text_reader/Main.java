package PROF.week3.homeWork.text_reader;

import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.05.2014
 * Time: 19:13
 * To change this template use File|Setting|File Templates.
 */
public class Main {
    public static void main(String[] args) {
        SmoothReader smoothReader = new SmoothReader("c:\\Users\\user\\Desktop\\Task1.txt");
        Thread thread = new Thread(smoothReader);
        thread.start();

        try {
            while (System.in.read() == 10) {
                if (!smoothReader.isPaused) {
                    smoothReader.isPaused = true;
                } else {
                    smoothReader.isPaused = false;
                    synchronized (smoothReader) {
                        smoothReader.notifyAll();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
