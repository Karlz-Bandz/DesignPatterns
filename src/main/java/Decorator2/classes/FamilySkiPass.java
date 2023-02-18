package Decorator2.classes;

public class FamilySkiPass extends SkiPassDecorator{
    public FamilySkiPass(SkiPass skiPass) {
        super(skiPass);
    }

    @Override
    public String getName() {
        return "Family Skipass";
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 2;
    }
}
