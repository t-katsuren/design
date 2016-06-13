package template_method.practice;

public class Main {

	public static void main(String[] args) {

		Calculator add = new Add();

		Calculator minus = new Minus();

		add.calculate(2, 5);

		minus.calculate(2, 5);

	}

}
