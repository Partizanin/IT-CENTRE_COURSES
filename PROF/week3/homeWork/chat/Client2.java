package PROF.week3.homeWork.chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 22.05.2014
 * Time: 16:08
 * To change this template use File|Setting|File Templates.
 */
public class Client2 {

    private static int PORT = 8080;
    private static String ADRES = "localhost";


    public static void main(String[] args) {

        try {

            Socket socket = new Socket(ADRES,PORT);
            for (;;) {
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

                Scanner sc = new Scanner(System.in);

                pw.println(sc.nextLine());
                pw.flush();

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String s = br.readLine();

                if (s.equals("server stopped")){
                    System.out.println("Programm stopped");
                    System.exit(0);
                }


                System.out.println(s);
                System.out.println(socket.getInetAddress());
                System.out.println();

            }

        } catch (IOException e) {
            System.err.println("OOPS");
            e.printStackTrace();
        }
    }

}
