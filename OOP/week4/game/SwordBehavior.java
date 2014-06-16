package OOP.week4.game;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:08.02.14
 * Time: 16:29.
 * To change this template use File|Settings|File Templates.
 */
public class SwordBehavior implements FightBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Using sword");
    }
}
