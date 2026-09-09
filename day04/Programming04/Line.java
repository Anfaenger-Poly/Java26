package Programming04;

public class Line {
	private int length;
	
	public Line(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public boolean isSameLine(Line other) {
		return this.length == other.length;
	}
}
