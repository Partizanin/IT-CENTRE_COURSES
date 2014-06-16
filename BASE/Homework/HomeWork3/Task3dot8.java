package BASE.Homework.HomeWork3;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:34.
 * To change this template use File|Settings|File Templates.
 *
 * 3.8. Верхний регистр.

 Напишите программу, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ слов в верхний регистр и результат выводит в консоль

 Вход:
 иван васильевич

 Выход:
 Иван Васильевич
 *
 */
public class Task3dot8 {

    public  static void UpperCaseString(String Name,String Surname){
          char na = Name.charAt(0);
          char su = Surname.charAt(0);
          String n = Character.toString(na);
          String s = Character.toString(su);

         String name = Name.substring(1);
        String surname = Surname.substring(1);


        System.out.println(n.toUpperCase() + name);
        System.out.println(s.toUpperCase()+ surname);

    }
}
