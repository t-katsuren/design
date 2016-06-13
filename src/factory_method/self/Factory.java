package factory_method.self;

public abstract class Factory {

	protected abstract Rider createRider(String name);

	public final Rider create(String name) {

		return createRider(name);

	}

}
