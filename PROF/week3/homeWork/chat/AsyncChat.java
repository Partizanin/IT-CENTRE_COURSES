package PROF.week3.homeWork.chat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 22.05.2014
 * Time: 14:39
 * To change this template use File|Setting|File Templates.
 */

/*
Написать чат, в котором можно отправлять и принимать сообщения в любом порядке.

Класс задания hw3.chat.AsyncChat
*/
public class AsyncChat extends  Thread {


    public static void main(String[] args) {
        new AsyncChat().start();
        try {
            new ChatClient().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void runFirstClient(){
        try {
            new ChatClient().run();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        runFirstClient();

    }


    AsyncChat(){
        new ChatServer().start();

}

    public static class ChatServer extends Thread {

        private static final int PORT = 9001;

        /**
         * Порт сервера
         */

        private static HashSet<String> names = new HashSet<String>();

        /**
         * Список всіх користувачів
         */
        private static HashSet<PrintWriter> writers = new HashSet<PrintWriter>();


        public void run(){
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
        private static class Handler extends Thread {
            private String name;
            private Socket socket;
            private BufferedReader in;
            private PrintWriter out;

            /**
             * Constructs a handler thread, squirreling away the socket.
             * All the interesting work is done in the start method.
             */

            public Handler(Socket socket) {
                this.socket = socket;
            }

            /**
             * Services this thread's client by repeatedly requesting a
             * screen name until a unique one has been submitted, then
             * acknowledges the name and registers the output stream for
             * the client in a global set, then repeatedly gets inputs and
             * broadcasts them.
             */
            public void run() {
                try {
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    // Create character streams for the socket.
                    in = new BufferedReader(new InputStreamReader(
                            socket.getInputStream()));
                    out = new PrintWriter(socket.getOutputStream(), true);

                    // Request a name from this client.  Keep requesting until
                    // a name is submitted that is not already used.  Note that
                    // checking for the existence of a name and adding the name
                    // must be done while locking the set of names.
                    while (true) {
                        out.println("SUBMITNAME");
                        name = in.readLine();
                        if (name == null) {
                            return;
                        }
                        synchronized (names) {
                            if (!names.contains(name)) {


                                System.out.println( name + ": connection to server on " + format.format(new GregorianCalendar().getTime()));
                                names.add(name);
                                break;
                            }
                        }
                    }

                    // Now that a successful name has been chosen, add the
                    // socket's print writer to the set of all writers so
                    // this client can receive broadcast messages.
                    out.println("NAMEACCEPTED");

                    for (PrintWriter writer : writers) {
                        writer.println("CONNECTION" +  name + ": connection to server on  " + format.format(new GregorianCalendar().getTime()));
                    }

                    writers.add(out);



                    // Accept messages from this client and broadcast them.
                    // Ignore other clients that cannot be broadcasted to.
                    while (true) {
                        String input = in.readLine();
                        if (input == null) {
                            return;
                        }
                        for (PrintWriter writer : writers) {
                            writer.println("MESSAGE " + name + ": " + input + "                      " + format.format(new GregorianCalendar().getTime()));
                            System.out.println("MESSAGE " + name + ": " + input + "                      " + format.format(new GregorianCalendar().getTime()));
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e);
                } finally {
                    // This client is going down!  Remove its name and its print
                    // writer from the sets, and close its socket.
                    if (name != null) {
                        names.remove(name);
                    }
                    if (out != null) {
                        writers.remove(out);
                    }
                    try {
                        socket.close();
                        if (writers.size() == 0){
                            System.err.println("All writers is exit\nServer stopped!!!");
                            System.exit(0);
                        }

                    } catch (IOException e) {

                    }
                }
            }
        }
    }


        public static class ChatClient {

            BufferedReader in;
            PrintWriter out;
            JFrame frame = new JFrame("Chatter");
            JTextField textField = new JTextField(40);
            JTextArea messageArea = new JTextArea(8, 40);

            /**
             * Constructs the client by laying out the GUI and registering a
             * listener with the textfield so that pressing Return in the
             * listener sends the textfield contents to the server.  Note
             * however that the textfield is initially NOT editable, and
             * only becomes editable AFTER the client receives the NAMEACCEPTED
             * message from the server.
             */
            public ChatClient() {

                // Layout GUI
                textField.setEditable(false);
                messageArea.setEditable(false);
                frame.getContentPane().add(textField, "North");
                frame.getContentPane().add(new JScrollPane(messageArea), "Center");
                frame.pack();

                // Add Listeners
                textField.addActionListener(new ActionListener() {
                    /**
                     * Responds to pressing the enter key in the textfield by sending
                     * the contents of the text field to the server.    Then clear
                     * the text area in preparation for the next message.
                     */
                    public void actionPerformed(ActionEvent e) {
                        out.println(textField.getText());
                        textField.setText("");
                    }
                });


            }

            /**
             * Prompt for and return the address of the server.
             */
            private String getServerAddress() {
                return JOptionPane.showInputDialog(
                        frame,
                        "Enter IP Address of the Server:",
                        "Welcome to the Chatter",
                        JOptionPane.QUESTION_MESSAGE);
            }

            /**
             * Prompt for and return the desired screen name.
             */
            private String getName() {
                return JOptionPane.showInputDialog(
                        frame,
                        "Choose a screen name:",
                        "Screen name selection",
                        JOptionPane.PLAIN_MESSAGE);
            }

            /**
             * Connects to the server then enters the processing loop.
             */
            private void run() throws IOException {

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                // Make connection and initialize streams
                String serverAddress = getServerAddress();
                Socket socket = new Socket(serverAddress, 9001);
                in = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // Process all messages from server, according to the protocol.
                while (true) {
                    String line = in.readLine();
                    if (line.startsWith("SUBMITNAME")) {
                        out.println(getName());
                    } else if (line.startsWith("NAMEACCEPTED")) {
                        textField.setEditable(true);
                    } else if (line.startsWith("MESSAGE")) {
                        messageArea.append(line.substring(8) + "\n");
                    } else if (line.startsWith("CONNECTION")) {
                        messageArea.append(line.substring(10) + "\n");
                    }
                }
            }

            /**
             * Runs the client as an application with a closeable frame.
             */

        }



}







