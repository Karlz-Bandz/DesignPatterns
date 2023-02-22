package Builder;

public class Main {

    /*
    * Builder is very helpful when we have to create a class with a lot of data,
    * but sometimes we don't have to use or assign everything in constructor.
    * With this pattern the code looks more clean.
     */



    public static void main(String[] args) {

        House smallHouse = new House.HouseBuilder()
                .setMeters(40)
                .setNumberOfWindows(3)
                .setWallColor("Red")
                .isItGarage(false)
                .build();

        House bigHouse = new House.HouseBuilder()
                .setMeters(500)
                .setNumberOfWindows(20)
                .setWallColor("White")
                .isItGarage(true)
                .build();

        System.out.println(smallHouse.toString());
        System.out.println(bigHouse.toString());

    }
}
