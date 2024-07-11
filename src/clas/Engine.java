package clas;

abstract class Engine {

    private  double engineVolume;
    private int cylinderAmount;
    private double engineWeight;

    public Engine() {
    }
    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public Engine(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Engine(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }
    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();
}
