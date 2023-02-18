package Decorator;

import Decorator.classes.BasicCar;
import Decorator.classes.Car;
import Decorator.classes.Clima;
import Decorator.classes.SportWheels;

public class Main {

    public static void main(String[] args) {

        /*
        * Here is an example of the simple decorator pattern. We have the Basic
        * car which is the base of all car types. We can add as many upgrades as
        * we want, and we don't have to modify the code from the past. It is
        * a good practice when we want to have a readable code with a lot of data,
        * and we want it to be easy in maintenance.
         */

        Car car = new Clima(new BasicCar());
        Car car2 = new Clima(new SportWheels(new BasicCar()));

        System.out.println(car.getDescription());
        System.out.println();
        System.out.println(car.getPrice());
        System.out.println();
        System.out.println(car2.getDescription());
        System.out.println();
        System.out.println(car2.getPrice());
    }
}
