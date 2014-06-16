package PROF.week3.homeWork.chat;

import java.io.*;
import java.net.Socket;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 23.05.2014
 * Time: 11:52
 * To change this template use File|Setting|File Templates.
 */
public class JabberClient  extends Thread{
    private static Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public JabberClient(Socket s) throws IOException {
        socket = s;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // Включаем автоматическое выталкивание:
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket
                .getOutputStream())), true);
        // Если любой из вышеприведенных вызовов приведет к
        // возникновению исключения, то вызывающий отвечает за
        // закрытие сокета. В противном случае, нить
        // закроет его.
        start(); // вызываем start()
    }

    public void run() {
        try {
            while (true) {
                out.println("Input your name");
                String str = in.readLine();
                if (str.equals("END"))
                    break;
                System.out.println("Echoing: " + str);
                out.println(str);
            }
            System.out.println("closing...");
        }
        catch (IOException e) {
            System.err.println("IO Exception");
        }
        finally {
            try {
                socket.close();
            }
            catch (IOException e) {
                System.err.println("Socket not closed");
            }
        }
    }
}
