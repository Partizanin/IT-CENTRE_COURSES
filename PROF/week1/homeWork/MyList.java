package PROF.week1.homeWork;


/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 01.05.2014
 * Time: 13:13
 * To change this template use File|Setting|File Templates.
 */
public interface MyList<I> {

    public void add(I value);

    public void add(int index,I value);

    public void remove(int index);

    public void set(int index,I value);

    public boolean contains(I value);

    public int size();

    public void clear();

    public boolean equals(MyArrayList list);


}
