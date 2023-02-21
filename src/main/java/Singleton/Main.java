package Singleton;

public class Main {

    /*
    * If we want to create global class with some variables whose cannot be modified by anything
    * singleton is good solution. As we can see I try to change name and age of the
    * singletonExample and still we have the same output. Even if I created the new instance of class
    * and add new data nothing has been changed
     */

    public static void main(String[] args) {


        SingletonExample singletonExample = SingletonExample.getInstance("Karol", 27);
        singletonExample = SingletonExample.getInstance("Bartek", 22);
        System.out.println(singletonExample.getAge() + " " + singletonExample.getName());

        SingletonExample singletonExample2 = SingletonExample.getInstance("Papryk", 44);
        System.out.println(singletonExample2.getAge() + " " + singletonExample.getName());


    }
}
