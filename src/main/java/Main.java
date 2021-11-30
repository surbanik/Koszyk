public class Main {

    static final int NUMBER_OF_PRODUCTS = 5;


    public static void main(String[] args) {
        for (int i = 1; i < NUMBER_OF_PRODUCTS; i++) {
            String name = UserInputs.enterName();
            Cart.addProduct(name);
        }
        DisplayInfo.displayProductsInfo(Cart.shippingList);
        DisplayInfo.displayTotalCostso(Cart.shippingList);


    }
}