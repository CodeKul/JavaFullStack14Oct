package abstraction.abstractdemo;

public abstract class AbsSport {

    public abstract void play();//abstract  method

    protected void exercise(){//concrete method
        System.out.println("In exercise ");
    }
}

/**
 *             abstract class                                           interface
 *
 * 1.we can declare abstract class using abstract keyword            1 . using interface
 *
 * 2.we have both method abstract and concrete                       2 . only abstract
 *
 * 3.abstract class can extends another class or implements interface 3.only interface can extend
 *
 * 4.we have private,protected,public methods                         4.only public
 *
 * 5.partial abstraction                                              5.100% abstraction
 */