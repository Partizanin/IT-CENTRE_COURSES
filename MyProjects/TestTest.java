package MyProjects;

import junit.framework.TestCase;
import org.junit.Before;

public class TestTest extends TestCase {

    private Test instance;
    @Before
    public void setUp(){
        instance = new Test();
    }

    public void testBadCode() throws Exception {

        assertEquals(5,instance.badCode(10,1,5));
        assertEquals(5,instance.badCode(1,10,5));
        assertEquals(5,instance.badCode(10,5,1));

    }

    public void testMyMethod() throws Exception {
        assertEquals(5,instance.myMethod(10,1,5));
        assertEquals(5,instance.myMethod(1,10,5));
        assertEquals(5,instance.myMethod(10,5,1));

    }
}