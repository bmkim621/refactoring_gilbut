package refactoring_gilbut.chap12.after;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import refactoring_gilbut.chap12.after.Graph.GraphType;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener, ValueListener{

	private Value value;
	
	private JPanel contentPane;
	private JLabel lblOctal;
	private JLabel lblDecimal;
	private JLabel lblHexadecimal;
	private JButton btnIncrement;
	private JButton btnDecrement;

	private Graph circlePanel;
	private Graph rectanglePanel;
	
	/**
	 * Create the frame.
	 */
	public IntegerDisplay() {
		
		//references형이니까 new 해서 초기값 0으로 해준다.
		value = new Value(0);
		value.addListener(this);
		initComponents();
		//initComponents 안에서 생성되기 때문에 initComponents 다음에 add 시켜야 null 나오지 않음.
		value.addListener(circlePanel);
		value.addListener(rectanglePanel);
	}

	private void initComponents() {
		setTitle("IntegerDisplay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel titleOctal = new JLabel("Octal:");
		contentPane.add(titleOctal);
		
		lblOctal = new JLabel("0");
		contentPane.add(lblOctal);
		
		JLabel titleDecimal = new JLabel("Decimal:");
		contentPane.add(titleDecimal);
		
		lblDecimal = new JLabel("0");
		contentPane.add(lblDecimal);
		
		JLabel titleHexadecimal = new JLabel("Hexadecimal:");
		contentPane.add(titleHexadecimal);
		
		lblHexadecimal = new JLabel("0");
		contentPane.add(lblHexadecimal);
		
		btnIncrement = new JButton("+");
		btnIncrement.addActionListener(this);
		contentPane.add(btnIncrement);
		
		btnDecrement = new JButton("-");
		btnDecrement.addActionListener(this);
		contentPane.add(btnDecrement);
		
		circlePanel = Graph.createGraph(GraphType.CIRCLE, 100, 100);
		rectanglePanel = Graph.createGraph(GraphType.RECTANGLE, 100, 50);
		
		contentPane.add(circlePanel);
		contentPane.add(rectanglePanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnIncrement) {
			setValue(value.getValue() + 1);
		}
		if(e.getSource() == btnDecrement) {
			setValue(value.getValue() - 1);
		}
	}
	
	private void setValue(int value) {
		this.value.setValue(value);
	}

	@Override
	public void valueChanger(ValueChangeEvent e) {
		// TODO Auto-generated method stub
//		JOptionPane.showMessageDialog(null, e.getSoruce());
		Value v = e.getSoruce();
//		JOptionPane.showMessageDialog(null, ((Value) e.getSoruce()).getValue());
		lblOctal.setText(Integer.toOctalString(v.getValue()));
		lblDecimal.setText(Integer.toString(this.value.getValue()));
		lblHexadecimal.setText(Integer.toHexString(v.getValue()));
		
		/*lblOctal.setText(Integer.toOctalString(this.value.getValue()));
		lblDecimal.setText(Integer.toString(this.value.getValue()));
		lblHexadecimal.setText(Integer.toHexString(this.value.getValue()));*/
	}

}
