package OOP.week8.classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:22.03.2014
 * Time:12:35
 * To change this template use File|Settings|File Templates.
 */
public class GameFrame implements ActionListener{

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
    JButton bx = new JButton("X");
    JButton b0 = new JButton("0");
    JButton bres = new JButton("Restart");
    JPanel panel = new JPanel();

    GameFrame(){

        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLocation(400,200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        panel.setLayout(new GridLayout(3,3));

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
     /*   panel.add(b0);
        panel.add(bres);
        panel.add(bx);*/

        frame.getContentPane().add(panel);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
       /* b0.addActionListener(this);
        bres.addActionListener(this);
        bx.addActionListener(this);*/

        b1.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b2.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b3.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b4.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b5.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b6.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b7.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b8.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));
        b9.setFont(b1.getFont().deriveFont(Font.ROMAN_BASELINE, 50));

        /*b0.setFont(b1.getFont().deriveFont(1, 50));
        bres.setFont(b1.getFont().deriveFont(1, 50));
        bx.setFont(b1.getFont().deriveFont(1, 50));*/




    }
    int clicedcounter = 1;
    String type  = "0";
    Object[] mas = new Object[10];
    Object[] buttons = {b1,b2,b3,b4,b5,b6,b7,b8,b9};

    int size = 0;

    int[] chekcounter = new int[16];


    @Override
    public void actionPerformed(ActionEvent e) {





       JButton clicckedbutton = (JButton) e.getSource();





        if (clicckedbutton.equals(bres)){

            reset();

        }

        if (clicckedbutton.equals(b0)){
            type = "0";
            bx.setEnabled(false);
        }

        if (clicckedbutton.equals(bx)){
            type = "X";
            b0.setEnabled(false);
        }

            type = "0";
            clicckedbutton.setText(type);
            clicckedbutton.setEnabled(false);
            clicedcounter++;

            mas[size] = howButon((JButton) e.getSource());

            size++;



        bres.setEnabled(true);
        bres.setText("Restart");


        robot();

    }

    public Object howButon(JButton b){

        if (b.equals(b1)){
            return b1;
        }else if (b.equals(b2)){
            return b2;
        }else if (b.equals(b3)){
            return b3;
        }else if (b.equals(b4)){
            return b4;
        }else if (b.equals(b5)){
            return b5;
        }else if (b.equals(b6)){
            return b6;
        }else if (b.equals(b7)){
            return b7;
        }else if (b.equals(b8)){
            return b8;
        }else if (b.equals(b9)){
            return b9;
        }
        return 0;
    }

    public JButton chek(){

        if (b3.getText().equals(b5.getText()) && !b3.getText().equals("") && chekcounter[11] != 1 && b7.getText().equals("")){

            chekcounter[11] = 1;
            return b7;
        }else if (b7.getText().equals(b5.getText()) && !b7.getText().equals("") && chekcounter[12] != 1 && b3.getText().equals("")){

            chekcounter[12] = 1;
            return b3;
        }else if (b1.getText().equals(b2.getText()) && (!b1.getText().equals("")) && chekcounter[0] != 1 && b3.getText().equals("")){

            chekcounter[0] = 1;
            return b3;
        }else if (b4.getText().equals(b5.getText()) && !b4.getText().equals("") && chekcounter[1] != 1 && b6.getText().equals("")){

            chekcounter[1] = 1;
            return b6;
        }else if (b7.getText().equals(b8.getText()) && !b7.getText().equals("") && chekcounter[2] != 1 && b9.getText().equals("")){

               chekcounter[2] = 1;
            return b9;
        }else if (b2.getText().equals(b3.getText()) && !b2.getText().equals("") && chekcounter[3] != 1 && b1.getText().equals("")){

               chekcounter[3] = 1;
            return b1;
        }else if (b6.getText().equals(b5.getText()) && !b6.getText().equals("") && chekcounter[4] != 1 && b4.getText().equals("")){

               chekcounter[4] = 1;
            return b4;
        }else if (b8.getText().equals(b9.getText()) && !b8.getText().equals("")  && chekcounter[5] != 1 && b7.getText().equals("")){

            chekcounter[5] = 1;
            return b7;
        }else if (b1.getText().equals(b4.getText()) && !b1.getText().equals("") && chekcounter[6] != 1 && b7.getText().equals("")){
               chekcounter[6] = 1;
            return  b7;
        }else if (b2.getText().equals(b5.getText()) && !b2.getText().equals("") && chekcounter[13] != 1 && b8.getText().equals("")){

               chekcounter[13] = 1;
            return b8;
        }else if (b3.getText().equals(b6.getText()) && !b3.getText().equals("") && chekcounter[7] != 1 && b9.getText().equals("")){

               chekcounter[7] = 1;
            return b9;
        }else if (b9.getText().equals(b6.getText()) && !b9.getText().equals("") && chekcounter[8] != 1 && b3.getText().equals("")){

               chekcounter[8] = 1;
            return b3;
        }else if (b8.getText().equals(b5.getText()) && !b8.getText().equals("") && chekcounter[9] != 1 && b2.getText().equals("")){

               chekcounter[9] = 1;
            return b2;
        }else if (b7.getText().equals(b4.getText()) && !b7.getText().equals("") && chekcounter[10] != 1 && b1.getText().equals("")){

              chekcounter[10] = 1;
            return b1;
        }

            return null;
    }




    public void robot(){

        JButton selectbutton = null;
        JButton allbutton;
        JButton chek = chek();

        if (chek == null) {

            for (int j = 0; j < 9; j++) {

                allbutton = (JButton) buttons[j];

                if (allbutton.getText().equals("")) {

                    selectbutton = allbutton;
                    break;

                }

            }

            if (clicedcounter < 5) {

                assert selectbutton != null;
                selectbutton.setText("X");
                selectbutton.setEnabled(false);
            }

        }else {

            selectbutton = chek;
            assert false;
            selectbutton.setText("X");
            selectbutton.setEnabled(false);
        }


    }

    public boolean vincolor(){
        if (b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText()) && b1.getText() != null){

            b1.setBackground(Color.ORANGE);
            b2.setBackground(Color.ORANGE);
            b3.setBackground(Color.ORANGE);
            return true;
        }else if (b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText()) && b4.getText() != null) {

            b4.setBackground(Color.ORANGE);
            b5.setBackground(Color.ORANGE);
            b6.setBackground(Color.ORANGE);

        }

        return false;

    }

    public void reset(){


    }


    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
    }


}
