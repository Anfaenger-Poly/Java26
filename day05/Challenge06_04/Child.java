package Challenge06_04;

public class Child extends Parent {
	String name = "사도세자";
	
	@Override
	void print() {
		System.out.println("나는 " + name + "이다.");
	}
}
