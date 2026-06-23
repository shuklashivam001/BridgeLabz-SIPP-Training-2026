package oops_practice.oops_practice.gcr_codebase.oops_fundamental.class_and_object_level2;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        } else {
            System.out.println("Not enough items in cart.");
        }
    }

    void displayTotalCost() {
        System.out.println("Item Name  : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000, 1);

        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}