package PROF.week2.homeWork.tests;

import PROF.week2.homeWork.Auth;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class AuthTest  {

    private Auth instance;
    @Before
    public void setUp(){
        instance = new Auth();

    }

    @Test
    public void testAuthenticate() throws Exception {
        String login = "Partizanin";
        String password = "95999599w";

        instance.add(login,password);
        assertTrue(instance.authenticate(login, password));
        assertFalse(instance.authenticate(login, "111"));

    }

}