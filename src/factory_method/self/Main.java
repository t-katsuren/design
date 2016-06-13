package factory_method.self;

public class Main {

	public static void main(String[] args) {

		Factory riderFactory = new RiderFactory();

		Rider mySoul = riderFactory.create("MySoul");
		Rider deepSpecter = riderFactory.create("DeepSpecter");
		Rider necrom = riderFactory.create("Necrom");

		mySoul.omegaDrive();
		deepSpecter.omegaDrive();
		necrom.omegaDrive();

	}

}
