import java.util.ArrayList;
import java.util.List;


public class Cart {
    static List<Product> shippingList = new ArrayList<>();

    public static Product getExistingProductInShippingList(String name) {
        for (Product product : shippingList) {
            if (product.name.equals(name)) {
                return product;
            }
        }
        return null;
    }

    public static void addProduct(String name) {

        Product existingProduct = getExistingProductInShippingList(name);
        if (existingProduct == null) {
            Product product = new Product(name, UserInputs.enterPrice(), UserInputs.enterQuantity());
            shippingList.add(product);
        } else {
            int newQuantity = existingProduct.quantity + UserInputs.enterQuantity();
            existingProduct.setQuantity(newQuantity);
        }
    }
}
