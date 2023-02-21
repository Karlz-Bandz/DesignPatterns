package Singleton;

public class SingletonExample {

    private String name;
    private int age;

    private static SingletonExample singletonExample = null;

    private SingletonExample(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static SingletonExample getInstance(String name, int age){

        if(singletonExample == null){
            singletonExample = new SingletonExample(name, age);
        }

        return singletonExample;
    }
}
