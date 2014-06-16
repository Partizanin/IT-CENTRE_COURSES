package OOP.week7.classwork;

import javax.swing.*;
import java.awt.*;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:15.03.14
 * Time:11:19
 * To change this template use File|Settings|File Templates.
 */
public class ScreanShowFile {

    String text;
    JFrame frame = new JFrame();
    TextArea textArea = new TextArea(text);
    JPanel windowContent = new JPanel();
    JTextField textField = new JTextField();
    JButton buttonLoad = new JButton("LOAD");
    JButton buttonSave = new JButton("SAVE");
//path E:\TestText.txt

    ScreanShowFile(){

        windowContent.setLayout(new GridLayout(3,1));

        textArea.setEnabled(true);
        textField.setEnabled(true);

        windowContent.add(textField);
        windowContent.add(buttonLoad);
        windowContent.add(buttonSave);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(490, 600);
        frame.setResizable(false);
        frame.getContentPane().add("Center",textArea);
        frame.getContentPane().add("South",windowContent);

        ProgEngine pe = new ProgEngine(this);

        buttonLoad.addActionListener(pe);
        buttonSave.addActionListener(pe);





    }



    public static void main(String[] args) {
        ScreanShowFile s = new ScreanShowFile();
    }



}
