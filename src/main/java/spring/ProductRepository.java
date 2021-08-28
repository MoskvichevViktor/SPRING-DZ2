package spring;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository(){
        this.products = List.of(
                new Product(1, "Product_1", 10),
                new Product(2, "Product_2", 20),
                new Product(3, "Product_3", 30),
                new Product(4, "Product_4", 40),
                new Product(5, "Product_5", 50)

        );
    }

    public Optional<Product> findById(int id){
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Product> findAll(){
        return products;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }
}
