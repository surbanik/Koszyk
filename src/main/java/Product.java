import java.math.BigDecimal;


public class Product {

    String name;
    int quantity;
    BigDecimal price;

    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
