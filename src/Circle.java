public class Circle implements Shape, AsciiArt{
private double radius;

public Circle(double radius){
    this.radius = radius;
}

    @Override
    public double calculateArea(){
return Math.PI * radius * radius;


    }

    @Override
    public double calculatePerimeter(){
return 2 * Math.PI * radius;


    }

    public void sayHello(){
        System.out.println("Hi. I'm a circle!");
    }


    @Override
    public void printAscii() {

    }
}
