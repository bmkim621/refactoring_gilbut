package refactoring_gilbut.chap12.after;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private int value;
	
	private final List<ValueListener> listeners;

	public Value(int value) {
		this.value = value;
		listeners = new ArrayList<>();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyToListener();
	}
	
	private void notifyToListener() {
		// TODO Auto-generated method stub
		for(ValueListener v : listeners) {
			v.valueChanger(new ValueChangeEvent(this));
		}
	}

	public void addListener(ValueListener listener) {
		listeners.add(listener);
	}
	
	
}
