package Challenge06_01;

public class BestGirl extends Girl {
	BestGirl(String name) {
		super(name);
	}

	@Override
	public void show() {
		System.out.println(name + "는 자바를 무지하게 잘 안다.");
	}
}
