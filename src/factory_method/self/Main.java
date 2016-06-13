package factory_method.self;

public class Main {

	public static void main(String[] args) {

		RiderFactory rf = new KamenRiderFactory();

		Rider no1 = rf.create("1号");
		Rider ghost = rf.create("ゴースト");
		Rider drive = rf.create("ドライブ");

		no1.kick();
		ghost.kick();
		drive.kick();

	}

}
