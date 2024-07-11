//package error;
//
//public class Company {
//    public static void main(String[] args) {
//
//    }
//
//    private String name;
//    private Worker director;
//
//    public Company() {
//    }
//
//    public Company(String name, Worker director) {
//        this.name = name;
//        this.director = director;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Worker getDirector() {
//        return director;
//    }
//
//    public void setDirector(Worker director) {
//        this.director = director;
//    }
//
//    public String getData() {
//        try {
//            if (getName() == null || getDirector() == null) {
//                return "Data not found";
//            } else {
//                return "error.Company name: " + getName() + ". Information about director -> " + getDirector().getName() + " " + getDirector().getSurname() + ".";
//            }
//        } catch (NullPointerException e) {
//            return "Data not found";
//        }
//    }
//}