package factory_method.yuki.idcard;

import factory_method.yuki.framework.*;

public class IDCard extends Product {

	private String owner;

	private int serial;

	IDCard(String owner, int serial) {

		System.out.println(owner + "(" + serial + ")" + "のカードを作ります。");

		this.owner = owner;
		this.serial = serial;

	}

	@Override
	public void use() {

		System.out.println(owner + "(" + serial + ")"  + "のカードを使います。");

	}

	public String getOwner() {

		return owner;

	}

	public int getSerial() {

		return serial;

	}

}
