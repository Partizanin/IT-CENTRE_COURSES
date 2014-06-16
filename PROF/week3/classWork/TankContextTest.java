package PROF.week3.classWork;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TankContextTest extends TestCase {

    private TankContext tank;

    @Before
    public void setUp(){
        tank = new TankContext();

    }

    @Test
    public void testMove(){
        TrukStrategyImpl trukStrategy = new TrukStrategyImpl();
        tank.setStrategy(trukStrategy);

        tank.move();

        MovableStrategy airbag = new AirbagStrategyImpl();
        tank.setStrategy(airbag);

        tank.move();

        MovableStrategy jump = new JumpStrategyImpl();

        tank.setStrategy(jump);

        tank.move();
        tank.shoot();

        MovableStrategy truks = new TrukStrategyImpl();

        tank.setStrategy(truks);

        tank.move();
    }

}