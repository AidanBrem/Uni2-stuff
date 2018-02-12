//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test cases
		
		Line line = new Line();
		
		System.out.println("The slope is " + String.format("%.2f\n", line.calculateSlope(1, 9, 14, 2)));
		System.out.println("The slope is " + String.format("%.2f\n", line.calculateSlope(1, 7, 18, 3)));
		System.out.println("The slope is " + String.format("%.2f\n", line.calculateSlope(6, 4, 2, 2)));
		System.out.println("The slope is " + String.format("%.2f\n", line.calculateSlope(1, 1, 2, 9)));
		
		
	}
}