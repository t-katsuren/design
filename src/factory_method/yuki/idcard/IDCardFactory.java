package factory_method.yuki.idcard;

import java.util.*;

import factory_method.yuki.framework.*;

public class IDCardFactory extends Factory {

	private HashMap<Integer, String> database = new HashMap<>();

	private int serial = 100;

	@Override
	protected synchronized Product createProduct(String owner) {

		return new IDCard(owner, serial++);

	}

	@Override
	protected void registerProduct(Product product) {

		IDCard card = (IDCard)product;

		database.put(new Integer(card.getSerial()), card.getOwner());

	}

	public Map<Integer, String> getDatabase() {

		return database;

	}

}
