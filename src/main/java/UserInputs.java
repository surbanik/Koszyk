import java.math.BigDecimal;
import java.util.Scanner;

public class UserInputs {

    static Scanner scanner = new Scanner(System.in);

    public static String enterName() {
        System.out.println("Wprowadź nazwę produktu ");
        return scanner.nextLine();
    }

    public static BigDecimal enterPrice() {
        System.out.println("Wprowadź cenę produktu ");
        return scanner.nextBigDecimal();
    }

    public static int enterQuantity() {
        System.out.println("Wprowadź ilość produktu ");
        return scanner.nextInt();
    }
}
