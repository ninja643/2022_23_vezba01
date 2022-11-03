package operators;

public class StringOperations
{
	public static void main(String[] args)
	{
		int x = 0;
		int y = 1;
		int z = 2;
		String s = "x, y, z ";
		System.out.println(x + y + z + " " + s);
		s += "(summed) = ";
		System.out.println(s + x + y + z);
		System.out.println(s + (x + y + z));
		System.out.println("" + x);
	}
}
