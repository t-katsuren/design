package iterator.self;

import java.util.ArrayList;
import java.util.List;

public class CardList implements Aggregate {

	private List<Card> cardList;


	public CardList() {

		this.cardList = new ArrayList<>();

	}

	public int size() {
		return this.cardList.size();
	}

	public void add(Card card) {

		this.cardList.add(card);

	}

	public Card getCardListAt(int index) {

		return this.cardList.get(index);

	}

	@Override
	public Iterator iterator() {

		return new CardListIterator(this);

	}

}
