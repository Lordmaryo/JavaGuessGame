package Inheritance;

public class Truck extends AutoMobile {
    private int doors;
    private boolean ac, trunk, bucket;

    public Truck(String chasisNo, int wheels, int seats, String brand,
                 int doors, boolean ac, boolean trunk, boolean roof, boolean bucket) {
        super(chasisNo, wheels, seats, brand, roof);
        this.ac = ac;
        this.doors = doors;
        this.trunk = trunk;
        this.bucket = bucket;
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

    public boolean isBucket() {
        return bucket;
    }

    public void setBucket(boolean bucket) {
        this.bucket = bucket;
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

    public void haveBucket() {
        if (this.isBucket()) {
            System.out.println("This Truck have a bucket");
        } else {
            System.out.println("This Truck does not have a bucket");
        }
    }

    public void reverse() {
        System.out.println(this.getBrand() + " is reversing...");
    }
}
