package BASE.Homework.HomeWork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:29.12.13
 * Time: 14:25.
 * To change this template use File|Settings|File Templates.
 */
public class Task5dot5 {

    public static void main(String[] args) {
        String s = "Partаzаn" ;
        changeSimbol(s);
    }

    public static void changeSimbol(String line) {
        char[] symb3 = line.toCharArray();
        int count3 = 0;
        for (int i = 0; i < symb3.length; ++i) {
            if (symb3[i] == 'a')
                symb3[i] = '@';

            if(symb3[i] == 'а')
                symb3[i] = '@';
            if(symb3[i] == 'а')
                symb3[i] = '@';



        }
        System.out.println(symb3);
    }
}


