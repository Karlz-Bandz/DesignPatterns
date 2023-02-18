package Decorator2.classes;

public abstract class SkiPassDecorator extends SkiPass {

    SkiPass skiPass;

    public SkiPassDecorator(SkiPass skiPass) {
        this.skiPass = skiPass;
    }

    @Override
    public String getName() {
        return skiPass.getName();
    }


    @Override
    public double getPrice() {
        return skiPass.getPrice();
    }
}
