class Rectangle{

    double length;
    double width;

    //declaring the methods
    //declaring method area
    double area()
    {
        return length * width;
    }

    //method perimeter
    double perimeter()
    {
        return 2 * (length + width);
    }

}
class Circle{

    //variables
    double radius;

    //methods
    double area()
    {
        return Math.PI * radius * radius;
    }

    double circumference()
    {
        return 2 * Math.PI * radius;
    }

}
public class RectangleAndCircle {
    static void main(String[] args) {

        //rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        //assigning the values
        r1.length = 10;
        r1.width = 20;
        r2.length = 20;
        r2.width = 25;

        System.out.println("Rectangle one has the area of "+r1.area());
        System.out.println("Rectangle one has the perimeter of "+r1.perimeter());
        System.out.println("Rectangle two has the area of "+r2.area());
        System.out.println("Rectangle two has the perimeter of "+r2.perimeter());

        //circle
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 5;
        c2.radius = 7;

        System.out.println("First circle has the area of "+c1.area());
        System.out.println("First circle has the circumference of "+c1.circumference());
        System.out.println("Second circle has the area of "+c2.area());
        System.out.println("Second circle has the circumference of "+c2.circumference());



    }
}
