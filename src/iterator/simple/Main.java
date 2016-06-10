package iterator.simple;

public class Main {

	public static void main(String[] args) {

		Member member = new Member();

		member.join("tekky");
		member.join("ranko");
		member.join("sougo");
		member.join("akito");

		for(int i = 0; i < member.size(); i++) {
			System.out.println(member.getMemberAt(i));
		}

	}

}
