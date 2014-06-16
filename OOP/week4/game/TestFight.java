package OOP.week4.game;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:09.02.14
 * Time: 11:11.
 * To change this template use File|Settings|File Templates.
 */
public class TestFight {
    public static void main(String[] args) {

        KnifeBehavior knife = new KnifeBehavior();
        SwordBehavior sb = new SwordBehavior();
        FightBehavior someWeapon = new FightBehavior() {
            @Override
            public void useWeapon() {
                System.out.println("some weapon");
            }
        };
        Character character = new Character("Troll");

        character.quickFight(someWeapon);
    }
}
