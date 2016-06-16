package builder.yuuki;

public class Main {

	public static void main(String[] args) {

		TextBuilder textBuilder = new TextBuilder();
		Director textDirector = new Director(textBuilder);
		textDirector.construct();
		String result = textBuilder.getResult();
		System.out.println(result);

		HTMLBuilder htmlBuilder = new HTMLBuilder();
		Director htmlDirector = new Director(htmlBuilder);
		htmlDirector.construct();
		String filename = htmlBuilder.getResult();
		System.out.println(filename + "が作成されました。");

	}

}
