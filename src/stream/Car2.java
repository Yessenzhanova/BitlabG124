package stream;

public class Car2 {
    private String name;
    private int maxSpeed;
    private double engineVolume;

    public Car2() {
    }

    public Car2(String name, int maxSpeed, double engineVolume) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


}
