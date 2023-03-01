package Factory;

public class ComputerFactory {

    public static Computer getComputer(String value, String ram, String hdd, String cpu){

        if("pc".equalsIgnoreCase(value))
            return new PC(ram, hdd, cpu);
        else if("server".equalsIgnoreCase(value))
            return new Server(ram, hdd, cpu);

        return null;

    }


}
