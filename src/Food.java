class FoodItem {

    String itemName;
    double price;
    int quantity;

    //methods
    double calculateItemTotal()
    {
        return price * quantity;
    }

    void displayItem(){

        System.out.println("=========================");
        System.out.println("Item Name :"+itemName);
        System.out.println("Price     :"+price);
        System.out.println("Quantity  :"+quantity);
        System.out.println("Total     :"+calculateItemTotal());
    }
}

public class Food {
    static void main(String[] args) {

        //creating the objects
        FoodItem pizza = new FoodItem();
        FoodItem burger = new FoodItem();
        FoodItem fries = new FoodItem();
        FoodItem coke = new FoodItem();

        //Assigning the values
        pizza.itemName = "Margaretta Veg Pizza with extra cheese";
        pizza.price = 654.0;
        pizza.quantity = 4;

        burger.itemName = "Mc Cheese Burger (Non-Veg)";
        burger.price = 250.0;
        burger.quantity = 6;

        fries.itemName = "Cheese Fries";
        fries.price = 110.0;
        fries.quantity = 7;

        coke.itemName = "Regular Coke";
        coke.price = 40.0;
        coke.quantity = 6;

        //Display Item Details
        pizza.displayItem();
        burger.displayItem();
        fries.displayItem();
        coke.displayItem();

        //calculating subtotal
        double subtotal =
                pizza.calculateItemTotal();
                burger.calculateItemTotal();
                fries.calculateItemTotal();
                coke.calculateItemTotal();

                //GST Calculation
        double gst = subtotal * 0.18;

        //Delivery Charges
        double deliveryCharges = 40.0;

        //Grand Total
        double grandTotal = subtotal + gst + deliveryCharges;

        //Formated final bill
        System.out.println("===================================");
        System.out.println("          Final Bill          ");
        System.out.println("Subtotal          :"+subtotal);
        System.out.println("GST 18%           :"+gst);
        System.out.println("Delivery Charge   :"+deliveryCharges);
        System.out.println( "-----------------------------------");
        System.out.println("Grand Total       :"+grandTotal);

    }
}
