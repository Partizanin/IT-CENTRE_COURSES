package OOP.week8.homework;

import java.io.*;
import java.util.List;


/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:Partizanin
 * Date:19.03.2014
 * Time:15:43
 * To change this template use File|Settings|File Templates.
 */
public class SaveAndLoadWorkers  {

    static final String Arraypath = "D:\\Illia\\JAVA\\Курсы\\SaveWorker\\Save.txt";
    int saveCount = 0;
    String [] savepas = new String[3];
    private String Passpath = "d:\\Illia\\JAVA\\Курсы\\SaveWorker\\Savepas.txt";



    public void saveWorkers(List<Worker> list) throws IOException {


        FileOutputStream fos = new FileOutputStream(Arraypath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        saveCount++;

    }


    @SuppressWarnings("unchecked")
    public List<Worker> loadWorkers( ) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(Arraypath);
        ObjectInputStream ois = new ObjectInputStream(fis);

       List<Worker> list ;

         list = (List<Worker>) ois.readObject();
        ois.close();
        return list;


    }

    public void savepas(String [] save) throws IOException {
        FileOutputStream fos = new FileOutputStream(Passpath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(save);
        oos.close();
        saveCount++;


    }

    @SuppressWarnings("unchecked")
    public String [] loadpas() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(Passpath);
        ObjectInputStream ois = new ObjectInputStream(fis);



        savepas = (String[]) ois.readObject();
        ois.close();
        return savepas;



    }




}
