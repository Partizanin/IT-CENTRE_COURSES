package PROF.week1.homeWork.TextPreviewProgram;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 22:19
 * To change this template use File|Setting|File Templates.
 */
public class ProgramView {

    public static void main(String[] args) throws IOException {
        ProgramView p = new ProgramView();
    }

    String text;
    JFrame frame = new JFrame();
    TextArea textArea = new TextArea(text);
    JPanel windowContent = new JPanel();



    ProgramView() throws IOException {

        windowContent.setLayout(new GridLayout(3, 1));


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocation(300,80);
        frame.setResizable(false);
        frame.getContentPane().add("Center", textArea);
        frame.getContentPane().add("South", windowContent);

        ProgramEngine pe = new ProgramEngine(this);



        /*textArea.setText();*/
        textArea.setEditable(false);
        textArea.addKeyListener(pe);

    }
}
