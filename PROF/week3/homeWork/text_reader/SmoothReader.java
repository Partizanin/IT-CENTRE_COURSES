package PROF.week3.homeWork.text_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.05.2014
 * Time: 19:12
 * To change this template use File|Setting|File Templates.
 */
class SmoothReader implements Runnable{
        public static volatile boolean isPaused;
        private FileReader fileReader;
        private BufferedReader bufferedReader;

        SmoothReader(String fileName) {
            try {
                fileReader = new FileReader(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            bufferedReader = new BufferedReader(fileReader);
        }

        @Override
        public void run() {
            String buffer = "";
            try {
                synchronized (this) {
                    while ((buffer = bufferedReader.readLine()) != null){
                        if (!isPaused){
                            System.out.println(buffer);
                            Thread.sleep(1000);
                        } else {
                            this.wait();
                            System.out.println(buffer);
                        }

                    }
                    System.exit(0);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

