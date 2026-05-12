class patient{

    //declaring variables
    int patientId;
    String patientName;
    int age;
    String disease;
    double consultationFee;
    double medicalCost;
    int daysAdmitted;
    double roomChargePerDay;

    //methods
    double calculateRoomCharge()
    {
        return daysAdmitted * roomChargePerDay;
    }
    double calculateBill()
    {
        return consultationFee + medicalCost + roomChargePerDay;
    }
    void displayPatientInfo()
    {
        System.out.println(" Details of Patients ");
        System.out.println("Patient name  :"+patientName);
        System.out.println("Patient Id    :"+patientId);
        System.out.println("Paitent Age   :"+age);
        System.out.println("Disease       :"+disease);
    }
    void displayBill()
    {
        System.out.println("\n");
        System.out.println("=====================Final Bill==========================");
        System.out.println("Patient name              :"+patientName);
        System.out.println("Patient Id                :"+patientId);
        System.out.println("=========================================================");
        System.out.println("Consultation Fee          :"+consultationFee);
        System.out.println("Medical Cost              :"+medicalCost);
        System.out.println("Number of days admitted   :"+daysAdmitted);
        System.out.println("Room charge per day       :"+roomChargePerDay);
        System.out.println("----------------------------------------------------------");
        System.out.println("Grand Total               :"+calculateBill());
        System.out.println("\n");
    }
}


public class Hospital {
   public static void main(String[] args) {

       //creating the objects of patients
       patient wardOne = new patient();
       patient wardTwo = new patient();

       //assigning the values
       wardOne.patientId = 001;
       wardOne.patientName = "Godman";
       wardOne.age = 34;
       wardOne.disease = "Nausia";
       wardOne.consultationFee = 1500.0;
       wardOne.medicalCost = 1200.0;
       wardOne.daysAdmitted = 6;
       wardOne.roomChargePerDay = 4500;

       wardTwo.patientId = 002;
       wardTwo.patientName = "JayRaj";
       wardTwo.age = 44;
       wardTwo.disease = "Jaundice";
       wardTwo.consultationFee = 1800.0;
       wardTwo.medicalCost = 12004.0;
       wardTwo.daysAdmitted = 6;
       wardTwo.roomChargePerDay = 5500;

       wardOne.displayBill();
       wardTwo.displayBill();;
    }


}
