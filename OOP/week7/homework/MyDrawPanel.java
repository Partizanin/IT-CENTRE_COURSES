package OOP.week7.homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:16.03.14
 * Time:8:46
 * To change this template use File|Settings|File Templates.
 */
public class MyDrawPanel extends JPanel {


    Paint p ;
    int start = 0;
    int counter = 0;
    public void paintComponent(Graphics g){


            g.fillRect(0,0,this.getWidth(),this.getHeight());

            int red = (int) (Math.random() * 255);

            int green = (int) (Math.random() * 255);

            int blue = (int) (Math.random() * 255);

            Color randomColor = new Color(red,green,blue);

            g.setColor(randomColor);

            g.fillOval(180,10,100,100);

            g.fillRect(10,10,100,100);



            }

        }
