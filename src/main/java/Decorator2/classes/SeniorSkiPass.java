package Decorator2.classes;

public class SeniorSkiPass extends SkiPassDecorator {


    public SeniorSkiPass(SkiPass skiPass) {
        super(skiPass);
    }

    @Override
    public String getName() {
        return "Senior Skipass";
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * 40)/100;
    }
}
