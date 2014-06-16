package PROF.week3.homeWork.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 22.05.2014
 * Time: 17:25
 * To change this template use File|Setting|File Templates.
 */
 public class MultiJabberServer {
        static final int PORT = 8080;

        public static void main(String[] args) throws IOException {
            ServerSocket s = new ServerSocket(PORT);
            System.out.println("Server Started");
            try {
                while (true) {
                    // Блокируется до возникновения нового соединения:
                    Socket socket = s.accept();
                    try {
                        new  JabberClient (socket);
                    }
                    catch (IOException e) {
                        // Если завершится неудачей, закрывается сокет,
                        // в противном случае, нить закроет его:
                        socket.close();
                    }
                }
            }
            finally {
                s.close();
            }
        }
    } // /:~

