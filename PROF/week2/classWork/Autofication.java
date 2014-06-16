package PROF.week2.classWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 * Project name: Курсы
 * User: Partizanin
 * Date: 10.05.2014
 * Time: 15:58
 * To change this template use File|Setting|File Templates.
 */
public class Autofication {


    public Set<User> createSetOfUsers() {
        Set<User> set = new HashSet<User>(5);

        set.add(new User("Vasa"));
        set.add(new User("Petya"));
        set.add(new User("Grisha"));
        set.add(new User("Valera"));
        set.add(new User("Misha"));


        return set;

    }


    public boolean searchUserInSet(Set<User> set, String user) {


        for (User aSet : set) {

            if (aSet.getLogin().equals(user)) {

                return true;
            }
        }
        return false;
    }


    public void showSet(boolean YesOrNo, Set<User> set) {

        if (YesOrNo) {

            for (User aSet : set) {

                System.out.println(aSet.getLogin());
            }

        }
    }


    public void removeThreadUser(boolean YesOrNo, Set<User> set) {
        Iterator<User> iterator = set.iterator();

        int threadUserPoint = 0;

        if (YesOrNo) {

            while (iterator.hasNext()) {

                        iterator.next().getLogin();

                if (threadUserPoint != 3) {

                    threadUserPoint++;

                } else {

                    iterator.remove();
                }
            }
        }
    }
}



