public class Car extends Vehicle {
        double zeroToSixtyAcc;

    public Car(String make, double price, int year, String color, double zeroToSixtyAcc ) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.zeroToSixtyAcc = zeroToSixtyAcc;
       
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
  
    }
