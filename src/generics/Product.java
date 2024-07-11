package generics;

public class Product <T>{

    private String name;
    private float price;
    private T category;

    public Product() {
    }

    public Product(String name, float price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public void setCategory(T category) {
        this.category = category;
    }

    String getData(){
       return "Product: " + "{" + name+ "}" + ", Price: " + "{" + getPrice() +"}" + ", Category: " + "{"+ getCategory() + "}";
    }
}
