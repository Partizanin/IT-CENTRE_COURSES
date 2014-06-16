package PROF.week2.homeWork;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 16.05.2014
 * Time: 15:12
 * To change this template use File|Setting|File Templates.
 */

/*
* Написать собственную реализацию Хэш таблицы.
Реализовать методы:
1. put
2. get
3. size
4. remove

Класс задания hw2.hash.HashTable
* */
public class HashTable<K,V> {

    private transient Entry<?,?>[] table;

public synchronized V put(K key,V value){

    if (value == null){
        throw new NullPointerException();
    }

    Map.Entry<?,?> tab[] = table;

    int hash = key.hashCode();

    int index = (hash & 0x7FFFFFFF) % tab.length;

    Map.Entry<K,V> entry = (Entry<K,V>) tab[index];

   return value;

}


    private static class Entry<K,V> implements Map.Entry<K,V> {

        final int hash;
        final K key ;
        V value;
        Entry<K,V> next;

        protected Entry(int hash, K key, V value, Entry<K,V> next) {
            this.hash = hash;
            this.key =  key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {

            if (value == null)
                throw new NullPointerException();

                V oldValue = this.value;

                this.value = value;

                return oldValue;
        }
    }






    }
