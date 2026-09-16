package Challenge06_02;

public class Student extends Person {
	protected int StudentNo;
	
	public Student(String name, int age, int StudentNo) {
		super(name, age);
		this.StudentNo = StudentNo;
	}
	
	public int getStudentNo() {
		return StudentNo;
	}
	
	@Override
	public String show() {
		return "학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + StudentNo + "]";
	}
}
