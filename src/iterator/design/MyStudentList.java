package iterator.design;

public class MyStudentList extends StudentList implements Aggregate {

	public MyStudentList() {

		super();

	}

	public MyStudentList(int studentCount) {

		super(studentCount);

	}

	@Override
	public Iterator iterator() {

		return new MyStudentListIterator(this);

	}

}
