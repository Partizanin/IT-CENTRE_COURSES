package PROF.week2.homeWork.tests;


import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import PROF.week2.homeWork.User;
import java.util.Date;

public class UserTest extends TestCase {

    private User instance;

    @Before
    public void setUp(){
        instance = new User("Vaxa","Vasa123","male",22,new Date(System.currentTimeMillis()));
    }

    @Test
    public void testEqualsNull()  {
        assertEquals(false, instance.equals(null));
    }

    @Test
    public void testEqualsReflexive(){
        assertEquals(true,instance.equals(instance));
    }


    @Test
    public void testEqualsSymmetric(){
        User user = new User("Vaxa","Vasa123","male",22,new Date(System.currentTimeMillis()));
        assertEquals(true, instance.equals(user) && user.equals(instance));
    }

    @Test
    public void testEqualsTransitive(){
        User user = new User("Vaxa","Vasa123","male",22,new Date(System.currentTimeMillis()));
        User user2 = new User("Vaxa","Vasa123","male",22,new Date(System.currentTimeMillis()));
        assertEquals(true, instance.equals(user) && user.equals(user2) && instance.equals(user2));
    }


    @Test
    public void testHashCode(){
        User user = new User("Vaxa","Vasa123","male",22,new Date(System.currentTimeMillis()));
        assertEquals(true, instance.hashCode() == user.hashCode());
    }

}
