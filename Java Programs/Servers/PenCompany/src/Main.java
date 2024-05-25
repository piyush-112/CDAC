import java.util.*;
import java.time.*;

class Pen {
    static int idCounter = 0;
    int id;
    String brand;
    String color;
    String inkColor;
    String material;
    int stock;
    LocalDate stockUpdateDate;
    LocalDate stockListingDate;
    double price;
    double discount;

    Pen(String brand, String color, String inkColor, String material, int stock, LocalDate stockListingDate, double price) {
        this.id = ++idCounter;
        this.brand = brand;
        this.color = color;
        this.inkColor = inkColor;
        this.material = material;
        this.stock = stock;
        this.stockUpdateDate = stockListingDate;
        this.stockListingDate = stockListingDate;
        this.price = price;
        this.discount = 0.0;
    }
}

public class Main {
    static List<Pen> pens = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add new Pen\n2. Update stock of a Pen\n3. Set discount\n4. Remove Pens\n5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Add new Pen
                    System.out.println("Enter Brand, Color, InkColor, Material, Stock, Stock Listing Date (yyyy-mm-dd), Price:");
                    String brand = scanner.next();
                    String color = scanner.next();
                    String inkColor = scanner.next();
                    String material = scanner.next();
                    int stock = scanner.nextInt();
                    String date = scanner.next();
                    LocalDate stockListingDate = LocalDate.parse(date);
                    double price = scanner.nextDouble();
                    Pen pen = new Pen(brand, color, inkColor, material, stock, stockListingDate, price);
                    pens.add(pen);
                    System.out.println("Pen added successfully");
                    break;
                case 2:
                    // Update stock of a Pen
                    System.out.println("Enter Brand, Material, Color, InkColor, and New Quantity:");
                    String updateBrand = scanner.next();
                    String updateMaterial = scanner.next();
                    String updateColor = scanner.next();
                    String updateInkColor = scanner.next();
                    int newQuantity = scanner.nextInt();
                    for (Pen p : pens) {
                        if (p.brand.equals(updateBrand) && p.material.equals(updateMaterial) && p.color.equals(updateColor) && p.inkColor.equals(updateInkColor)) {
                            p.stock = newQuantity;
                            p.stockUpdateDate = LocalDate.now();
                            //for easier status display
                            System.out.println("Updating...");
                            System.out.println("Stock updated successfully");
                            break;
                        }
                    }
                    break;
                case 3:
                    // Set discount
                    LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
                    for (Pen p : pens) {
                        if (p.stockUpdateDate.isBefore(threeMonthsAgo)) {
                            p.discount = 20.0;
                        }
                    }
                    System.out.println("Discount set successfully");
                    break;
                case 4:
                    // Remove Pens
                    LocalDate nineMonthsAgo = LocalDate.now().minusMonths(9);
                    pens.removeIf(p -> p.stockListingDate.isBefore(nineMonthsAgo) && p.stock == 0);
                    System.out.println("Pens removed successfully");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
