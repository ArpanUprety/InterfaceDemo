public class Rectangle implements Shape, AsciiArt
{
    private  double side1, side2;

   public Rectangle(int side1, int side2){
       this.side1 = side1;
       this.side2 = side2;

   }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (side1 * 2) + (side2 * 2);
    }


    @Override
    public void printAscii() {


      for (int i = 0; i < side1; i++){
          System.out.println();
          for (int x = 0; x < side2; x++){
              System.out.print("*");
          }

        }
    }
}
