package iterator.self;

public class CardListIterator implements Iterator {

	private CardList cardList;

	private int index;


	public CardListIterator(CardList cardList) {

		this.cardList = cardList;
		this.index = 0;

	}

	@Override
	public boolean hasNext() {

		if(index < cardList.size()) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Object next() {

		Card card = cardList.getCardListAt(index);

		index++;

		return card;

	}

}
