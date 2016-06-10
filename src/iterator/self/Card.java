package iterator.self;

public class Card {

	private int suit; //マーク -> 1:♠ 2:♥ 3:♣ 4:♦

	private int num;  //番号


	public Card(int suit, int num) {

		this.suit = suit;
		this.num  = num;

	}

	@Override
	public String toString() {

		String str = "";

		switch(this.suit) {

		case 1:
			str = "♠";
			break;
		case 2:
			str = "♥";
			break;
		case 3:
			str = "♣";
			break;
		case 4:
			str = "♦";
			break;

		}

		return str + this.num;

	}

}
