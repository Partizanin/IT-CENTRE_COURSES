package PROF.week2.homeWork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 15.05.2014
 * Time: 14:10
 * To change this template use File|Setting|File Templates.
 */
public class Testing {


        public static void main(String[] args) {

            HashMap<String,Integer> map = new HashMap<>();
            ValueComparator bvc =  new ValueComparator(map);
            TreeMap<String,Integer> sorted_map = new TreeMap<>(bvc);
            Freq freq = new Freq();

            String s = freq.generateRandomText(2000);
            String[] text = s.split(" ");

            for (String aText : text) {

                if (!map.containsKey(aText)) {

                    map.put(aText, 1);

                } else {

                    int value = map.get(aText) + 1;

                    map.put(aText, value);
                }
            }




            System.out.println("unsorted map: "+map);

            sorted_map.putAll(map);

            System.out.println("results: "+sorted_map);
        }
    }

    class ValueComparator implements Comparator<String> {

        Map<String,Integer> base;
        public ValueComparator(Map<String,Integer> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with equals.
        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }

