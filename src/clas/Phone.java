package clas;

public class Phone {
    private String name;
    private String model;
    private int price;

    public Phone() {
    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "clas.Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String getCategory() {
        if (price > 1000) {
            return "TOP";
        } else if (price <=1000 && price >= 500) {
            return "MEDIUM";
        }else if (price <500){
            return "SIMPLE";
        }
        return "NULL";
    }
}





