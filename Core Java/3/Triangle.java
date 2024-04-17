public class Triangle extends Shape
{
  private int length;
  private int height;
  public Triangle (int length, int height)
  {
    this.length=length;
    this.height=height;
  }

  public float area()
  {
    return this.length*this.height*0.5f;
  } 
}