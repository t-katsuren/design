package prototype.yuuki;

import prototype.yuuki.framework.*;

public class Main {

	public static void main(String[] args) {

		//準備
		Manager manager = new Manager();
		UnderLinePen upen = new UnderLinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);

		//生成
		Product p1 = manager.create("strong message");
		p1.use("Hello World.");
		Product p2 = manager.create("warning box");
		p2.use("Hello World.");
		Product p3 = manager.create("slash box");
		p3.use("Hello World.");

	}

}
