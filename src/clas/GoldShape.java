package clas;

abstract class GoldShape {

    private double price;

    public GoldShape() {
    }

    public GoldShape(double volume, double price) {
        this.price = price;
    }


    public double getPrice() {
        return getVolume() * 250 + 1200;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    abstract double getVolume();
}





