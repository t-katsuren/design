package iterator.self;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Cards cards = new Cards(100);

		for(int i = 0; i < 5; i++) {

			int suit = new Random().nextInt(4) + 1;
			int num = new Random().nextInt(13) + 1;

			Card card = new Card(suit, num);

			cards.add(card);

		}

		Iterator it = cards.iterator();

		while(it.hasNext()) {

			Card card = (Card)it.next();

			System.out.println(card);

		}

		System.out.println("-----------------");


		CardList cardList = new CardList();

		for(int i = 0; i < 5; i++) {

			int suit = new Random().nextInt(4) + 1;
			int num = new Random().nextInt(13) + 1;

			Card card = new Card(suit, num);

			cardList.add(card);

		}

		Iterator itList = cardList.iterator();

		while(itList.hasNext()) {

			Card card = (Card)itList.next();

			System.out.println(card);

		}

	}

}
