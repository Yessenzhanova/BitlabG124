package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Product 1", "Category A", 19850));
        products.add(new Product("Product 2", "Category B", 33000));
        products.add(new Product("Product 3", "Category B", 29500));
        products.add(new Product("Product 4", "Category C", 37500));
        products.add(new Product("Product 5", "Category D", 37500));

        Stream<Product> filteredProducts = Product.filterProducts(products, 27000, 34000, "Category B");

        // Выводим отфильтрованные продукты
        filteredProducts.forEach(product -> System.out.println(product.getName() + " - $" + product.getPrice()));
    }
}