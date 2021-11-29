import java.util.ArrayList;
import java.util.List;


public class Main {

    static final int NUMBER_OF_PRODUCTS=5;


    public static void main(String[] args) {

        List<Product> shippingList = new ArrayList<>();
        Product.addFirstProduct(shippingList);
        for (int i = 1; i < NUMBER_OF_PRODUCTS; i++) {
            String name = Product.enterName();
            if (Product.isProductExistInShippingList(shippingList, name)) {
                for (Product product : shippingList) {
                    if (product.name.equals(name)) {
                        product.quantity += Product.enterQuantity();
                    }
                }
            } else {
                Product product = new Product(name, Product.enterPrice(), Product.enterQuantity());
                shippingList.add(product);
            }
        }
        DisplayInfo.displayProductsInfo(shippingList);
        DisplayInfo.displayTotalCostso(shippingList);


    }
}