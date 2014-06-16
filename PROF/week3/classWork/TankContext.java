package PROF.week3.classWork;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 18.05.2014
 * Time: 15:22
 * To change this template use File|Setting|File Templates.
 */

/*Паттерн Стратегий*/
public class TankContext {




         MovableStrategy strategy;

    public void setStrategy(MovableStrategy strategy) {
        this.strategy = strategy;
    }

    public void move(){

            strategy.move();
            

        }

    public void shoot(){
        System.out.println("Shooting");
    }
    }

