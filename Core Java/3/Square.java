public class Square extends Shape
{
  private int length;
  
  public Square (int length)
  {
    this.length=length;
    
  }

  public float area()
  {
    return this.length*this.length;
  } 
}