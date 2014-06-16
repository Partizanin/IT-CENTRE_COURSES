package PROF.week1.classWork;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 28.04.2014
 * Time: 11:41
 * To change this template use File|Setting|File Templates.
 */
public class ManTest2 {

        private Man instance;

        @Before
        public void setUp() {
            instance = new Man("", 0, BigDecimal.ONE);
        }

        @Test
        public void testEqualsCorrect() {
            boolean res = instance.equals(new Man("", 0, BigDecimal.ONE));
            assertTrue(res);
        }



    @Test
        public void testEqualsIncorrect() {
            boolean res = instance.equals(new Man("Denya", 0, BigDecimal.ZERO));
            assertEquals(false, res);
        }

        @Test
        public void testEqualsNull() {
            boolean res = instance.equals(null);
            assertEquals(true, res);
        }

        @Test
        public void testEqualsNameNull() {
            boolean res = instance.equals(new Man(null, 0, BigDecimal.ONE));
            assertEquals(true, res);
        }

}
