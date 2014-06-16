package OOP.week7.classwork;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name:Курсы
 * User:user
 * Date:15.03.14
 * Time:11:34
 * To change this template use File|Settings|File Templates.
 */
public class ReadFile {

    public String readFile(String path) throws IOException {

        String readFile = "";
        FileReader fr = new FileReader(path);

        int res = fr.read();

        while (res != -1){
          readFile +=(char) res;
            res = fr.read();
        }
        fr.close();

        return readFile;


    }



    public void writeFile(String text, String path) throws IOException{

        FileWriter fw = new FileWriter(path);

        fw.write(text);


        fw.close();

    }


}
