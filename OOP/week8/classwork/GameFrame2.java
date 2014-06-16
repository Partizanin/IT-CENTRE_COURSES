package OOP.week8.classwork;

import javax.swing.*;
import java.awt.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 26.03.2014
 * Time: 18:27
 * To change this template use File|Setting|File Templates.
 */
public class GameFrame2 {

    JFrame frame = new JFrame("Хрестики Ноклики");
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JPanel p2 = new JPanel();
    JButton bx = new JButton("X");
    JButton b0 = new JButton("0");
    JButton bres = new JButton("Restart");
    JPanel panel = new JPanel();
    Label lable = new Label();




    GameFrame2() {

        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setLocation(400, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.BEFORE_FIRST_LINE,lable);


        panel.setLayout(new GridLayout(4, 3));

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);

        frame.getContentPane().add(BorderLayout.SOUTH,panel);


        p2.setLayout(new BorderLayout());
        p2.add(lable);
        b2.add(bx);
        p2.add(b0);
        p2.add(bres);


        frame.getContentPane().add(BorderLayout.NORTH,p2);



    }

    public static void main(String[] args) {
        GameFrame2 g = new GameFrame2();
    }
}
