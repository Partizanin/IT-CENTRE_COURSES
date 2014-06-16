package OOP.week4.classwork;




/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:08.02.14
 * Time: 11:41.
 * To change this template use File|Settings|File Templates.
 */
public  class Person implements MyComparable {

    private int age;

  public Person(int age){
      super();
      this.age = age;
  }


    @Override
    public Integer compare(Object o) {
        if (o.getClass() != Person.class) {
            return null;
        }


        Person p = (Person) o;

        if (this.age < p.getAge()) {
            return -1;
        } else if (this.age > p.getAge()) {
            return 1;
        }

        return 0;
    }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person" +
                "\nAge:" + age
                ;
    }
}
