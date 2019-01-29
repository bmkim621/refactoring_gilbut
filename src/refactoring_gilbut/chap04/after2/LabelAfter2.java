package refactoring_gilbut.chap04.after2;

public class LabelAfter2 {
	private String label;
	
	public LabelAfter2(String label) {
		this.label = label;
	}
	
	public static LabelAfter2 newNull() {
		return NullLabel2.getInstance();
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
	
	private static class NullLabel2 extends LabelAfter2 {
		//ΩÃ±€≈Ê ∆–≈œ
		private static final NullLabel2 instance = new NullLabel2();
		
		public static NullLabel2 getInstance() {
			return instance;
		}

		private NullLabel2() {
			super("(none)");
		}

		@Override
		public void display() {}

		@Override
		public boolean isNull() {
			// TODO Auto-generated method stub
			return true;
		}
	}
	
}
