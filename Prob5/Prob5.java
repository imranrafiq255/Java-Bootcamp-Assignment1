public class Prob5{
  public static void main(String[] args)
  {
    int length = 36;
    int breadth = 36;
    int radius = 36;
    float rectangleArea = length * breadth;
    System.out.println("Rectange area: " + rectangleArea);
    float rectanglePerimeter = ((length * breadth) * 2);
    System.out.println("Rectange perimeter: " + rectanglePerimeter);
    double circleCircumference = (float) (2 * radius * 3.14);
    System.out.println("Circle circumference: " + circleCircumference);
    double areaOfCircle = (double) (3.14 * Math.pow(radius, 2));
    System.out.println("Circle area: " + areaOfCircle);
  }
}