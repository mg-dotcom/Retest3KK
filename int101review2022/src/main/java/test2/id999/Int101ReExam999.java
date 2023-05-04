package test2.id999;

import account.id999.*;
import int101.basic.Simple;

public class Int101ReExam999 {
    public static void main(String[] args) {
        //testPerson();
        testSimple();
    }
    
    static void testSimple() {
        //test Simple(String title, int value)
        Simple s = new Simple("SimpleTitle", -20);

        //test Simple::addAmount()
        System.out.println("add -3.4: " + s.addAmount(-3.4));
        System.out.println("add -5.3: " + s.addAmount(-5.3));
        System.out.println("add -1.5: " + s.addAmount(-1.5));
        System.out.println("add 12.0: " + s.addAmount(12.0));
     
        //test Simple::toString()
        System.out.println("s: " + s);
    }
    
    static void testPerson() {
        //2.4 Person(name)
        Person p0 = new Person("Zero");
        Person p1 = new Person("First");
        
        //2.5 Person::toString()
        System.out.println("Person0: " + p0);
        System.out.println("Person1: " + p1.toString());

        //2.6 Person::addAcount(userName)
        UserAccount u00 = p0.addAccount("Person0User0");
        UserAccount u01 = p0.addAccount("Person0User1");
        
        //1.8 UserAccount::toString()
        System.out.println("UserAccount00: " + u00);
        System.out.println("UserAccount01: " + u01.toString());
        
        System.out.println("Person0: " + p0);        
    }
}
