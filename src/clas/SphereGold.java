package clas;

public class SphereGold extends GoldShape {

    private int radius;

    public SphereGold(double volume, double price) {
        super(volume, price);
    }


    public SphereGold(double volume, double price, int radius) {
        super(volume, price);
        this.radius = radius;
    }
    public SphereGold(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public SphereGold() {
        super();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

}
