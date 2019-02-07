package refactoring_gilbut.chap12.after;

import javax.swing.JPanel;

public class Graph extends JPanel implements ValueListener {
	
	public enum GraphType{
		RECTANGLE, CIRCLE
	}
	
	//protected : ���� Ŭ���� or ��ӹ��� Ŭ����
	protected int graphValue;
	
	//������
	public static Graph createGraph(GraphType type, int width, int height) {
		switch(type) {
		case RECTANGLE:
			return RectangleGraph.getInstance(width, height);
	
		case CIRCLE:
			return CircleGraph.getInstance(width, height);
			
		default:
			throw new RuntimeException("Unknown GraphType");
		}
	}
	@Override
	public void valueChanger(ValueChangeEvent e) {
		// TODO Auto-generated method stub
		graphValue = e.getSoruce().getValue();
		repaint();
	}

}
