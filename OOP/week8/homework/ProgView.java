package OOP.week8.homework;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:17.03.14
 * Time:11:08
 * To change this template use File|Settings|File Templates.
 */
public class ProgView {


    final DefaultListModel<Worker> listModel;
    private final ProgEngine pe = new ProgEngine(this);
    SaveAndLoadWorkers sal = new SaveAndLoadWorkers();

     JFrame frame = new JFrame("         " +
            "                           " +
            "                           " +
            "Company  IT-CENTRE");
    private final JPanel panelAddNewWorker = new JPanel();
    private final JPanel panelRemoveWorker = new JPanel();
    final JTextField textName = new JTextField("Petya");
    final JTextField textAge = new JTextField("22");
    private final JTabbedPane tabbedPane = new JTabbedPane();
    final JButton buttonAdd = new JButton("Add");
    final JButton buttonNew = new JButton("New");
    final JButton buttonRemove = new JButton("Remove");
    final JTextField textSalary = new JTextField("120");
    final JTextField textCountry = new JTextField("Ukraine");
    final JTextField textCity = new JTextField("Kiev");
    final JTextField textStreet = new JTextField("Bratska");
    final JTextField textHouse = new JTextField("12");
    final JTextField textSurname = new JTextField("Vasechkin");
    final JTable table;
    TableModel model;
    final JList<Worker> jList;
    final JButton buttonEdit = new JButton("Edit");
    final JPanel panelEdit = new JPanel();
    JTable sortabel = new JTable();
    JTable serchtable;



    public ProgView() throws IOException, ClassNotFoundException {
        pe.list = sal.loadWorkers();
       /* pe.timer();*/


        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700,600);
        frame.setLocation(200,100);
        frame.setResizable(false);




        GridLayout gl = new GridLayout(9,2);

        panelAddNewWorker.setLayout(gl);

        panelAddNewWorker.add(new JLabel("Name"));
        panelAddNewWorker.add(textName);
        panelAddNewWorker.add(new JLabel("Sername"));
        panelAddNewWorker.add(textSurname);
        panelAddNewWorker.add(new JLabel("Age"));
        panelAddNewWorker.add(textAge);
        panelAddNewWorker.add(new JLabel("Salary"));
        panelAddNewWorker.add(textSalary);
        panelAddNewWorker.add(new JLabel("Country"));
        panelAddNewWorker.add(textCountry);
        panelAddNewWorker.add(new JLabel("City"));
        panelAddNewWorker.add(textCity);
        panelAddNewWorker.add(new JLabel("Street"));
        panelAddNewWorker.add(textStreet);
        panelAddNewWorker.add(new JLabel("House"));
        panelAddNewWorker.add(textHouse);
        panelAddNewWorker.add(buttonAdd);
        panelAddNewWorker.add(buttonNew);





        tabbedPane.add("Add New Worker", panelAddNewWorker);


        listModel = new DefaultListModel<Worker>();


        for (int i = 0; i < pe.list.size() ; i++) {
            listModel.addElement(pe.list.get(i));


        }





        jList = new JList<Worker>(listModel);




        panelRemoveWorker.setLayout(new BorderLayout());
        panelRemoveWorker.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelRemoveWorker.add(new JScrollPane(jList), BorderLayout.CENTER);



        panelRemoveWorker.add(BorderLayout.SOUTH, buttonRemove);

        tabbedPane.add("Remove Worker", panelRemoveWorker);


        buttonAdd.addActionListener(pe);
        buttonNew.addActionListener(pe);
        buttonRemove.addActionListener(pe);
        buttonEdit.addActionListener(pe);





        model = new MytableModel(pe.list);
        table = new JTable(model);

        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gbl = new GridBagLayout();

        panelEdit.setLayout(gbl);




        gbc.ipadx = 215;
        gbc.ipady = 50;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        panelEdit.add(new JScrollPane(table),gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 2;
        gbc.gridheight =  0;
        gbc.ipadx = 630;
        gbc.ipady = 40;
        gbc.anchor = GridBagConstraints.BASELINE;
        panelEdit.add(buttonEdit,gbc);









        tabbedPane.add("Show All Workers",new JScrollPane(panelEdit));





        Object[] [] rows = new Object[pe.list.size()][pe.list.size()];

        for (int i = 0; i <pe.list.size() ; i++) {


        rows[i] [i] = pe.list.toString();


        }

        String columns[] = {"Name","Surname","Age","Salary","Country","City","Street","House","ID"};
        TableModel sorttabmodel = new DefaultTableModel(rows,columns){

            public Class getColumnClass(int column){
                Class returnValue;

                if (column>=0 && column < getColumnCount()){

                    returnValue = getValueAt(0,column).getClass();

                }else {

                    returnValue = Object.class;
                }

                return returnValue;

            }
        };









        sortabel.setModel(model);
        sortabel.setRowSorter(new TableRowSorter<TableModel>(model));



        tabbedPane.add("Show Sorted Workers", new JScrollPane(sortabel));


        JPanel searchpanel = new JPanel();
        TableModel searchmodel = new MytableModel(pe.list);
         serchtable = new JTable(searchmodel);
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(searchmodel);
        serchtable.setRowSorter(sorter);
        final JTextField serchfild = new JTextField();
        JLabel serchlabel = new JLabel("Input word");

        GridBagConstraints gbc1 = new GridBagConstraints();
        GridBagLayout gbl1 = new GridBagLayout();

        searchpanel.setLayout(gbl1);




        gbc1.ipadx = 218;
        gbc1.ipady = 50;
        gbc1.anchor = GridBagConstraints.NORTHWEST;

        searchpanel.add(new JScrollPane(serchtable),gbc1);

        gbc1.gridy = 1;
        gbc1.gridx = 0;
        gbc1.weighty = 2;
        gbc1.gridheight =  0;
        gbc1.ipadx = 550;
        gbc1.ipady = 48;
        gbc1.anchor = GridBagConstraints.BASELINE;
        searchpanel.add(serchfild,gbc1);
        gbc1.gridy = 1;
        gbc1.gridx = 0;
        gbc1.weighty = 2;
        gbc1.gridheight =  0;
        gbc1.ipadx = 10;
        gbc1.ipady = 45;
        gbc1.anchor = GridBagConstraints.SOUTHWEST;
        searchpanel.add(serchlabel,gbc1);
        serchfild.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                String temp = serchfild.getText();
                sorter.setRowFilter(RowFilter.regexFilter(temp));
                sorter.setSortKeys(null);
            }
        });




        tabbedPane.add("Search Worker",new JScrollPane(searchpanel));








        frame.addWindowListener(new WindowListener() {

            public void windowActivated(WindowEvent event) {


            }

            public void windowClosed(WindowEvent event) {

            }

            public void windowClosing(WindowEvent event) {


                Object[] options = {"Да", "Нет!"};
                int n = JOptionPane
                        .showOptionDialog(event.getWindow(), "Закрыть окно?",
                                "Подтверждение", JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, options,
                                options[0]);
                if (n == 0) {

                   try {
                        sal.saveWorkers(pe.list);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }catch (NullPointerException nul){

                       System.out.println("Null ");

                   }

                    event.getWindow().setVisible(false);
                    System.exit(0);
                }
            }

            public void windowDeactivated(WindowEvent event) {

            }

            public void windowDeiconified(WindowEvent event) {

            }

            public void windowIconified(WindowEvent event) {

            }

            public void windowOpened(WindowEvent event) {

            }

        });

        if (pe.list.size() <= 0){
            buttonRemove.setEnabled(false);
            buttonEdit.setEnabled(false);

        }

        frame.addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                if (e.getSource() == null){

                    System.out.println("Ничего не происходит");
                }
            }
        });


    }



}
