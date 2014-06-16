package OOP.week6.classwork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:03.03.14
 * Time:23:49
 * To change this template use File|Settings|File Templates.
 */
public class CalculatorEngine implements ActionListener {


    CalculatorView parent;


    char selectedAction = ' ';
    double currentResult = 0;


    CalculatorEngine(CalculatorView parent){

        this.parent = parent;


    }

    public void actionPerformed(ActionEvent e){

        JButton clickedButton = (JButton) e.getSource();
        String dispFieldText = parent.displayField.getText();

        double displayValue = 0;



        if(!"".equals(dispFieldText)){
            displayValue = Double.parseDouble(dispFieldText);


        }
        Object src = e.getSource();

        if(src == parent.buttonPlus){
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");

        }else if(src == parent.buttonMinus){
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonDivide){
            selectedAction = '/';
            currentResult =displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonMultiply){
            selectedAction = '*';
            currentResult =displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonBack){
            selectedAction = 'C';
            currentResult = displayValue;
            parent.displayField.setText("");
        }else if(src == parent.buttonEqual){

            if(selectedAction == '+'){
                currentResult +=displayValue;
                parent.displayField.setText(""+currentResult);
            }else if(selectedAction == '-'){
                currentResult -=displayValue;
                parent.displayField.setText(""+currentResult);
            }else if(selectedAction == '/'){
                currentResult /=displayValue;
                parent.displayField.setText(""+currentResult);
            }else if(selectedAction == '*'){
                currentResult *=displayValue;
                parent.displayField.setText(""+currentResult);
            }

        }else{
            String clickedButtonLabel = clickedButton.getText();
            parent.displayField.setText(dispFieldText + clickedButtonLabel);
        }
    }


}
