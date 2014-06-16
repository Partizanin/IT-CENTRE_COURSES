package OOP.week4.classwork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 12:32.
 * To change this template use File|Settings|File Templates.
 */
public class Group {

    private List<Student> stud = new ArrayList<Student>();

    public void AddStudent(String name,int age,int id ){
        Student s = new Student();
        s.name = name;
        s.age = age;
        s.id = id;

        stud.add(s);

    }

    public void ShowAllStudent(){
        int i = 1;
       for (Student student : stud){

           System.out.println( i + ":" + student + " ");
           i++;
           System.out.println();
       }

    }

    public void RemouveStudent(int id){

        stud.remove(id);

    }



    private class Student{

    String name;
    int age,id;

        int i = 0;


    void SayHello(){

        stud.get(id);

    }

        @Override
        public String toString() {
            return "Student" +
                    "\nName:" + name +
                    "\nAge:" + age +
                    "\nId:" + id ;
        }
    }
}
