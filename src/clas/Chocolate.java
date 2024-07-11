package clas;

public class Chocolate extends Food {

    private int weight;

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Chocolate() {
        super();
    }

    public Chocolate(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    double getCalories() {
        return weight * 740.;
    }
}
