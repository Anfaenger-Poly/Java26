package Challenge06_02;

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String show() {
		return "사람[이름 : " + name + ", 나이 : " + age + "]";
	}

}
