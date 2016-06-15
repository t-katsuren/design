package prototype.yuuki.framework;

import java.util.*;

public class Manager {

	private Map<String, Product> showcase = new HashMap<>();

	public void register(String name, Product proto) {

		showcase.put(name, proto);

	}

	public Product create(String protoName) {

		Product p = showcase.get(protoName);

		return p.createClone();

	}

}
