package OOP.week7.classwork;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:15.03.14
 * Time:12:05
 * To change this template use File|Settings|File Templates.
 */
public class ProgEngine implements ActionListener {
    ScreanShowFile parent;


    public ProgEngine(ScreanShowFile parent){

        this.parent = parent;


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton.equals(parent.buttonLoad)){

            ReadFile r = new ReadFile();
            try {
                parent.textArea.setText("");
                parent.textArea.setText(r.readFile(parent.textField.getText()));
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }else if (clickedButton.equals(parent.buttonSave)){

            ReadFile r = new ReadFile();

            try {
                r.writeFile(parent.textArea.getText(),parent.textField.getText());
                parent.textArea.setText("");
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }
    }


}
