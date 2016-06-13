package factory_method.self;

public class KamenRider extends Rider {

	private String name;

	KamenRider(String name) {

		this.name = name;

		System.out.println("仮面ライダー" + this.name + "誕生！");

	}

	@Override
	public void kick() {

		System.out.println(this.name + "キック！！！");

	}

	public String getName() {

		return this.name;

	}

}
