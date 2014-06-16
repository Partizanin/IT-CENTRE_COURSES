package OOP.week8.homework;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:19.03.2014
 * Time:11:35
 * To change this template use File|Settings|File Templates.
 */
public class MytableModel  implements TableModel  {


    private List<Worker> workers ;

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    public MytableModel(List<Worker> list){

        this.workers = list;


    }


    public void addTableModeListener(TableModelListener listener){


        listeners.add(listener);
    }


    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Integer.class;

    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public String getColumnName(int columnIndex) {

        switch (columnIndex){
            case 0:
                return "Name";
            case 1:
                return "Surname";
            case 2:
                return "Age";
            case 3:
                return "Salary";
            case 4:
                return "Country";
            case 5:
                return "City";
            case 6:
                return "Street";
            case 7:
                return "House";
        }

        return "";

    }


    @Override
    public int getRowCount() {

        return workers.size();
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Worker w = workers.get(rowIndex);
        switch (columnIndex){
            case 0:
                return w.getName();
            case 1:
                return w.getSurname();
            case 2:
                return w.getAge();
            case 3:
                return w.getSalary();
            case 4:
                return w.getCountry();
            case 5:
                return w.getCity();
            case 6:
                return w.getStreet();
            case 7:
                return w.getHouse();
        }

        return "";
    }





    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }



    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {


    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener listener) {


    }

}
