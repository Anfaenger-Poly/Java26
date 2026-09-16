package Challenge06_04;

public class Parent {
	protected String name;
	
	public Parent(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String show() {
		return "나는" + name + "이다.";
	}
}
