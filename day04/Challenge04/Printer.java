package Challenge04;

public class Printer {
	private int numOfPapers;
	private boolean duplex;
	
//	public int getNumOfPapers() {
//		return numOfPapers;
//	}
	
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		String mode = duplex ? "양면" : "단면";
		int papersNeeded = duplex ? (amount + 1) / 2 : amount;
		
		if (numOfPapers == 0) {
			System.out.println("남아있는 용지가 없습니다.");
		}
		else if (papersNeeded > numOfPapers) {
			int shortage = amount - numOfPapers;
			System.out.println(mode + "으로 모두 출력하려면 용지가 " + shortage + "매 부족합니다." + numOfPapers + "장만 출력합니다.");
			numOfPapers = 0;	
		}
		else {
			numOfPapers -= papersNeeded;
			System.out.println(mode + "으로 " + papersNeeded + "장 출력했습니다." + "현재 " + numOfPapers + "장 남았습니다.");
		}
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	
	
}