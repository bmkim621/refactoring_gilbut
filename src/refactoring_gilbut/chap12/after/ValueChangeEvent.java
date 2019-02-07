package refactoring_gilbut.chap12.after;

public class ValueChangeEvent {
	private final Value soruce;

	public ValueChangeEvent(Value soruce) {
		this.soruce = soruce;
	}

	public Value getSoruce() {
		return soruce;
	}
	
	
}
