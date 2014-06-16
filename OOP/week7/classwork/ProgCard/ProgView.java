package OOP.week7.classwork.ProgCard;

import javax.swing.*;
import java.awt.*;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:16.03.14
 * Time:11:28
 * To change this template use File|Settings|File Templates.
 */
public class ProgView {

    JFrame frame;
    JLabel labelName;
    JLabel labelAge;
    JLabel labelSex;
    JLabel labelAdress;
    JLabel labelCreditCard;
    JLabel labelAbout;
    JTextField textFieldName;
    JTextField textFieldAge;
    JComboBox box;
    JTextField textFieldAdress;
    JTextField textFieldCreditcard;
    TextArea textArea;
    JButton buttonSave;
    JButton buttonNew;
    JPanel panelTop;
    JPanel panelDown1;
    JPanel panelDown2;
    JPanel panelDownAll;
    JButton showListOfPersons;


    ProgView(){

        frame = new JFrame();
        frame.setSize(600,600);
        frame.setLayout(new GridLayout(2,1));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        labelName = new JLabel("Full name");
        textFieldName = new JTextField();
        labelAge = new JLabel("Age");
        textFieldAge = new JTextField();
        labelSex = new JLabel("Sex");
        box = new JComboBox();
        labelAdress = new JLabel("Addres");
        textFieldAdress = new JTextField();
        labelCreditCard = new JLabel("Credit Card");
        textFieldCreditcard = new JTextField();
        labelAbout = new JLabel("About");
        textArea = new TextArea();
        buttonNew = new JButton("New");
        buttonSave = new JButton("Save");
        showListOfPersons = new JButton("ShowAllPerson");

        panelTop = new JPanel();
        panelDown1 = new JPanel();
        panelDownAll = new JPanel();
        panelDown2 = new JPanel();
        panelDown1.setLayout(new GridLayout(2,1));
        panelDown1.add(labelAbout);
        panelDown1.add(textArea);
        panelDown2.setLayout(new GridLayout(1,3));
        panelDown2.add(buttonSave);
        panelDown2.add(buttonNew);
        panelDown2.add(showListOfPersons);

        panelDownAll.setLayout(new GridLayout(2,1));
        panelDownAll.add(panelDown1);
        panelDownAll.add(panelDown2);
        frame.getContentPane().add(panelTop);




        panelTop.setLayout(new GridLayout(5,1));

        box.addItem("Male");
        box.addItem("Female");
        panelTop.add(labelName);
        panelTop.add(textFieldName);
        panelTop.add(labelAge);
        panelTop.add(textFieldAge);
        panelTop.add(labelSex);
        panelTop.add(box);

        /*panelTop.add(bG);*/
        panelTop.add(labelAdress);
        panelTop.add(textFieldAdress);
        panelTop.add(labelCreditCard);
        panelTop.add(textFieldCreditcard);
        frame.getContentPane().add(panelDownAll);


        OOP.week7.classwork.ProgCard.ProgEngine pe = new OOP.week7.classwork.ProgCard.ProgEngine(this);
        buttonNew.addActionListener(pe);
        buttonSave.addActionListener(pe);
        box.addActionListener(pe);
        showListOfPersons.addActionListener(pe);


    }


}
