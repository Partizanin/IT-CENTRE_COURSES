package OOP.week7.homework;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:04.03.14
 * Time:9:34
 * To change this template use File|Settings|File Templates.
 */
public class CalculatorView {


    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonClear = new JButton("C");
    JButton buttonBack = new JButton("←");
    JButton buttonFact = new JButton("n!");
    JButton buttonSquare = new JButton("x²");
    JTextArea displaytext = new JTextArea();


    public  CalculatorView(){

        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        JFrame frame = new JFrame();
        frame.setSize(490,600);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(gbag);






        displaytext.setSize(100,200);
        displaytext.setEnabled(false);





        JLabel textlabel = new JLabel("display");
        textlabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        JPanel textfildpannel = new JPanel();
        textfildpannel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        textfildpannel.setLayout(new GridBagLayout());


        gbc.weightx = 0.1;
        gbc.weighty = 1.0;
        gbc.ipadx = 470;
        gbc.ipady = 160;




        gbc.anchor = GridBagConstraints.NORTHWEST;

        gbag.setConstraints(textfildpannel,gbc);

        textfildpannel.add(displaytext,gbc);

        frame.add(textfildpannel);



        JPanel panelForButtons = new JPanel();
        GridLayout buttons1Layout = new GridLayout(5,4);
        panelForButtons.setLayout(buttons1Layout);

        panelForButtons.add(button1);

        panelForButtons.add(button2);
        panelForButtons.add(button3);
        panelForButtons.add(buttonPlus);
        panelForButtons.add(button4);
        panelForButtons.add(button5);
        panelForButtons.add(button6);
        panelForButtons.add(buttonMinus);
        panelForButtons.add(button7);
        panelForButtons.add(button8);
        panelForButtons.add(button9);
        panelForButtons.add(buttonDivide);
        panelForButtons.add(button0);
        panelForButtons.add(buttonEqual);
        panelForButtons.add(buttonPoint);
        panelForButtons.add(buttonMultiply);
        panelForButtons.add(buttonClear);
        panelForButtons.add(buttonBack);
        panelForButtons.add(buttonFact);
        panelForButtons.add(buttonSquare);


        button1.setFont(button1.getFont().deriveFont(1,25));
        button2.setFont(button2.getFont().deriveFont(1,25));
        button3.setFont(button3.getFont().deriveFont(1,25));
        button4.setFont(button4.getFont().deriveFont(1,25));
        button5.setFont(button5.getFont().deriveFont(1,25));
        button6.setFont(button6.getFont().deriveFont(1,25));
        button7.setFont(button7.getFont().deriveFont(1,25));
        button8.setFont(button8.getFont().deriveFont(1,25));
        button9.setFont(button9.getFont().deriveFont(1,25));
        button0.setFont(button0.getFont().deriveFont(1,25));
        buttonPoint.setFont(buttonPoint.getFont().deriveFont(1,30));
        buttonPlus.setFont(buttonPlus.getFont().deriveFont(1,25));
        buttonMinus.setFont(buttonMinus.getFont().deriveFont(1,25));
        buttonDivide.setFont(buttonDivide.getFont().deriveFont(1,25));
        buttonMultiply.setFont(buttonMultiply.getFont().deriveFont(1,25));
        buttonEqual.setFont(buttonEqual.getFont().deriveFont(1,25));
        buttonClear.setFont(buttonEqual.getFont().deriveFont(1,25));
        buttonBack.setFont(buttonEqual.getFont().deriveFont(1,25));
        buttonFact.setFont(buttonEqual.getFont().deriveFont(1,25));
        buttonSquare.setFont(buttonEqual.getFont().deriveFont(1,25));





        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 2;
        gbc.gridheight =  0;
        gbc.ipady = 490;
        gbc.ipadx = 321;


        gbc.anchor = GridBagConstraints.SOUTHWEST;

        frame.add(panelForButtons,gbc);


        CalculatorEngine ce = new CalculatorEngine(this);
        button1.addActionListener(ce);
        button2.addActionListener(ce);
        button3.addActionListener(ce);
        button4.addActionListener(ce);
        button5.addActionListener(ce);
        button6.addActionListener(ce);
        button7.addActionListener(ce);
        button8.addActionListener(ce);
        button9.addActionListener(ce);
        button0.addActionListener(ce);
        buttonPoint.addActionListener(ce);
        buttonPlus.addActionListener(ce);
        buttonMinus.addActionListener(ce);
        buttonDivide.addActionListener(ce);
        buttonMultiply.addActionListener(ce);
        buttonClear.addActionListener(ce);
        buttonBack.addActionListener(ce);
        buttonFact.addActionListener(ce);
        buttonSquare.addActionListener(ce);




    }





}
