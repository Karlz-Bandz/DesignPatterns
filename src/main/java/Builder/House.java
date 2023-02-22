package Builder;

public class House {

    private int numberOfWindows;
    private int meters;
    private String wallColor;
    private boolean isGarage;

    @Override
    public String toString() {
        return "House{" +
                "numberOfWindows=" + numberOfWindows +
                ", meters=" + meters +
                ", wallColor='" + wallColor + '\'' +
                ", isGarage=" + isGarage +
                '}';
    }

    House(HouseBuilder builder){
        this.numberOfWindows = builder.numberOfWindows;
        this.meters = builder.meters;
        this.wallColor = builder.wallColor;
        this.isGarage = builder.isGarage;
    }



    public static class HouseBuilder{
        private int numberOfWindows;
        private int meters;
        private String wallColor;
        private boolean isGarage;

        public HouseBuilder setNumberOfWindows(int number){
            this.numberOfWindows = number;
            return this;
        }
        public HouseBuilder setMeters(int meters){
            this.meters = meters;
            return this;
        }
        public HouseBuilder setWallColor(String color){
            this.wallColor = color;
            return this;
        }
        public HouseBuilder isItGarage(boolean isIt){
            this.isGarage = isIt;
            return this;
        }

        public House build(){
            return new House(this);
        }



    }


}
