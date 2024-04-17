public class Calculation extends AreaCal<Float> 
{

	@Override
	void square(Float length) 
	{
		
		System.out.println("Area="+(length*length)+"m*m");
		
	}

	@Override
	void circle(Float radius) 
	{
		System.out.println("Area="+(3.14f*(radius*radius))+"m*m");
		
		
	}

	@Override
	void triangle(Float base, Float height) 
	{
		
		System.out.println("Area="+((base*height)*0.5f)+"m*m");
		
	}

}
