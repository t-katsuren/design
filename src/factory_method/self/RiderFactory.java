package factory_method.self;

public abstract class RiderFactory {

	protected abstract Rider createRider(String name);

	public Rider create(String name) {

		return createRider(name);

	}

}
