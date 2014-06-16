package OOP.week4.game;

/**
 * Created with Intellij IDEA.
 * User:Partizanin
 * Date:08.02.14
 * Time: 13:52.
 * To change this template use File|Settings|File Templates.
 */
public class Character {
    private String name;
    private FightBehavior weapon;

    public Character(String name){

      this.name = name;

    }

    public FightBehavior getWeapon(){
        return weapon;
    }

    public void setWeapon(FightBehavior weapon){
        this.weapon = weapon;
    }

    public void fight(){
        weapon.useWeapon();
    }
    public void quickFight(FightBehavior fightBehavior){
        fightBehavior.useWeapon();
    }
}
