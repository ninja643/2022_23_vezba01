package cards;

public class Card
{
	private final Suite suite;
	private final CardValue value;

	private static final Card[] protoDeck = new Card[52];

	static
	{
		createProtoDeck();
	}

	public Card(Suite suite, CardValue value)
	{
		this.suite = suite;
		this.value = value;
	}

	public Suite getSuite()
	{
		return suite;
	}

	public CardValue getValue()
	{
		return value;
	}

	private static void createProtoDeck()
	{
		int cardIndex = 0;

		for (Suite suite : Suite.values())
		{
			for (CardValue cardValue : CardValue.values())
			{
				protoDeck[cardIndex] = new Card(suite, cardValue);
				cardIndex += 1;
			}
		}
	}

	public Card[] createNewDeck()
	{
		final Card[] deck = new Card[52];

		for (int i = 0; i < 52; i++)
		{
			deck[i] = protoDeck[i];
		}

		return deck;
	}
}
