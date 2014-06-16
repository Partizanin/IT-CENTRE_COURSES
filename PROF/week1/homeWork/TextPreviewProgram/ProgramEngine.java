package PROF.week1.homeWork.TextPreviewProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 22:17
 * To change this template use File|Setting|File Templates.
 */
public class ProgramEngine implements ActionListener, KeyListener {

   ProgramView parent;
    int start = 0;
    int end = 255;

    List<String> FileText;


    public ProgramEngine(ProgramView parent) throws IOException {

        this.parent = parent;
        FileText = readFile();
        parent.textArea.setText(flipPageForward(FileText));


    }



    public static List<String> readFile() throws IOException {

      List<String> list = new ArrayList<String>();

        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\Task1.txt");
        Scanner sc = new Scanner(new FileReader("C:\\Users\\user\\Desktop\\Task1.txt"));


        int count = 0;

        while (sc.hasNext()){
            list.add(sc.next());
            count++;
        }
        fr.close();

        return list;

    }


    public String  flipPageForward(List<String> list){

        String res = "";
        parent.textArea.setText(res);

        int countRowLength = start + 10;




        for (int i = start; i < end; i++) {


            res += list.get(i);

            res += "  ";


            if (countRowLength == i){

                res += "\n";

                countRowLength +=10;
            }




        }



        start = end;

        end += end;


        return res;

    }




    public String  flipPageBack(List<String> list){

        String res = "";
        parent.textArea.setText(res);

        start -= start;
        end -= end;

        for (int i = start; i < end; i++) {

            res = list.get(i);

        }

        return res;

    }




    @Override
    public void actionPerformed(ActionEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getExtendedKeyCode());
      if (e.getExtendedKeyCode() == 10){

          parent.textArea.setText(flipPageForward(FileText));

      }

        if (e.getExtendedKeyCode() == 66){

            parent.textArea.setText(flipPageBack(FileText));
        }



    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
