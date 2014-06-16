package OOP.week2.homework;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.awt.*;
import java.io.FileReader;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:02.02.14
 * Time: 11:49.
 * To change this template use File|Settings|File Templates.
 */
public class Reader {
    public static void main(String[] args)throws Exception{
        FileReader fr = new FileReader("C:\\Users\\Partizanin\\Desktop\\Input.txt");


        int res  =  fr.read();

        while (res != -1){
            System.out.print((char)res );
            res = fr.read();
        }

    }


}
