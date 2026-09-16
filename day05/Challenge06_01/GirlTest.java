package Challenge06_01;

public class GirlTest {
	public static void main(String[] args) {
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		BestGirl gg = new BestGirl();
		
		Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};
		
		for (Girl g : girls) {
			g.show();
		}
	}
}
