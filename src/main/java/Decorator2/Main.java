package Decorator2;

import Decorator2.classes.*;

/*
* In this decorator we can see the different styles of the SkiPass tickets
* for the children, for seniors and family ticket. It could be useful for
* web shop for selling the tickets
 */

public class Main {
    public static void main(String[] args) {
     SkiPass skiPass = new ChildSkiPass(new BasicSkiPass());
     SkiPass skiPass1 = new BasicSkiPass();
     SkiPass skiPass2 = new FamilySkiPass(new BasicSkiPass());
     SkiPass skiPass3 = new SeniorSkiPass(new BasicSkiPass());

        System.out.println(skiPass.getName() + " " + skiPass.getPrice());
        System.out.println(skiPass1.getName() + " " + skiPass1.getPrice());
        System.out.println(skiPass2.getName() + " " + skiPass2.getPrice());
        System.out.println(skiPass3.getName() + " " + skiPass3.getPrice());
    }
}
