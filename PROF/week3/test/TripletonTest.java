package PROF.week3.test;

import PROF.week3.classWork.Tripleton;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TripletonTest {
    private Tripleton tripleton;

    @Before
    public void setUp() throws Exception {
        tripleton = Tripleton.getInstance();
    }

    @Test
    public void testGetInstance() throws Exception {
        assertNotNull(tripleton);

        Tripleton tripleton2 = Tripleton.getInstance();
        Tripleton tripleton3 = Tripleton.getInstance();

        assertTrue(tripleton != tripleton2);
        assertTrue(tripleton2 != tripleton3);
        assertTrue(tripleton != tripleton3);

        Tripleton tripleton4 = Tripleton.getInstance();

        assertTrue(tripleton4 == tripleton2 ||
                tripleton4 == tripleton3 ||
                tripleton4 == tripleton);

    }
}