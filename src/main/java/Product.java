import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Product {
    String name;
    int quantity;
    BigDecimal price;


    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź nazwę produktu ");
        String name = scanner.nextLine();
        return name;
    }

    public static BigDecimal enterPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź cenę produktu ");
        BigDecimal price = scanner.nextBigDecimal();
        return price;
    }

    public static int enterQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź ilość produktu ");
        int quantity = scanner.nextInt();
        return quantity;
    }

    public static void addFirstProduct(List<Product> shippingList){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź nazwę produktu ");
        String name = scanner.nextLine();
        System.out.println("Wprowadź cenę produktu ");
        BigDecimal price = scanner.nextBigDecimal();
        System.out.println("Wprowadź ilość produktów ");
        int quantity = scanner.nextInt();
        Product product = new Product(name, price, quantity);
        shippingList.add(product);

    }

    public static boolean isProductExistInShippingList(List<Product> shippingList, String name) {
        boolean i = false;
        for (Product product : shippingList) {
            if (product.name.equals(name)) {
                i = true;
            }
        }
        return i;
    }
}
