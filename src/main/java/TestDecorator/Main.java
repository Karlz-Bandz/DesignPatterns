package TestDecorator;

public class Main {
    public static void main(String[] args) {


        IPhone phone = new IPhone11_64GB(new IPhone11());
        IPhone phone1 = new IPhone11_512GB(new IPhone11());

        System.out.println(phone.getDescription());
        System.out.println(phone.getPrice());
        System.out.println();
        System.out.println(phone1.getDescription());
        System.out.println(phone1.getPrice());
    }
}
