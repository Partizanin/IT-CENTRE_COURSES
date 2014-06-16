package OOP.week3.classwork;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:02.02.14
 * Time: 13:04.
 * To change this template use File|Settings|File Templates.
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {


        String path1 = "D:\\Demo";
        String path2 = "D:\\Demo\\Demo.txt";

        String path3 = "C:\\Users\\Partizanin\\Desktop\\Demo";
        String path4 = "C:\\Users\\Partizanin\\Desktop\\Demo\\Demo.txt";

        String word = "This if for Demo";


        file(path1,path2,path3,path4);

        Writer.writeFile(word,path2);

        Writer.writeFile(word,path4);

}

    public static void file(String path1,String path2,String path3,String path4) throws IOException {


        File f1 = new File(path1);
        File f2 = new File(path2);

        File f3 = new File(path3);
        File f4 = new File(path4);


        if (!f1.exists()) {
            f1.mkdir();
        }



        if (!f2.exists()){
            f2.createNewFile();
        }

        if (!f3.exists()){
            f3.mkdir();
        }

        if (!f4.exists()){
            f4.createNewFile();
        }

    }
}