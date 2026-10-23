package rs.ac.ni.pmf.oop2.geometry;

public class Krug extends Figura
{
	public static int counter = 0;

	long maxRadius = 1_000_000_000_000L;

	int x;
	int y;
	float r;

	public Krug(int x, int y, float r)
	{
		this.x = x;
		this.y = y;
		this.r = r;

		counter++;
	}

	public float area()
	{
		return (float) (Math.PI * r * r);
	}
}
