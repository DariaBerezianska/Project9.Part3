class Rectangle {
    //Part1
    static int x;
    static int y;

    //Part2
    //static method
    static int rectangleArea() {
        return x * y;
    }

    //access the static method inside another static method + ERROR trying to access not-static method inside the static method
    static void printRectangleArea() {
        System.out.println("rectangle area is " + rectangleArea());
//        printRectangleAreaMultiplyingByNum();
    }

    //access the static method inside non-static method
    public void printRectangleAreaMultiplyingByNum(int num) {
        System.out.println("rectangle area multiply by " + num + " is " + rectangleArea() * num);
    }
}

public class Main {
    public static void main(String[] args) {
        //Part1
        //access static variable outside the class using class name
        Rectangle.x = 5;
        Rectangle.y = 10;
        //creat two objects of Rectangle class
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        //modifying a static variable
        Rectangle.x = 7;
        Rectangle.y = 8;
        //check if the value of two objects is equal
        System.out.println(rectangle1.x);
        System.out.println(rectangle2.x);
        System.out.println(rectangle1.y);
        System.out.println(rectangle2.y);
        //Part2
        //calling static method using a class name
        Rectangle.rectangleArea();
        //static method inside another static method
        Rectangle.printRectangleArea();
        //static method inside non-static method
        rectangle2.printRectangleAreaMultiplyingByNum(8);
    }
}