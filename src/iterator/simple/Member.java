package iterator.simple;

import java.util.*;

public class Member {

	private List<String> nameList;


	public Member() {
		this.nameList = new ArrayList<>();
	}

	public void join(String name) {
		this.nameList.add(name);
	}

	public int size() {
		return nameList.size();
	}

	public String getMemberAt(int index) {
		return this.nameList.get(index);
	}

}
