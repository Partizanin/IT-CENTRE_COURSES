package PROF.week3.classWork;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 17.05.2014
 * Time: 17:10
 * To change this template use File|Setting|File Templates.
 */
public class Client {

    private static int PORT = 30000;
    private static String ADRES = "localhost";

    public static void main(String[] args) throws IOException, ClassNotFoundException {



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


    public static Object returByteFiel() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("c:\\Users\\user\\Desktop\\Task1.txt");

        Scanner sc = new Scanner(fis);
        String  text = "";
        while (sc.hasNext()){

            text += sc.nextLine();
        }


        Object obj = text;

        fis.close();

        return obj;

    }

}
