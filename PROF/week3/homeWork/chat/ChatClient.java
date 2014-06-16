package PROF.week3.homeWork.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 22.05.2014
 * Time: 17:55
 * To change this template use File|Setting|File Templates.
 */
    public class ChatClient {

    BufferedReader in;
    PrintWriter out;
    JFrame frame = new JFrame("Chatter");
    JTextField textField = new JTextField(40);
    JTextArea messageArea = new JTextArea(8, 40);
    JPanel panel = new JPanel();
    JList<String> list = new JList<String>();

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
            panel.setLayout(new GridLayout(2,1));
            textField.setEditable(false);
            messageArea.setEditable(false);
            frame.getContentPane().add(textField, "North");
            panel.add(new JScrollPane(messageArea));
            frame.getContentPane().add(panel);
            panel.add(new JScrollPane(list));




            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.pack();
            frame.setSize(300,300);
            frame.setLocation(500,200);


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
            return "localhost"; /*JOptionPane.showInputDialog(
                    frame,
                    "Enter IP Address of the Server:",
                    "Welcome to the Chatter",
                    JOptionPane.QUESTION_MESSAGE);*/
        }

        /**
         * Prompt for and return the desired screen name.
         */
        private String getName() {
            return "Partizanin";/*JOptionPane.showInputDialog(
                    frame,
                    "Choose a screen name:",
                    "Screen name selection",
                    JOptionPane.PLAIN_MESSAGE);*/
        }

        /**
         * Connects to the server then enters the processing loop.
         */
        private void run() throws IOException {

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
                } else if (line.startsWith("CONNECTION")){
                    messageArea.append(line.substring(10) + "\n");
                }
            }
        }

        /**
         * Runs the client as an application with a closeable frame.
         */
        public static void main(String[] args) throws Exception {
            ChatClient client = new ChatClient();
            client.run();
        }
    }
