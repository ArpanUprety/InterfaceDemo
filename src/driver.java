public class driver {

    public static void main(String[] args) {
       // Shape myShape = new Shape(); //invalid!
Shape circle1 = new Circle(5); //Notice in this case that it is stored as shape
Circle circle2 = new Circle(6); //Notice in this case that it is stored as Circle
        Shape rect1 = new Rectangle(5,6);
        Rectangle rect2 = new Rectangle(7,8);

        System.out.println("Circle 1's area " + circle1.calculateArea());
        System.out.println("Circle 2's area " + circle2.calculateArea());

        System.out.println("Rectangle 1's area: " + rect1.calculateArea());
        System.out.println("Rectangle 1's perimeter: " + rect1.calculatePerimeter());

     //   circle1.sayHello(); // not in scope, we think it's just a shape;
        //We could do this(cast it)
        ((Circle) circle1).sayHello();
        circle2.sayHello();
        rect2.printAscii();

    }
}
