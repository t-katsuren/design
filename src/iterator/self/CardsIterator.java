package iterator.self;

public class CardsIterator implements Iterator {

	private Cards cards;

	private int index;


	public CardsIterator(Cards cards) {

		this.cards = cards;
		this.index = 0;

	}

	@Override
	public boolean hasNext() {

		if(index < cards.size()) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Object next() {

		Card card = this.cards.getCardAt(index);

		index++;

		return card;

	}

}
