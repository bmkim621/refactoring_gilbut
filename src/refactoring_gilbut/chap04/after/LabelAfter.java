package refactoring_gilbut.chap04.after;

public class LabelAfter {
	private String label;
	
	public LabelAfter(String label) {
		this.label = label;
	}
	
	public static LabelAfter newNull() {
		return new NullLabel();
	}
	
	public void display() {
		System.out.printf("display : %s%n", label);
	}

	@Override
	public String toString() {
		return String.format("\"%s\"", label);
	}

	public String getLabel() {
		return label;
	}
	
	public boolean isNull() {
		return false;
	}
	
	
}
