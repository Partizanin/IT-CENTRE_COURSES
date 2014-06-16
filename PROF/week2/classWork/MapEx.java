package PROF.week2.classWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 11.05.2014
 * Time: 15:39
 * To change this template use File|Setting|File Templates.
 */
public class MapEx {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();

        map.put(0,"0");
        map.put(1,"1");
        map.put(2,"2");

        Set<Integer> set = map.keySet();// взять сет ключей
        Collection<String> values = map.values();//Взять колекцию значений

        Set<Map.Entry<Integer,String>> entries = map.entrySet();

        for (Map.Entry<Integer,String> entry : entries){

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
