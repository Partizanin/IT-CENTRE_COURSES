package OOP.week7.classwork.ProgCard;

import javax.swing.*;
import java.awt.*;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:16.03.14
 * Time:13:43
 * To change this template use File|Settings|File Templates.
 */
public class ShowPersons {
    JFrame frame;

    TextArea textArea;

    ShowPersons(){
        frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textArea = new TextArea();

        frame.getContentPane().add(textArea);

    }
}
