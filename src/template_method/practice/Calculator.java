package template_method.practice;

public abstract class Calculator {

	protected abstract void showHeader();

	protected abstract void showResult(int num1, int num2);

	protected abstract void showFooter();

	public final void calculate(int num1, int num2) {

		showHeader();

		showResult(num1, num2);

		showFooter();

	}

}
