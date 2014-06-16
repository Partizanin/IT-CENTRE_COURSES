package PROF.week1.homeWork;

import java.io.*;
import java.util.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 01.05.2014
 * Time: 18:47
 * To change this template use File|Setting|File Templates.
 */


/*String next() - чтение одного слова в строке
   int nextInt() - чтение целого числа из строки или InputMismatchException
   String nextLine() - чтение всей строки
   boolean hasNext() - определение наличия в потоке данных
   boolean hasNextInt() - определение наличия в потоке целого int числа
   useDelemiter(String) - использует разделитель
   close() - закрытие сканнера, теперь нельзя использовать и NoSuchElementException*/

public class MyScanner {




    private boolean isClosed;
    private final Reader in;
    private String delemiter;


    public MyScanner(Reader in) {

        this.in = new BufferedReader(in);
    }

    public MyScanner(String src){

        char[] array = src.toCharArray();
        in = new BufferedReader(new CharArrayReader(array));

    }


    private void checkOnNull(String s){
        if (s.length() == 0){

            throw new NoSuchElementException();
        }
    }


    public String next(){

        StringBuilder stringBuilder = new StringBuilder();

        try {
            int codePoint;

            while ((codePoint = in.read()) != -1){
                if (Character.isSpaceChar(codePoint)){

                    break;
                }

                stringBuilder.append((char)codePoint);
            }

            isEndOfTheStream(codePoint);

        } catch (IOException e) {
            e.printStackTrace();
        }

        checkOnNull(stringBuilder.toString());

        return chekDelemiter(stringBuilder.toString());
    }

    private String chekDelemiter(String  str){

        if (delemiter == null){

            return str;
        }else {

            return refactor(str);
        }

    }

    private String refactor(String s){

        StringBuilder stringBuilder = new StringBuilder();

        String[] result = s.split(delemiter);

        for (String each : result){

            stringBuilder.append(each);
        }

        return stringBuilder.toString();

    }


    private void chekOnNull(String s){

        if (s.length() == 0){

            throw  new NoSuchElementException();
        }


    }


    public int nextInt(){

        StringBuilder stringBuilder = new StringBuilder();


        try {

            int codePoint;

            while ((codePoint = in.read()) != -1){

                if (Character.isSpaceChar(codePoint)){

                    throw new InputMismatchException();
                }

                if (!Character.isWhitespace(codePoint)){

                    stringBuilder.append((char) codePoint);
                }

            }

            isEndOfTheStream(codePoint);
        }catch (IOException e){
            e.printStackTrace();
        }
        checkOnNull(stringBuilder.toString());

        return Integer.parseInt(stringBuilder.toString());
    }

    public String nextLine(){
        StringBuilder stringBuilder = new StringBuilder();

        try {

            int codePoint;


            while ((codePoint = in.read()) != -1){


                if ((char) codePoint == '\r'){

                    break;
                }

                stringBuilder.append((char) codePoint);

            }

            isEndOfTheStream(codePoint);
        }catch (IOException e){

            e.printStackTrace();
        }

        checkOnNull(stringBuilder.toString());

        return chekDelemiter(stringBuilder.toString());
    }



    private void isEndOfTheStream(int codePoint){

        if (codePoint == -1){

            isClosed = true;
            closeStream();
        }

    }

    public boolean hasNext(){

        return !isClosed;
    }

    public boolean hasNextInt(){

        return !isClosed;
    }

    public MyScanner useDelemiter(String src){

        delemiter = src;

        return this;
    }

    public void close(){
        isClosed = true;
    }


    private void closeStream(){
        try {
            in.close();
        }catch (IOException e){

            e.printStackTrace();
        }
    }



}
