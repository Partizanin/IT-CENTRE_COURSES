package PROF.week1.classWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 12:43
 * To change this template use File|Setting|File Templates.
 */
public class Ex1 {

        public static void main(String[] args) {
            final String path = "C:/TEXT.TXT";
            BufferedReader br;
            ArrayList list = new ArrayList();
            try {
                br = new BufferedReader(new FileReader(path));
                String s = br.readLine();
                //readAndReverse(br, s);
                readRev(br);
                System.out.println(calcNumberCount(list));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        public static void readAndReverse(final BufferedReader br, String line) throws IOException {
            if (line != null) {
                readAndReverse(br, br.readLine());
                System.out.println(line);
            }
        }

        public static void readRev(final BufferedReader br) throws IOException {
            String line;
            List<String> lines = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        }

        public static int calcNumberCount(List<String> lines) {
            int count = 0;
            for (String line : lines) {
                String[] words = line.split(" ");
                for (String word : words) {
                    try {
                        Integer.parseInt(word);
                        count++;
                    } catch (NumberFormatException e) {

                    }
                }
            }
            return count;
        }

    }

