package refactoring_gilbut.chap04.before;

public class LabelBefore {
	private String label;
	
	public LabelBefore(String label) {
		this.label = label;
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
	
	
	
	
}
