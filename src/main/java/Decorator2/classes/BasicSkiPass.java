package Decorator2.classes;

public class BasicSkiPass extends SkiPass{

    @Override
    public double getPrice() {
        return 100.00;
    }

    @Override
    public String getName() {
        return "Basic";
    }
}
