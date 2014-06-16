package MyProjects.CalendarCount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 02.05.2014
 * Time: 19:37
 * To change this template use File|Setting|File Templates.
 */
public class ProgView extends JFrame {

    private JPanel p1 = new JPanel();
    private TextField textFieldYear1 = new TextField();
    private TextField textFieldMonth1 = new TextField();
    private TextField textFieldDay1 = new TextField();
    private TextField textFieldHour1 = new TextField();
    private TextField textFielDMinutes1 = new TextField();
    private TextField textFieldYear2 = new TextField();
    private TextField textFieldMonth2 = new TextField();
    private TextField textFieldDay2 = new TextField();
    private TextField textFieldHour2 = new TextField();
    private TextField textFielDMinutes2 = new TextField();

    private JLabel lableYear1 = new JLabel("Year");
    private JLabel labelMonth1 = new JLabel("Month");
    private JLabel labelDay1 = new JLabel("Day");
    private JLabel labelHour1 = new JLabel("Hour");
    private JLabel labelMinutes1 = new JLabel("Minutes");
    private JLabel lableDate1 = new JLabel("DATE 1");


    private JTextArea textArea = new JTextArea("Year 12\nMonth 22\nDay 22\nHour   33\nMinutes 33\n");




    private JLabel lableYear2 = new JLabel("Year");
    private JLabel labelMonth2 = new JLabel("Month");
    private JLabel labelDay2 = new JLabel("Day");
    private JLabel labelHour2 = new JLabel("Hour");
    private JLabel labelMinutes2 = new JLabel("Minutes");
    private JLabel lableDate2 = new JLabel("DATE 2");

    private JButton buttonCount = new JButton("Порахувати");
    private JButton buttonCleen = new JButton("Очистити все");
    private JLabel err;


    public ProgView() {

        lableDate1.setForeground(Color.BLUE);
        lableDate2.setForeground(Color.BLUE);


        err = new JLabel("Wrong name or password");
        err.setForeground(Color.red);
        p1.setLayout(null);
        //x y width height
        textFieldYear1.setBounds(55, 25, 150, 22);
        textFieldMonth1.setBounds(55, 50, 150, 22);
        textFieldDay1.setBounds(55, 75, 150, 22);
        textFieldHour1.setBounds(55, 100, 150, 22);
        textFielDMinutes1.setBounds(65, 125, 150, 22);

        lableDate1.setBounds(100, 1, 50, 22);

        lableYear1.setBounds(15, 25, 50, 22);
        labelMonth1.setBounds(15, 50, 60, 22);
        labelDay1.setBounds(15, 73, 60, 22);
        labelHour1.setBounds(15, 95, 60, 22);
        labelMinutes1.setBounds(15, 125, 60, 22);


        textFieldYear2.setBounds(355, 25, 150, 22);
        textFieldMonth2.setBounds(355, 50, 150, 22);
        textFieldDay2.setBounds(355, 75, 150, 22);
        textFieldHour2.setBounds(355, 100, 150, 22);
        textFielDMinutes2.setBounds(355, 125, 150, 22);

        lableDate2.setBounds(400, 1, 50, 22);

        lableYear2.setBounds(300, 25, 50, 22);
        labelMonth2.setBounds(300, 50, 60, 22);
        labelDay2.setBounds(300, 73, 60, 22);
        labelHour2.setBounds(300, 95, 60, 22);
        labelMinutes2.setBounds(300, 125, 60, 22);





        textArea.setBounds(0, 150, 700, 200);








        err.setBounds(150, 30, 150, 20);
        buttonCount.setBounds(80, 400, 100, 30);
        buttonCleen.setBounds(200, 400, 100, 30);


        p1.add(textArea);


        p1.add(lableDate1);
        p1.add(textFieldYear1);
        p1.add(textFieldMonth1);
        p1.add(textFieldDay1);
        p1.add(textFieldHour1);
        p1.add(textFielDMinutes1);
        p1.add(lableYear1);
        p1.add(labelMonth1);
        p1.add(labelDay1);
        p1.add(labelHour1);
        p1.add(labelMinutes1);

        p1.add(lableDate2);
        p1.add(textFieldYear2);
        p1.add(textFieldMonth2);
        p1.add(textFieldDay2);
        p1.add(textFieldHour2);
        p1.add(textFielDMinutes2);
        p1.add(lableYear2);
        p1.add(labelMonth2);
        p1.add(labelDay2);
        p1.add(labelHour2);
        p1.add(labelMinutes2);


        p1.add(buttonCount);
        p1.add(buttonCleen);
        p1.add(err);
        err.setVisible(false);
        add(p1);



        setSize(600, 600);
        setLocation(300, 250);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonCount.addActionListener(new ButtonListener());
        buttonCleen.addActionListener(new ButtonListener());

    }

    public class ButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


    public static void main(String[] args) {
       new ProgView();
    }
}
