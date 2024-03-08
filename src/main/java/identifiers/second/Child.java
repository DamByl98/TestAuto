package identifiers.second;

import identifiers.firs.Parent;

public class Child extends Parent {

    public void id(){
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}
