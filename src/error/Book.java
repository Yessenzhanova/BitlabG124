package error;

public class Book {
    public static void main(String[] args) {
    }

 private int id;
 private String name;
 private String author;

    public Book() {
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    String getData(){
        return "ID: " + getId() + ". NAME: " + getName() + ". AUTHOR: " + getAuthor() + ".";
    }
}

