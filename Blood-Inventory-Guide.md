import java.util.HashMap;
import java.util.Map;

public class BloodInventory {

    private final Map<String, Integer> inventory = new HashMap<>();

    public void addUnits(String bloodGroup, int units) {
        if (units <= 0) {
            System.out.println("Units must be greater than zero.");
            return;
        }

        String group = bloodGroup.toUpperCase();

        inventory.put(
            group,
            inventory.getOrDefault(group, 0) + units
        );

        System.out.println("Blood units added successfully.");
    }

    public void checkUnits(String bloodGroup) {
        String group = bloodGroup.toUpperCase();
        int units = inventory.getOrDefault(group, 0);

        System.out.println(group + " available units: " + units);
    }

    public static void main(String[] args) {
        BloodInventory stock = new BloodInventory();

       Scanner sc = new Scanner(System.in);

    System.out.print("Enter blood group: ");
    String group = sc.nextLine();

    System.out.print("Enter units to add: ");
    int units = sc.nextInt();

    stock.addUnits(group, units);
    stock.checkUnits(group);
    }
}

