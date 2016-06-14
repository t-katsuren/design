package singleton.yuuki;

public class Main {

	public static void main(String[] args) {

		System.out.println("Start.");

		Singleton obj1 = Singleton.getInstance();

		Singleton obj2 = Singleton.getInstance();

		if(obj1 == obj2) {

			System.out.println("true");

		} else {

			System.out.println("false");

		}

		System.out.println("End.");

		TicketMaker maker = TicketMaker.getInstance();

		for(int i = 0; i < 10; i++) {

			System.out.println(maker.getNextTicketNumber());

		}

	}

}
