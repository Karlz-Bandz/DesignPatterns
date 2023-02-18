package Decorator2.classes;

public class ChildSkiPass extends SkiPassDecorator {

    public ChildSkiPass(SkiPass skiPass){
        super(skiPass);
    }

    @Override
    public String getName() {
         return "Children Skipass";
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * 60)/100;
    }
}
