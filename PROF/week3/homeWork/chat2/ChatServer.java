package PROF.week3.homeWork.chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashSet;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 22.05.2014
 * Time: 17:57
 * To change this template use File|Setting|File Templates.
 */
    public class ChatServer extends Thread {

        private static final int PORT = 9001;

    public HashSet<String> getNames() {
        return names;
    }

    public HashSet<PrintWriter> getWriters() {
        return writers;
    }

    /**
     * Порт сервера
     */

        private HashSet<String> names = new HashSet<String>();

        /**
         * Список всіх користувачів
         */
        private  HashSet<PrintWriter> writers = new HashSet<PrintWriter>();


        public void run() {
            System.out.println("The chat server is running.");
            ServerSocket listener = null;
            try {
                listener = new ServerSocket(PORT);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                while (true) {
                    try {
                        new Handler(listener.accept()).start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                try {
                    listener.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * A handler thread class.  Handlers are spawned from the listening
         * loop and are responsible for a dealing with a single client
         * and broadcasting its messages.
         */

    }

