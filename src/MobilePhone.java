    class MobilePhoneT {
    //variables
    String brand;
    String model;
    double price;
    int batteryPercentage;

    //methods

    //calling
    void makeCall(String contactName){
        System.out.println("Calling "+contactName);
    }

    //battery
    void chargeBattery(int percent){
        batteryPercentage = batteryPercentage + percent;
        System.out.println("Battery charged to "+batteryPercentage+"%");
    }

    //print-all-info
    void displayInfo(){
        System.out.println("Brand "+brand);
        System.out.println("Model "+model);
        System.out.println("Price "+price);
        System.out.println("battery "+batteryPercentage);
    }
}

public class MobilePhone{

    public static void main(String[] args) {

        MobilePhoneT phone1 = new MobilePhoneT();
        MobilePhoneT phone2 = new MobilePhoneT();

        // assigning the values
        phone1.brand = "Samsung";
        phone1.model = "S Series";
        phone1.price = 89999;
        phone1.batteryPercentage = 78;

        phone2.brand = "Apple";
        phone2.model = "18 Pro Max 2TB";
        phone2.price = 299999;
        phone2.batteryPercentage = 78;

        //calling the methods
        //for phone1
        phone1.makeCall("Vishwas");
        phone1.chargeBattery(20);
        phone1.displayInfo();

        //phone2
        phone2.makeCall("Uday");
        phone2.chargeBattery(56);
        phone2.displayInfo();

    }
}
