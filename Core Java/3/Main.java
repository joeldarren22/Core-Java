class Main 
{
  public static void main(String[] args) 
  {
    Shape s1 = new Circle(12);
    Shape s2 = new Square(40);
    Shape s3 = new Triangle(36,40);
    System.out.println(s1.area());
    System.out.println(s2.area());
    System.out.println(s3.area());
  }
}