package factory_method.self;

public class RiderFactory extends Factory {

	@Override
	protected Rider createRider(String name) {

		return new Ghost(name);

	}

}
