package OOP.week7.homework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:04.03.14
 * Time:22:52
 * To change this template use File|Settings|File Templates.
 */
public class CalculatorEngine implements ActionListener {

    CalculatorView parent;

    char selectedAction = ' ';
    double dresult;
    long lresult;
    String currentAction = "";
    String textTemp1 = "" ;
    String textTemp2 = "" ;
    int actionCounter = 0;
    int displayActionCounter = 0;
    int equalCounter = 0;

    CalculatorEngine(CalculatorView parent){
        this.parent = parent;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();
        String displayFieldText = parent.displaytext.getText();

        if (clickedButton.getText().equals("+") |
                clickedButton.getText().equals("-") |
                clickedButton.getText().equals("/") |
                clickedButton.getText().equals("*")){
            actionCounter ++;
        }



       long iDisplayValue = 0;
        double dDisplayValue = 0;

        if (!"".equals(displayFieldText)){
            if (selectedAction == ' '){
            dDisplayValue = Double.parseDouble(displayFieldText);
            }
            }

        Object src = e.getSource();


        if (src == parent.buttonPlus){
            selectedAction = '+';
            currentAction = "+";

        }else if (src == parent.buttonMinus){


            selectedAction = '-';
            currentAction = "-";

        }else if (src == parent.buttonDivide){

            selectedAction = '/';
            currentAction = "/";

        }else if (src == parent.buttonMultiply){

            selectedAction = '*';
            currentAction = "*";

        }else if (src == parent.buttonEqual){

            if(selectedAction == '+'){
                long value1 = Long.parseLong(textTemp1);
                long value2 = Long.parseLong(textTemp2);
                lresult = value1 + value2 ;
                parent.displaytext.setText("" + lresult);
                textTemp1 = "";
                textTemp2 = "";
                selectedAction = ' ';

            }else if(selectedAction == '-'){
                long value1 = Long.parseLong(textTemp1);
                long value2 = Long.parseLong(textTemp2);
                lresult = value1 - value2 ;
                parent.displaytext.setText("" + lresult);
                textTemp1 = "";
                textTemp2 = "";
                selectedAction = ' ';
            }else if(selectedAction == '/'){

                double dvalue1 = Double.parseDouble(textTemp1);
                double dvalue2 = Double.parseDouble(textTemp2);
                long lvalue1 = Integer.parseInt(textTemp1);
                long lvalue2 = Integer.parseInt(textTemp2);
                lresult = lvalue1 / lvalue2 ;
                dresult = dvalue1 / dvalue2;
                if (dresult % 2 == 0){
                    parent.displaytext.setText("" + lresult);
                    textTemp1 = "";
                    textTemp2 = "";
                    selectedAction = ' ';

                }else {
                    parent.displaytext.setText("" + dresult);
                    textTemp1 = "";
                    textTemp2 = "";
                    selectedAction = ' ';

                }

            }else if(selectedAction == '*'){
                long value1 = Long.parseLong(textTemp1);
                long value2 = Long.parseLong(textTemp2);
                lresult = value1 * value2 ;
                parent.displaytext.setText("" + lresult);
                textTemp1 = "";
                textTemp2 = "";
                selectedAction = ' ';
            }

            equalCounter++;

        }else{
            if (equalCounter == 1){

                displayFieldText = "";
                equalCounter --;
            }



            if (selectedAction == ' '){
                String getText = clickedButton.getText();
                textTemp1 = textTemp1 + getText;
                System.out.println(textTemp1);
            }else{
                if (!clickedButton.getText().equals("+") &&
                        !clickedButton.getText().equals("-") &&
                        !clickedButton.getText().equals("/") &&
                        !clickedButton.getText().equals("*") &&
                        !clickedButton.getText().equals("C") &&
                        !clickedButton.getText().equals("x²") &&
                        !clickedButton.getText().equals("n!") &&
                        !clickedButton.getText().equals("x²") ){
                    String getText = clickedButton.getText();
                    textTemp2 = textTemp2 + getText;
                    System.out.println(textTemp2);
                }
            }


            String clickedButtonLabel = clickedButton.getText();
            parent.displaytext.setFont(parent.buttonPlus.getFont().deriveFont(1, 60));
            if (displayActionCounter < actionCounter){
            parent.displaytext.setText(displayFieldText + currentAction +  clickedButtonLabel );
                displayActionCounter++;
            }else {
                parent.displaytext.setText(displayFieldText + clickedButtonLabel );

            }


        }
        }


        }







