package MyProjects;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 12.06.2014
 * Time: 20:31
 * To change this template use File|Setting|File Templates.
 */
public class A {
    public static void main(String[] args) {

        byte aascii[] = {65, 66, 67, 68, 69};

        String s1 = new String(aascii);
        System.out.println(s1);
        String s2 = new String(aascii,2,3);
        System.out.println(s2);
    }

}
