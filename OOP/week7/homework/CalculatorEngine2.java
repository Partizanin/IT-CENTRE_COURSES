package OOP.week7.homework;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:06.03.14
 * Time:16:03
 * To change this template use File|Settings|File Templates.
 */
public class CalculatorEngine2 implements ActionListener {



    CalculatorView parent;


    char selectedAction = ' ';
    double currentResult = 0;
    int eaquelCounter = 0;


    CalculatorEngine2(CalculatorView parent){

        this.parent = parent;


    }

    public void actionPerformed(ActionEvent e){

        JButton clickedButton = (JButton) e.getSource();
        String displayFieldText = parent.displaytext.getText();

        double displayValue = 0;



        if(!"".equals(displayFieldText)){
            displayValue = Double.parseDouble(displayFieldText);


        }
        Object src = e.getSource();

        if(src == parent.buttonPlus){
            selectedAction = '+';
            currentResult = displayValue;
            parent.displaytext.setText("");

        }else if(src == parent.buttonMinus){
            selectedAction = '-';
            currentResult = displayValue;
            parent.displaytext.setText("");
        }else if(src == parent.buttonDivide){
            selectedAction = '/';
            currentResult =displayValue;
            parent.displaytext.setText("");
        }else if(src == parent.buttonMultiply){
            selectedAction = '*';
            currentResult =displayValue;
            parent.displaytext.setText("");
        }else if(src == parent.buttonClear){
            selectedAction = 'C';
            currentResult = displayValue;
            parent.displaytext.setText("");
        }else if(src == parent.buttonEqual){


            if(selectedAction == '+'){
                currentResult +=displayValue;
                parent.displaytext.setText("" + currentResult);
            }else if(selectedAction == '-'){
                currentResult -=displayValue;
                parent.displaytext.setText("" + currentResult);
            }else if(selectedAction == '/'){
                currentResult /=displayValue;
                parent.displaytext.setText("" + currentResult);
            }else if(selectedAction == '*'){
                currentResult *=displayValue;
                parent.displaytext.setText("" + currentResult);
            }

            eaquelCounter++;

        }else{

            if (eaquelCounter == 1){
                displayFieldText = "";
                eaquelCounter --;
            }
            String clickedButtonLabel = clickedButton.getText();
            parent.displaytext.setFont(parent.buttonPlus.getFont().deriveFont(1,60));
            parent.displaytext.setText(displayFieldText + clickedButtonLabel);
        }
    }

}
