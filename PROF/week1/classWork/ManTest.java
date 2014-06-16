package PROF.week1.classWork;



import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 27.04.2014
 * Time: 17:09
 * To change this template use File|Setting|File Templates.
 */
public class ManTest {

    private Man instans;


    @Before
    public void setUp(){
        instans = new Man("BA",11, BigDecimal.ONE);

    }

    @Test
    public void testEqualsCorrect(){


        boolean res = instans.equals(new Man("BA",11, BigDecimal.ONE));

        assertTrue(res);

    }

    @Test
    public void notNull(){

        assertNotNull(instans);

    }
}
