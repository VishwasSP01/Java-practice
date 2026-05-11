class Student{

    //variables
    String name;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;

    //methods
    //sum method
    int calculateTotal()
    {
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;

        return sum;
    }

    //cal average
    double calculateAverage()
    {
        double avg = calculateTotal() / 5.0;

        return avg;
    }

    //find gread
    String findGrade()
    {
        if(calculateAverage() >=90 && calculateAverage() <= 100)
        {
            return "A+";
        }
        else if(calculateAverage() >=80 && calculateAverage() <= 89)
        {
            return "A";
        }
        else if(calculateAverage() >=70 && calculateAverage() <= 79)
        {
            return "B";
        }
        else if(calculateAverage() >=60 && calculateAverage() <= 69)
        {
            return "C";
        }
        else
        {
            return "Fail";
        }
    }

    //display reportcard
    void displayReportCard(){
        System.out.println("===== STUDENT REPORT CARD =====");
        System.out.println("Name of Student: "+name);

        System.out.println("Subject 1 : " + sub1);
        System.out.println("Subject 2 : " + sub2);
        System.out.println("Subject 3 : " + sub3);
        System.out.println("Subject 4 : " + sub4);
        System.out.println("Subject 5 : " + sub5);

        System.out.println("Total : " + calculateTotal());

        System.out.printf("Average : %.3f\n", calculateAverage());

        System.out.println("Grade : " + findGrade());
    }
}

public class Grade {
    static void main(String[] args) {

        //object creation
        Student s1 = new Student();
        s1.name = "Vijay";
        s1.sub1 = 78;
        s1.sub2 = 89;
        s1.sub3 = 97;
        s1.sub4 = 56;
        s1.sub5 = 63;

        s1.displayReportCard();
    }
}
