package snackBar;

public class Main {
  private static void run() {
    Customer cust1 = new Customer("Jane", 45.25);
    Customer cust2 = new Customer("Bob", 33.14);

    VendingMachine vend1 = new VendingMachine("Food");
    VendingMachine vend2 = new VendingMachine("Drink");
    VendingMachine vend3 = new VendingMachine("Office");

    Snack snack1 = new Snack("Chips", 36, 1.75, 1);
    Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, 1);
    Snack snack3 = new Snack("Pretzel", 30, 2.00, 1);
    Snack snack4 = new Snack("Soda", 24, 2.50, 2);
    Snack snack5 = new Snack("Water", 20, 2.75, 2);

    cust1.buy(snack4.getTotalCost(3));
    snack4.buySnack(3);
    System.out.println("Customer 1 has $" + cust1.getCash());
    System.out.println("There are " + snack4.getQuantity() + " " + snack4.getName());

    cust1.buy(snack3.getTotalCost(1));
    snack3.buySnack(1);
    System.out.println("Customer 1 has $" + cust1.getCash());
    System.out.println("There are " + snack3.getQuantity() + " " + snack3.getName());

  }
}