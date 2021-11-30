import java.math.BigDecimal;
import java.util.List;

public class DisplayInfo {

    public static void displayProductsInfo(List<Product> shippingList) {
        for (Product product : shippingList) {
            System.out.println("Nazwa produktu " + product.name);
            System.out.println("Ilość zamówionych produktów " + product.quantity);
            System.out.println("Cena produktu " + product.price);
            System.out.println("Łączny koszt produktu " + product.price.multiply(new BigDecimal(product.quantity)));
            System.out.println("----------");
        }
    }

    public static void displayTotalCostso(List<Product> shippingList) {
        BigDecimal totalCost = new BigDecimal(0);
        for (Product product : shippingList) {
            BigDecimal productCost = product.price.multiply(new BigDecimal(product.quantity));
            totalCost = totalCost.add(productCost);
        }
        System.out.println("Łączny koszt całego zamówienia " + totalCost);
    }

}
