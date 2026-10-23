import cards.Suite;
import rs.ac.ni.pmf.oop2.geometry.Figura;
import rs.ac.ni.pmf.oop2.geometry.Krug;

public class HelloWorld
{
	public HelloWorld(int x)
	{
	}



	public void swap(int x, int y)
	{
		System.out.println("Pre zamene: x = " + x + ", y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Posle zamene: x = " + x + ", y = " + y);
	}

	public void changeName(final Student student)
	{
		System.gc();
		Student student2 = new Student(12345, "John", "Doe");
		student2.setPassword("Tralala");

		student.setIme("Jane");
	}

	public static void main(String[] args)
	{
		HelloWorld hw = new HelloWorld(1);

		Student student = new Student(12345, "John", "Doe");
		Student student2 = new Student(12345, "John", "Doe");
	}

	private void printSuite(final Suite suite)
	{
		switch (suite)
		{
			case SPADES -> System.out.println("Spades");
			case DIAMONDS -> System.out.println("Diamonds");
			case HEARTS -> System.out.println("Hearts");
			case CLUBS -> System.out.println("Clubs");
			default -> System.out.println("Nepoznata karta");
		}
	}
}
