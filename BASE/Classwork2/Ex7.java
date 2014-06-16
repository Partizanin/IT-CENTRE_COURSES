package BASE.Classwork2;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:29.12.13
 * Time: 16:26.
 * To change this template use File|Settings|File Templates.
 *
 * Знайти слово з максимальной довжиной і вивести її на   екран
 */
public class Ex7 {
    public static void main(String[] args) {
        String[][]sa ={{"Smile"},{"Void"},{"Mass"},{"Length"}};
        System.out.println(sa.length);
      maxIndex(sa);


    }
    public static void maxIndex(String[][] s){
        String[][] max = new String[1][1];
        for (int i = 0; i < s.length;i++){
         for (int j = 0; j < s.length;j++){
            if(s[i][j].length() > s[i][j].length()){
                max[i][j] = s[i][j];
            }
         }
        }


        Ex1.printStringMatrix(max);
    }
}




