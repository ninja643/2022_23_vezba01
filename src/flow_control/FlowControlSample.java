package flow_control;

import java.time.Month;

public class FlowControlSample
{
	public static String exampleOfIF(String animal)
	{
		String result;
		if (animal.equals("DOG") || animal.equals("CAT"))
		{
			result = "domestic animal";
		}
		else if (animal.equals("TIGER"))
		{
			result = "wild animal";
		}
		else
		{
			result = "unknown animal";
		}
		return result;
	}

	public static int newSwitch(Month month)
	{
		return switch (month)
			{
				case JANUARY, FEBRUARY, MARCH -> {
					System.out.println("Aha");
					yield 3;
				}
				case APRIL, MAY, JUNE -> 6;
				case JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 0;
			};
	}

	/*
	public String exampleOfSwitch(String animal) {
    String result;
    switch (animal) {
        case "DOG":
            result = "domestic animal";
            break;
        case "CAT":
            result = "domestic animal";
            break;
        case "TIGER":
            result = "wild animal";
            break;
        default:
            result = "unknown animal";
            break;
    }
    return result;
	}
	 */

	/*
	final String dog="DOG";
	String cat="CAT";

	switch (animal) {
		case dog: //compiles
    		result = "domestic animal";
		case cat: //does not compile
    		result = "feline"
	}
	 */
}
