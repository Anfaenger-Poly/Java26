package Challenge06_02;

public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("길동이", 22);
		people[1] = new Student("황진이", 23, 100);
		people[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		for (Person p : people) {
			System.out.println(p.show());
		}
	}
}
