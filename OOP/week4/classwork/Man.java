package OOP.week4.classwork;


/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 11:51.
 * To change this template use File|Settings|File Templates.
 */
public class Man implements Cloneable{
    private String name;
    private int age;
    private String adr;

    public  Man(String name,int age,String adr){
         super();
        this.name = name;
        this.age = age;
        this.adr = adr;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Man man = (Man) super.clone();
        man.name = this.name + "";
        man.adr = this.adr + "";
        return man;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adr='" + adr + '\'' +
                '}';
    }
}
