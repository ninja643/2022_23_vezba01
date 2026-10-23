package cards;

public record Card(Suite suite, CardValue value)
{
	private static final Card[] protoDeck = new Card[52];

	static
	{
		createProtoDeck();
	}


	private static void createProtoDeck()
	{
		int cardIndex = 0;

		for (final Suite suite : Suite.values())
		{
			for (final CardValue cardValue : CardValue.values())
			{
				protoDeck[cardIndex] = new Card(suite, cardValue);
				cardIndex += 1;
			}
		}
	}

	public Card[] createNewDeck()
	{
		final Card[] deck = new Card[52];

		System.arraycopy(protoDeck, 0, deck, 0, 52);

		return deck;
	}
}
