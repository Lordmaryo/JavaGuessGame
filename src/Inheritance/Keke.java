package Inheritance;

public class Keke extends AutoMobile {
    public Keke(String chasisNo, int wheels, int seats, String brand, boolean roof) {
        super(chasisNo, wheels, seats, brand, roof);
    }

    public void reverse(){
        System.out.println(this.getBrand() + " is reversing...");
    }
}
