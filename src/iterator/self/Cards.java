package iterator.self;

public class Cards implements Aggregate {

	private Card[] cards;

	private int last;


	public Cards(int maxsize) {

		this.cards = new Card[maxsize];
		this.last = 0;

	}

	public Card getCardAt(int index) {

		return this.cards[index];

	}

	public void add(Card card) {

		this.cards[last] = card;

		last++;

	}

	public int size() {

		return this.last;

	}

	@Override
	public Iterator iterator() {

		return new CardsIterator(this);

	}

}
