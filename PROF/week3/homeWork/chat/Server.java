package PROF.week3.homeWork.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 22.05.2014
 * Time: 15:11
 * To change this template use File|Setting|File Templates.
 */
public class Server extends Thread {

    public static void main(String[] args) {
       new Server().run();
    }

    public  void run() {

        ArrayList<Socket> list = new ArrayList<>();


        ServerSocket ss = null;
        try {
            ss = new ServerSocket(3000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Socket socket = null;

        try {
            list.add(socket = ss.accept());
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (;;) {
            pw.println("Hellow Client");
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }


            String s = null;
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (s.equals("stop")) {
                System.out.println("server stopped");
                pw.print("server stopped");
                pw.flush();
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //System.exit(0);
            }

            System.out.println(s);



            pw.println("hello "+ s);
            pw.flush();
        }

        }

}
