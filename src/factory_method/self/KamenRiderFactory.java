package factory_method.self;

public class KamenRiderFactory extends RiderFactory {

	@Override
	protected Rider createRider(String name) {

		return new KamenRider(name);

	}

}
