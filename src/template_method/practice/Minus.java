package template_method.practice;

public class Minus extends Calculator {

	@Override
	protected void showHeader() {
		System.out.println("/-------------/");
	}

	@Override
	protected void showResult(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	@Override
	protected void showFooter() {
		System.out.println("/-------------/");
	}

}
