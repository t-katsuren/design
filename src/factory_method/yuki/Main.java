package factory_method.yuki;

import factory_method.yuki.framework.*;
import factory_method.yuki.idcard.*;

public class Main {

	public static void main(String[] args) {

		Factory factory = new IDCardFactory();

		Product card1 = factory.create("tekky");
		Product card2 = factory.create("ranko");
		Product card3 = factory.create("sougo");
		Product card4 = factory.create("akito");

		card1.use();
		card2.use();
		card3.use();
		card4.use();

	}

}
