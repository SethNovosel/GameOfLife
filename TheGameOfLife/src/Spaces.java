import java.awt.Color;
import java.util.ArrayList;
public class Spaces 
{
	private String name;
	private int x;
	private int y;
	public Spaces(String n, int x, int y)
	{
	x = x;
	y = y;
	}
public void lifeSpot() 
{

}
public void getPaid() 
{

}
public void getCareer() 
{

}
public void getMarried() 
{

}
public void buyHouse() 
{

}

public static void spaces()
	{
	ArrayList<Spaces> spaces = new ArrayList<Spaces>();
	spaces.add(new Spaces("Start", 0,0));
	spaces.add(new Spaces("Normal Space",75,0));
	spaces.add(new Spaces("Get Career",150,0));
	spaces.add(new Spaces("Payday",225,0));
	spaces.add(new Spaces("Normal Space",300,0));
	spaces.add(new Spaces("Normal Space",375,0));
	spaces.add(new Spaces("Life Spot",375,75));
	spaces.add(new Spaces("Normal Space",300,110));
	spaces.add(new Spaces("Get Married",225,110));
	spaces.add(new Spaces("Normal Space",150,110));
	spaces.add(new Spaces("Payday",110,110));
	spaces.add(new Spaces("Normal Space",110,185));
	spaces.add(new Spaces("Payday",185,185));
	spaces.add(new Spaces("Normal Space",260,185));
	spaces.add(new Spaces("Life Space",335,185));
	spaces.add(new Spaces("Payday",410,185));
	spaces.add(new Spaces("Normal Space",485,185));
	spaces.add(new Spaces("Normal Space",450,260));
	spaces.add(new Spaces("Get House",375,260));
	spaces.add(new Spaces("Life Space",300,260));
	spaces.add(new Spaces("Normal Space",225,260));
	spaces.add(new Spaces("Payday",150,260));
	spaces.add(new Spaces("Normal Space",75,260));
	spaces.add(new Spaces("Normal Space",35,260));
	spaces.add(new Spaces("Life Space",35,335));
	//5th
	}
}

