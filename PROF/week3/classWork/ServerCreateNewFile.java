package PROF.week3.classWork;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 17.05.2014
 * Time: 22:32
 * To change this template use File|Setting|File Templates.
 */
public class ServerCreateNewFile {

    public static void main(String[] args) throws IOException {
        ServerCreateNewFile scnf = new ServerCreateNewFile();

        //scnf.serverCreate();
    }

    private final String PATH = "c:\\Users\\user\\Desktop\\HelloWord.txt";



    public void serverCreate() throws IOException {

        ServerSocket ss = new ServerSocket(30000);

        for (;;) {

            Socket socket = ss.accept();
            BufferedReader reader;


            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            System.out.println( reader.readLine());
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            pw.println("Input your name");
            pw.flush();
            pw.close();
            reader.close();
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readText = reader.readLine();

            for (;;) {
                System.out.println("hello " + readText);
                System.out.println("1 - Create file" +
                        "2 - Write text on file" +
                        "3 - Close program");

                String i = reader.readLine();

                if (i.equals("1")){

                    createNewFile(PATH);
                }

                if (i.equals("2")){

                    String s = reader.readLine();

                    writeTextFromFile(s,PATH);
                }

                if (i.equals("3")){

                    break;
                }
            }


            break;
        }
    }


    public void createNewFile(String path) throws IOException {

        File file = new File(path);

        if (!file.exists()){

            file.createNewFile();
        }
    }

    public void writeTextFromFile(String text,String path) throws IOException {
        FileWriter fw = new FileWriter(path);

        fw.write(text);
        fw.flush();
        fw.close();
    }


}
