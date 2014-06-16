package OOP.week3.classwork;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:02.02.14
 * Time: 12:16.
 * To change this template use File|Settings|File Templates.
 */
public class Writer {

    public static void main(String[] args) throws IOException {
     String path = "C:/Users/Partizanin/Desktop/Write.txt";
        String word = "This is for Demo";
   writeFile(word,path);


    }

    public static void writeFile(String word,String path)throws IOException{
        PrintWriter pr = null;

        try {
            pr = new PrintWriter(path);
            pr.write(word);
            pr.flush();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
