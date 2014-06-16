package OOP.week7.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:16.03.14
 * Time:8:28
 * To change this template use File|Settings|File Templates.
 */
public class Paint {



    JFrame frame;
    JButton colorButton;
    MyDrawPanel drawPanel;



    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300,300);
        frame.setLocation(600,250);
        frame.setVisible(true);

        colorButton = new JButton("Change Colors");




        colorButton.addActionListener(new ColorListener());



       drawPanel = new MyDrawPanel();


        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);



    }




    class ColorListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {


        frame.repaint();




    }
    }
}
