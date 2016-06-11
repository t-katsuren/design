package adapter.delegation;

public class Hanako implements Chairperson {

	private Taro taro;

	public Hanako() {

		this.taro = new Taro();

	}

	@Override
	public void organaizeClass() {

		this.taro.enjoyWithAllClassmate();

	}

}
