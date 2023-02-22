package Singleton2;

public class Main {

    /*
    * This is very good example of the singleton pattern,
    * in the class DataBaseConnection I have all configuration data.
    * Because I used the singleton this data cannot be overridden.
     */


    public static void main(String[] args) {

        DataBaseConnectionData dataBaseConnectionData = DataBaseConnectionData.getInstance("Password",
                "Karlz",
                "jdbc:mysql://localhost:3306/root");

        System.out.println(dataBaseConnectionData.toString());

        DataBaseConnectionData dataBaseConnectionData1 = DataBaseConnectionData.getInstance("lol",
                "xd","x");

        System.out.println(dataBaseConnectionData1.toString());




    }
}
