import java.awt.Color;

public class Lion extends Cat
{
	private Color colorMane;	

	public Color getMane()
	{
		return colorMane;
	}
	
	public void setManeColor(Color m)
	{
		colorMane = m;
	}
	
	public void roar()
	{
		System.out.println(getName() + " just roared");
	}
	
	
	
}
