package PROF.week3.homeWork.chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashSet;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 24.05.2014
 * Time: 20:00
 * To change this template use File|Setting|File Templates.
 */

class Handler extends Thread {
    private String name;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public HashSet<String> getNames() {
        return names;
    }

    public HashSet<PrintWriter> getWriters() {
        return writers;
    }

    private HashSet<String> names;
    private  HashSet<PrintWriter> writers;

    Handler(ChatServer chatserver){
        names = chatserver.getNames();
        writers = chatserver.getWriters();

    }


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
                        System.out.println(name + ": connection to server on " + format.format(new GregorianCalendar().getTime()));
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
                writer.println("CONNECTION" + name + ": connection to server on  " + format.format(new GregorianCalendar().getTime()));
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
                if (writers.size() == 0) {
                    // System.err.println("All writers is exit\nServer stopped!!!");
                    // System.exit(0);
                }

            } catch (IOException e) {

            }
        }
    }
}

