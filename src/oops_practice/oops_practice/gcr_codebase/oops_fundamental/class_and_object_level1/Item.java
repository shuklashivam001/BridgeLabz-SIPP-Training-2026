package oops_practice.oops_practice.gcr_codebase.oops_fundamental.class_and_object_level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(1001, "Pen", 20);

        item.displayDetails();

        int quantity = 5;
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + item.calculateTotalCost(quantity));
    }
}