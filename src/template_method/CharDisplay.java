package template_method;

public class CharDisplay extends AbstractDisplay {

	private char c;

	public CharDisplay(char c) {

		this.c = c;

	}

	@Override
	public void open() {

		System.out.print("<<");

	}

	@Override
	public void print() {

		System.out.print(this.c);

	}

	@Override
	public void close() {

		System.out.println(">>");

	}

}
