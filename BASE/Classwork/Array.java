package BASE.Classwork;

/**
 * Created by Partizanin on 21.12.13.
 * Створити масив та вивисти його змістивши на 2 позиції вперед
 * 12 14 13 10
 * 13 01 12 14
 */
public class Array {
    public static void main(String[] args) {

        reback(4);

    }

    public static void reback(int a) {

        int[] b = {12, 22, 33, 45};

        for (int i = b.length - 1; i >= 0; i--) {

            System.out.print(b[i] + " ");
        }
    }
}



