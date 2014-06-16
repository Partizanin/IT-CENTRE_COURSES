package OOP.week8.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:20.03.2014
 * Time:21:37
 * To change this template use File|Settings|File Templates.
 */
public class PasswordAndLoginFrame implements ActionListener {


    JLabel passlabel = new JLabel("Password");
     JLabel accountlabel = new JLabel("Login");
    JTextField textFieldaccount = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton buttonOk = new JButton("Ok");
    JButton buttonCancel = new JButton("Cancel");
    JFrame frame = new JFrame("Authorization");
    JCheckBox checkbox = new JCheckBox("Save password");
    JPanel pannlemain = new JPanel();
    JButton regbuttonOk = new JButton("Ok");
    JButton regbuttonCancel = new JButton("Cancel");
    JFrame regframe = new JFrame("Registration");
    JLabel regpasslabel = new JLabel("Password");
    JLabel regaccountlabel = new JLabel("Login");
    JTextField regacounttextfild = new JTextField();
    JPasswordField regpassfild = new JPasswordField();
    JPanel regpanel = new JPanel();
    JFrame startframe = new JFrame("Start");
    JButton startbuttonok = new JButton("Yes");
    JButton startbuttoncancel = new JButton("No");
    JTextField starttextField = new JTextField("           Registered?");
    JPanel startpanel = new JPanel();
    SaveAndLoadWorkers savLoadWorker = new SaveAndLoadWorkers();


    private String account = "";
    private String password = "";
    int count = 0;
    private String [] save = new String[3];


    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean isCorrect() {
        return password.equals(passwordField.getText()) && account.equals(textFieldaccount.getText());
    }

    public void start() {


        starttextField.setFont(buttonCancel.getFont().deriveFont(1,25));
        starttextField.setBackground(Color.black);
        startpanel.setLayout(new GridLayout(1, 2));
        startpanel.add(startbuttonok);
        startpanel.add(startbuttoncancel);
        startframe.getContentPane().add(BorderLayout.SOUTH, startpanel);
        startframe.getContentPane().add(BorderLayout.CENTER, starttextField);


        startframe.setLocation(550, 300);
        startframe.setSize(300, 100);
        startframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        starttextField.setEnabled(false);
        startframe.setVisible(true);
        startframe.setResizable(false);

        startbuttoncancel.addActionListener(this);
        startbuttonok.addActionListener(this);


    }

    public void loadProgram() {

        try {
            new ProgView();
        } catch (IOException w) {
            w.printStackTrace();
        } catch (ClassNotFoundException w) {
            w.printStackTrace();
        } finally {
            frame.setVisible(false);
        }


    }

    public void registration() {


        regpanel.setLayout(new GridLayout(1, 2));
        regframe.setLayout(new GridLayout(3, 2));
        regframe.add(regaccountlabel);
        regframe.add(regacounttextfild);
        regframe.add(regpasslabel);
        regframe.add(regpassfild);
        regpanel.add(regbuttonOk);
        regpanel.add(regbuttonCancel);
        regframe.add(regpanel);


        regframe.setLocation(550, 300);
        regframe.setSize(300, 100);
        regframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        regframe.setVisible(true);
        regframe.setResizable(false);


        regbuttonCancel.addActionListener(this);
        regbuttonOk.addActionListener(this);

    }

    public void reset() {

        pannlemain.setLayout(new GridLayout(1, 2));
        frame.setLayout(new GridLayout(3, 2));
        frame.add(accountlabel);
        frame.add(textFieldaccount);
        frame.add(passlabel);
        frame.add(passwordField);
        pannlemain.add(buttonOk);
        pannlemain.add(buttonCancel);
        frame.add(checkbox);
        frame.add(pannlemain);

        frame.setLocation(550, 300);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);


        buttonCancel.addActionListener(this);
        buttonOk.addActionListener(this);
        checkbox.addActionListener(this);

    }

    public void autorization() {

        if (count == 0) {

            pannlemain.setLayout(new GridLayout(1, 2));
            frame.setLayout(new GridLayout(3, 2));
            frame.add(accountlabel);
            frame.add(textFieldaccount);
            frame.add(passlabel);
            frame.add(passwordField);
            pannlemain.add(buttonOk);
            pannlemain.add(buttonCancel);
            frame.add(checkbox);
            frame.add(pannlemain);

            frame.setLocation(550, 300);
            frame.setSize(300, 100);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);


            buttonCancel.addActionListener(this);
            buttonOk.addActionListener(this);
            checkbox.addActionListener(this);

            count++;
        }

    }


    PasswordAndLoginFrame() {


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clikedbutton = new JButton();

        JCheckBox actionbox = new JCheckBox();
        if (e.getSource().getClass().equals(JButton.class)) {

            clikedbutton = (JButton) e.getSource();

        } else if (e.getSource().getClass().equals(JCheckBox.class)) {
            actionbox = (JCheckBox) e.getSource();
        }

        if (clikedbutton.equals(startbuttonok)) {
            registration();
            startframe.setVisible(false);
        }

        if (clikedbutton.equals(startbuttoncancel)) {
            autorization();
            startframe.setVisible(false);

            try {
                save = savLoadWorker.loadpas();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

            account = save[0];
            password = save[1];
        }


        if (clikedbutton.equals(regbuttonOk)) {
            setAccount(regacounttextfild.getText());
            setPassword(regpassfild.getText());
            autorization();
            regframe.setVisible(false);
        }
        if (clikedbutton.equals(regbuttonCancel)) {

            System.exit(0);
        }


        if (actionbox.equals(checkbox)) {
            save[0] = account;
            save[1] = password;
            textFieldaccount.setText(account);
            passwordField.setText(password);
            try {
                savLoadWorker.savepas(save);
            } catch (IOException e1) {
                e1.printStackTrace();
            }


        }

        if (clikedbutton.equals(buttonOk)) {

            for (int i; ; ) {
                if (isCorrect()) {

                    loadProgram();
                    frame.setVisible(false);
                    break;
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Problem with input text: '" + "'.",
                            "Input problem",
                            JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    break;


                }
            }


        }


        if (clikedbutton.equals(buttonCancel)) {
            System.exit(0);

        }

    }
}
