package iterator.nomal;

public class MyTeacher extends Teacher {

	private StudentList studentList;

	@Override
	public void createStudentList() {

		studentList = new StudentList(4);

		studentList.add(new Student("tekky", 1));
		studentList.add(new Student("ranko", 2));
		studentList.add(new Student("sougo", 1));
		studentList.add(new Student("akito", 1));

	}

	@Override
	public void callStudents() {

		for(int i = 0; i < studentList.getLastNum(); i++) {
			System.out.println(studentList.students[i].getName());
		}

	}

}
