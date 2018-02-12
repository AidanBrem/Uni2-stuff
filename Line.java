//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;


	public double calculateSlope( double x1, double y1, double x2, double y2 )
	{
		slope = (y2 - y1) / (x2 - x1);
		return slope;

	}

	public void print( )
	{



	}
}