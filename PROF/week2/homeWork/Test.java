package PROF.week2.homeWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 12.05.2014
 * Time: 15:53
 * To change this template use File|Setting|File Templates.
 */

/*Сравнить производительность списков, по следующим методам:
1. Добавление в начало
2. Добавление в конец
3. Добавление в середину
4. Удаление с конца
5. Удаление с начала
6. Получение элемента по индексу
7. Обход списка

Класс задания hw2.lab.ListsCompare
*/

public class Test {


    public static void main(String[] args) {
        ListsCompare lstc = new ListsCompare();

        long arrayListAddToStart = lstc.arrayListAddToStart() ;
        long arrayListAddToCenter =  lstc.arrayListAddToCenter();
        long arrayListAddToEnd = lstc.arrayListAddToEnd();
        long arrayListRemoveFromEnd = lstc.arrayListRemoveFromEnd();
        long arrayListRemoveFromStart = lstc.arrayListRenoveFromStart();
        long arrayListGetIndex = lstc.arrayListGetIndex();
        long bypassArrayList = lstc.bypassArrayList();


        long linkedListAddToStart = lstc.linkedListAddToStart();
        long linkedListAddToEnd = lstc.linkedListAddToend();
        long linkedListAddToCenter = lstc.linkedListAddToCenter();
        long linkedListRemoveFromEnd = lstc.linkedListRemoveFromEnd();
        long linkedListRemoveFromStart = lstc.linkedListRemoveFromStart();
        long linkedListGetIndex = lstc.linkedListGetIndex();
        long bypassLinkedList = lstc.bypassLinkedList();

        String res = "Добавление в начало\n " + "ArrayList = " + arrayListAddToStart +
                "\nLinkedList = " + linkedListAddToStart + "" +
                "\nРазница во времени = " + (arrayListAddToStart > linkedListAddToStart ?
                arrayListAddToStart - linkedListAddToStart :
                linkedListAddToStart - arrayListAddToStart) + "\n" +
                "-----------------------------------------------------------------------\n" +
                "Добавление в конец\n " + "ArrayList = " + arrayListAddToEnd +
                "\nLinkedList = " + linkedListAddToEnd + "" +
                "\nРазница во времени = " + (arrayListAddToEnd > linkedListAddToEnd ?
                arrayListAddToEnd - linkedListAddToEnd :
                linkedListAddToEnd - arrayListAddToEnd) + "\n" +
                "-----------------------------------------------------------------------\n" +
                "Добавление в середину\n " + "ArrayList = " + arrayListAddToCenter +
                "\nLinkedList = " + linkedListAddToCenter + "" +
                "\nРазница во времени = " + (arrayListAddToCenter > linkedListAddToCenter ?
                arrayListAddToCenter -  linkedListAddToCenter :
                linkedListAddToCenter - arrayListAddToCenter) + "\n" +
                "-----------------------------------------------------------------------\n" +
                "Удаление с начала\n " + "ArrayList = " + arrayListRemoveFromStart +
                "\nLinkedList = " + linkedListRemoveFromStart + "" +
                "\nРазница во времени = " + (arrayListRemoveFromStart > linkedListRemoveFromStart ?
                arrayListRemoveFromStart - linkedListRemoveFromStart :
                linkedListRemoveFromStart - arrayListRemoveFromStart) + "\n" +
                "-----------------------------------------------------------------------\n" +
                "Удаление с конца\n " + "ArrayList = " + arrayListRemoveFromEnd +
                "\nLinkedList = " + linkedListRemoveFromEnd + "" +
                "\nРазница во времени = " + (arrayListRemoveFromEnd > linkedListRemoveFromEnd ?
                arrayListRemoveFromEnd - linkedListRemoveFromEnd :
                linkedListRemoveFromEnd - arrayListRemoveFromEnd) + "\n" +
                "-----------------------------------------------------------------------\n" +
                "Получение елемента по индексу \n " + "ArrayList = " + arrayListGetIndex +
                "\nLinkedList = " + linkedListGetIndex + "" +
                "\nРазница во времени = " + (arrayListGetIndex > linkedListGetIndex ?
                arrayListGetIndex - linkedListGetIndex :
                linkedListGetIndex - arrayListGetIndex) + "\n" +
                "-----------------------------------------------------------------------\n" +
                "Обход списка\n " + "ArrayList = " + bypassArrayList +
                "\nLinkedList = " + bypassLinkedList + "" +
                "\nРазница во времени = " + (bypassArrayList > bypassLinkedList ?
                bypassArrayList  - bypassLinkedList
                : bypassLinkedList - bypassArrayList);


        System.out.println(res);


    }


    public  void createAndFillArray(){
       String[] strings = new String[1666666];


        for (int i = 0;i < 1666666;i++){

         strings[i] = "go go go" + "adsa" + i + "132";
        }

        System.out.println("\n" + strings.length);
    }


    public  long  timer(){

        return System.currentTimeMillis();
    }
}
