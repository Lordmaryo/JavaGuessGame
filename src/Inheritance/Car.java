package Inheritance;

public class Car extends AutoMobile {
    private int doors;
    private boolean ac, trunk;

    public Car(String chasisNo, int wheels, int seats, int doors,
               boolean ac, boolean trunk, String brand, boolean roof) {
        super(chasisNo, wheels, seats, brand, roof);
        this.doors = doors;
        this.ac = ac;
        this.trunk = trunk;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public void haveAc() {
        if (this.isAc()) {
            System.out.println("This " + this.getBrand() + " have an AC...");
        } else {
            System.out.println("This " + this.getBrand() + " does NOT have AC...");
        }
    }

    public void haveTrunk() {
        if (this.isTrunk()) {
            System.out.println("This " + this.getBrand() + " can carry load...");
        } else {
            System.out.println("This " + this.getBrand() + " can NOT cary load...");
        }
    }

    public void reverse() {
        System.out.println(this.getBrand() + " is reversing...");
    }
}
