package clas;

public class BookHouse {
    Book[] books = new Book[1000];
    int size = 0;

    public BookHouse() {
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Массив книг заполнен, невозможно добавить новую книгу.");
        }
    }

    public void printBooks() {
        if (size == 0) {
            System.out.println("Нет книг для вывода.");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getData());

        }
    }

    public void searchBook(String name) {
        boolean found = false;

            for (int i = 0; i < books.length; i++) {
                if (books[i] != null && name.equals(books[i].getData())) { // Добавляем проверку на null
                    System.out.println(books[i].getData());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Data Not Found");
            }
        }
        }
