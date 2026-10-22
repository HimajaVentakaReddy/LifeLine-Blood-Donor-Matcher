
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BloodStockAlert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> stock = new HashMap<>();

        stock.put("A+", 8);
        stock.put("B+", 3);
        stock.put("O+", 2);
        stock.put("AB+", 0);
        stock.put("O-", 1);

        System.out.println("=== Blood Stock Alert ===");
        System.out.print("Enter blood group: ");
        String group = sc.nextLine().trim().toUpperCase();

        if (!stock.containsKey(group)) {
            System.out.println("Blood group not registered.");
        } else {
            int units = stock.get(group);
            System.out.println("Available units: " + units);

            if (units == 0) {
                System.out.println("ALERT: Stock unavailable!");
            } else if (units <= 3) {
                System.out.println("WARNING: Blood stock is low!");
            } else {
                System.out.println("Blood stock is sufficient.");
            }
        }

        sc.close();
    }
}
