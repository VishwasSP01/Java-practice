class Employee
{
    int empId;
    String empName;
    String designation;
    double basicSalary;

    //Methods
    double calculateHra()
    {
        return basicSalary * 0.20;
    }

    double calculateDA()
    {
        return basicSalary *0.50;
    }

    double calculatePF()
    {
        return basicSalary * 0.12;
    }

    double calculateTax()
    {
        return basicSalary * 0.10;
    }

    double calculateGross()
    {
        return basicSalary + calculateHra() + calculateDA();
    }

    double calculateNet()
    {
        return calculateGross() - calculatePF() - calculateTax();
    }

    void displayPaySlip()
    {

        System.out.println("========PAY SLIP=========");
        System.out.println("Employee ID "+empId);
        System.out.println("Employee name "+empName);
        System.out.println("Employee Designation "+designation);
        System.out.printf("Basic Salary : %.3f\n", basicSalary);
        System.out.printf("HRA : %.3f\n", calculateHra());
        System.out.printf("DA : %.3f\n", calculateDA());
        System.out.printf("PF : %.3f\n",calculatePF());
        System.out.printf("Tax : %.3f\n", calculateTax());
        System.out.printf("Gross Salary : %.3f\n", calculateGross());
        System.out.printf("Net Salary : %.3f\n", calculateNet());

    }
}

public class Company{
    public static void main(String[] args) {

        //object creation of Employee
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();


        //assigning employee one values
        e1.empId = 6887;
        e1.empName = "Rajkumar";
        e1.designation = "Acting_Developer";
        e1.basicSalary = 50000;

        //assigning the e2 values
        e2.empId = 7887;
        e2.empName = "MuthuRaj";
        e2.designation = "Mega_Developer";
        e2.basicSalary = 47000;

        //assigning the e3 values
        e3.empId = 8887;
        e3.empName = "Babruvahana";
        e3.designation = "SDE3";
        e3.basicSalary = 67000;


        //comparison logic goes here

        if (e1.calculateNet() > e2.calculateNet() && e1.calculateNet() > e3.calculateNet())
        {
            System.out.println(e1.empName+" has highest salary");
        }
        else if (e2.calculateNet() > e1.calculateNet() && e2.calculateNet() > e3.calculateNet())
        {
            System.out.println(e2.empName+" has the highest salary");
        }
        else
        {
            System.out.println(e3.empName+" has highest salary");
        }

        e1.displayPaySlip();
        e2.displayPaySlip();
        e3.displayPaySlip();

    }
}
