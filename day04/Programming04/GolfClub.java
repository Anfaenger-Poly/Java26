package Programming04;

public class GolfClub {
	private int number;
	private String name;
	
	public GolfClub() {
		this(7);
	}
	
	public GolfClub(int number) {
		this.number = number;
		this.name = "아이언";
	}
	
	public GolfClub(String name) {
		this.name = name;
	}
	
	public void print() {
		if (name.equals("아이언")) {
			System.out.println(number + "번 " + name + "입니다.");
		}
		else {
			System.out.println(name + "입니다.");
		}
	}
}
