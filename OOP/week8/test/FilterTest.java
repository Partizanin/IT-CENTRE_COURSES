package OOP.week8.test;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:21.03.2014
 * Time:15:12
 * To change this template use File|Settings|File Templates.
 */
public class FilterTest extends JFrame {

    public FilterTest() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        String[] columns = { "Name", "Surname", "Age", "Salary" };
        Object[][] rows = { {"Wasa", "Kolinow", 22, 310 }, {"Wasa", "Kolinow", 22, 310 },
                {"Wasa", "Kolinow", 22, 310 } };

        TableModel model = new DefaultTableModel(rows, columns);
        JTable table = new JTable(model);
        final TableRowSorter<TableModel> sorter;
        sorter = new TableRowSorter<TableModel>(model);
        table.setRowSorter(sorter);
        getContentPane().add(new JScrollPane(table));

        JPanel pnl = new JPanel();
        pnl.add(new JLabel("Filter expression:"));
        final JTextField txtFE = new JTextField(25);
        pnl.add(txtFE);
        JButton btnSetFE = new JButton("Set Filter Expression");
        ActionListener al;

        txtFE.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e) {
                String expr = txtFE.getText();
                sorter.setRowFilter(RowFilter.regexFilter(expr));
                sorter.setSortKeys(null);
            }
        });
        pnl.add(btnSetFE);
        getContentPane().add(pnl, BorderLayout.SOUTH);

        setSize(750, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FilterTest();
    }
}

