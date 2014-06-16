package PROF.week3.classWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 17.05.2014
 * Time: 17:38
 * To change this template use File|Setting|File Templates.
 */
public class Server {

    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(30000);
            Socket socket = ss.accept();
            for (;;) {
                System.out.println("Input your name");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));



                String s = br.readLine();

                if (s.equals("stop")) {
                    System.out.println("server stopped");
                    pw.print("server stopped");
                    pw.flush();

                    ss.close();
                    socket.close();
                }

                System.out.println(s);



                pw.println("hello "+ s);
                pw.flush();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }





    }
}
