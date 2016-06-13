package factory_method.self;

public class Ghost extends Rider {

	private String name;

	public Ghost(String name) {

		this.name = name;

	}

	@Override
	public void omegaDrive() {

		System.out.println(this.name + " Omega Drive !");

	}

}
