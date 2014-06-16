package OOP.week1.classWork;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * Date:19.01.14
 * Time: 11:20.
 * To change this template use File|Settings|File Templates.
 */
public class Man {

    String name;
    int age;

    public Man(String name,int age){
        this.name = name;
        this.age = age;

    }

    public Man(String name){

        if (name.equals("Kolia")){
            this.name = name;
            System.out.println("Kolia");

        }else{
            this.name = name;
            System.out.println("Vasa");
        }

    }


}
