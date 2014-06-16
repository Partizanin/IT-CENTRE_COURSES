package PROF.week3.classWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 18.05.2014
 * Time: 16:49
 * To change this template use File|Setting|File Templates.
 */
public class SwingTask extends JFrame {


        private Thread th = new MyThread();
        private JPanel panel;
        private TextField tf;
        private JButton button1;
        private JButton button2;

        public SwingTask () {
            super("Timer");

            panel = new JPanel();
            tf = new TextField();
            button1 = new JButton("Start");
            button2 = new JButton("Stop");
            add(panel);
            panel.setLayout(null);

            tf.setBounds(10, 10, 120, 20);
            panel.add(tf);

            button1.setBounds(140, 10, 70, 20);
            panel.add(button1);

            button2.setBounds(215, 10, 70, 20);
            panel.add(button2);

            setSize(320, 100);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setVisible(true);
            setLocation(150, 100);

            button1.addActionListener(new ButtonListener1());
            button2.addActionListener(new ButtonListener2());

        }

        public class ButtonListener1 implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent e) {
                if (tf.getText().equals(null)) {
                    th.start();
                } else {
                    tf.setText("");
                    th.start();
                }
            }
        }

        public class ButtonListener2 implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                th.interrupt();

            }
        }

        class MyThread extends Thread {

            @Override
            public void run() {
                String s = "";
                for (int i = 0; i < 11 && !Thread.currentThread().isInterrupted(); i++) {
                    s = s + i;
                    tf.setText(s);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        i = 20;
                    }
                }

            }
        }
    }