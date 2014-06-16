package OOP.week8.test;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:19.03.2014
 * Time:18:02
 * To change this template use File|Settings|File Templates.
 */

    public class TestFrame extends JFrame {

        static int i = 0;

        public TestFrame() {

            super("Тестовое окно");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ArrayList<MyBean> beans = new ArrayList<MyBean>();

            for (int i = 0; i < 3; i++) {
                beans.add(new MyBean("Имя " + i, "Размер " + i, "Описание " + i));
            }

            TableModel model = new MyTableModel(beans);
            JTable table = new JTable(model);

            getContentPane().add(new JScrollPane(table));

            setPreferredSize(new Dimension(260, 220));
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    new TestFrame();
                }
            });
        }

        public class MyTableModel implements TableModel {

            private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

            private List<MyBean> beans;

            public MyTableModel(List<MyBean> beans) {
                this.beans = beans;
            }

            public void addTableModelListener(TableModelListener listener) {
                listeners.add(listener);
            }

            public Class<?> getColumnClass(int columnIndex) {
                return String.class;
            }

            public int getColumnCount() {
                return 3;
            }

            public String getColumnName(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return "Имя";
                    case 1:
                        return "Размер";
                    case 2:
                        return "Описание";
                }
                return "";
            }

            public int getRowCount() {
                return beans.size();
            }

            public Object getValueAt(int rowIndex, int columnIndex) {
                MyBean bean = beans.get(rowIndex);
                switch (columnIndex) {
                    case 0:
                        return bean.getName();
                    case 1:
                        return bean.getSize();
                    case 2:
                        return bean.getDescription();
                }
                return "";
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return true;
            }

            public void removeTableModelListener(TableModelListener listener) {
                listeners.remove(listener);
            }

            public void setValueAt(Object value, int rowIndex, int columnIndex) {

            }

        }

        public class MyBean {

            private String name;
            private String size;
            private String description;

            public MyBean(String name, String size, String description) {
                this.setName(name);
                this.setSize(size);
                this.setDescription(description);
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String getSize() {
                return size;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDescription() {
                return description;
            }
        }
    }

