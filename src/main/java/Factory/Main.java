package Factory;

public class Main {

    /*
    *The Factory Design Pattern provides a way to encapsulate the creation of objects within a single
    *class or module. This means that changes to the creation process can
    *be made without affecting the rest of the code
     */


    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("PC", "32GB", "500GB", "2,4GHz");
        Computer server = ComputerFactory.getComputer("Server", "64GB", "1TB", "3,8GHz");
        Computer nuull = ComputerFactory.getComputer("gg", "8GB", "500GB", "1,2GHz");

        System.out.println("This is pc:: " + pc);
        System.out.println("This is null:: " + nuull);
        System.out.println("This is server:: " + server);

    }
}
