package Abstract;

public class Demo1 {
    class Shape {
        public double calculateArea(double sideOrRadius) {
            return 0;
        }

        public double calculatePerimeter(double sideOrRadius) {
            return 0;
        }
    }
    class Circle extends Shape{
        double PI = Math.PI;
        double radius;

        public Circle(double radius){
            this.radius= radius;
        }
    }
}