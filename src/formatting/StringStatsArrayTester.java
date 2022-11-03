package formatting;

public class StringStatsArrayTester
{
	public static void main(String[] args)
	{
		final String[] values = { "A", "B", "A" };
		final StringStatsArray stringStatsArray = new StringStatsArray(values);

		System.out.println(stringStatsArray);
		System.out.println(stringStatsArray.averageLength());
		System.out.println(stringStatsArray.sortStatus());
	}
}
