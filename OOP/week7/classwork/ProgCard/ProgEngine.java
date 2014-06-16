package OOP.week7.classwork.ProgCard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:16.03.14
 * Time:11:34
 * To change this template use File|Settings|File Templates.
 */
public class ProgEngine implements ActionListener {

    ProgView parent;
    Person p;


    public ProgEngine(ProgView parent){

        this.parent = parent;


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton  clickedButton = (JButton) e.getSource();
        String currentButtonn = clickedButton.getText();



        if (currentButtonn.equals(parent.buttonSave.getText())){
            String name = parent.textFieldName.getText();
            String age = parent.textFieldAge.getText();
            String sex = (String) parent.box.getSelectedItem();
            String addres = parent.textFieldAdress.getText();
            String creditCart = parent.textFieldCreditcard.getText();
            String about = parent.textArea.getText();
            p = new Person(name,age,sex,addres,creditCart,about);

            p.setPersonToArray(p);
        }else if (currentButtonn.equals(parent.buttonNew.getText())){
            parent.textFieldName.setText(" ");
            parent.textFieldAge.setText(" ");
            parent.textFieldAdress.setText(" ");
            parent.textFieldCreditcard.setText(" ");
            parent.textArea.setText(" ");
        }else if (currentButtonn.equals(parent.showListOfPersons.getText())){
            ShowPersons show = new ShowPersons();


            show.textArea.setText(p.showInfo());
        }





    }
}
