public class Circle extends Shape
{
  private int radius;
  public Circle (int radius)
  {
	  
    this.radius=radius;
    
  }
  public float area()
  {
    return 3.14f*3.14f*this.radius*this.radius;
  } 
}