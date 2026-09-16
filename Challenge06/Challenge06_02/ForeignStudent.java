package Challenge06_02;

public class ForeignStudent extends Student {
	String nationality;
	
	public ForeignStudent(String name, int age, int StudentNo, String nationality) {
		super(name, age, StudentNo);
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	@Override
	public String show() {
		return "외국인[이름 : " + name + ", 나이 : " + age + ", 학번 : " + StudentNo +
				", 국적 : " + nationality + "]";
	}
}
