package OOP.week8.homework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:18.03.14
 * Time:11:55
 * To change this template use File|Settings|File Templates.
 */
public class ProgEngine implements ActionListener {

    ProgView parent;

    List<Worker> list = new ArrayList<Worker>(10);
    int id = 1;
    PasswordAndLoginFrame palf = new PasswordAndLoginFrame();

    ProgEngine(ProgView parent){

        this.parent = parent;

    }
    ProgEngine(){


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        String clikedButton = button.getText();


        String name = "";
        String sername = "" ;
        int age  = 0;
        double salary = 0 ;



        String country = "";
        String city  = "";
        String street  = "";
        String house  = "";




        if (clikedButton.equals(parent.buttonAdd.getText())){

            try {



             name = parent.textName.getText();
            sername = parent.textSurname.getText();
            age = Integer.parseInt(parent.textAge.getText());
            salary = Double.parseDouble(parent.textSalary.getText());



            country = parent.textCountry.getText();
            city = parent.textCity.getText();
            street = parent.textStreet.getText();
            house = parent.textHouse.getText();

            }catch (NumberFormatException n){

            }

            Worker worker = new Worker(name,sername,age,salary,id,country,city,street,house);

            list.add(worker);

            parent.listModel.addElement(worker);
            id++;

            if (list.size() <= 0){
                parent.buttonRemove.setEnabled(false);
                parent.buttonEdit.setEnabled(false);

            }else {
                parent.buttonEdit.setEnabled(true);
                parent.buttonRemove.setEnabled(true);
            }






            parent.table.setModel(new MytableModel(list));
            parent.table.repaint();

            parent.sortabel.setModel(new MytableModel(list));
            parent.sortabel.repaint();

            parent.serchtable.setModel(new MytableModel(list));
            parent.serchtable.repaint();








        }




        if (clikedButton.equals(parent.buttonNew.getText())){


            parent.textName.setText("");
            parent.textSurname.setText("");
            parent.textAge.setText("");
            parent.textSalary.setText("");
            parent.textCountry.setText("");
            parent.textCity.setText("");
            parent.textStreet.setText("");
            parent.textHouse.setText("");

            parent.buttonAdd.setEnabled(false);

        }

        if (clikedButton.equals(parent.buttonRemove.getText())) {

            System.out.println(parent.jList.getSelectedIndex());

            if (parent.jList.getSelectedIndex() < 0){
                JOptionPane.showMessageDialog(parent.frame,
                        "Yo must select row: '" + "'.",
                        "Selected problem",
                        JOptionPane.WARNING_MESSAGE);
            }else {
                if (list.size() <= 1) {
                    parent.buttonRemove.setEnabled(false);
                    parent.buttonEdit.setEnabled(false);

                }


                parent.buttonRemove.setFocusable(false);
                Worker w = parent.jList.getSelectedValue();
                list.remove(w);
                parent.listModel.remove(parent.jList.getSelectedIndex());


                System.out.println(list.size());

                id--;



                parent.table.setModel(new MytableModel(list));
                parent.table.repaint();

                parent.sortabel.setModel(new MytableModel(list));
                parent.sortabel.repaint();

                parent.serchtable.setModel(new MytableModel(list));
                parent.serchtable.repaint();
            }

        }

        if (clikedButton.equals(parent.buttonEdit.getText())) {

            if (parent.table.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(parent.frame,
                        "Yo must select row: '" + "'.",
                        "Selected problem",
                        JOptionPane.WARNING_MESSAGE);

            } else {


                try {



                    name = JOptionPane.showInputDialog("Input Name");
                    sername = JOptionPane.showInputDialog("Input Surname");
                    age = Integer.parseInt(JOptionPane.showInputDialog("Input Age"));
                    salary = Double.parseDouble(JOptionPane.showInputDialog("Input Salary"));
                    country = JOptionPane.showInputDialog("Input Country");
                    city = JOptionPane.showInputDialog("Input City");
                    street = JOptionPane.showInputDialog("Input Street");
                    house = JOptionPane.showInputDialog("Input House");
                    int id = parent.table.getSelectedRow();


                    Worker w = new Worker(name, sername, age, salary, id, country, city, street, house);
                    list.set(id, w);

                    parent.table.setModel(new MytableModel(list));
                    parent.table.repaint();
                    parent.listModel.set(id, w);
                    parent.jList.repaint();
                } catch (NumberFormatException n) {

                    JOptionPane.showMessageDialog(parent.frame,
                            "Yo must input some text: '" + "'.",
                            "Input problem problem",
                            JOptionPane.WARNING_MESSAGE);

                }




            }


        }
    }

    public void timer(){

        java.util.Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                task();
            }
        },10000);





    }


    public void task() {

        parent.frame.setVisible(false);
        palf.frame.setVisible(true);
    }
}
