package clas;

public class CubeGold extends GoldShape{

    private double side;

    public CubeGold(double volume, double price) {
        super(volume, price);
    }

    public CubeGold() {
    }

    public CubeGold(double volume, double price, int side) {
        super(volume, price);
        this.side = side;
    }
    public CubeGold(int side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
        return Math.pow(side,3);
    }

}
