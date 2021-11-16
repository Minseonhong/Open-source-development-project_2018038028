package problem_11weeks;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class problem10_4 extends JFrame {
	JLabel label = null;

	public problem10_4() {
	super("Left 키로 문자열 교체");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	label = new JLabel("Love Java");
	c.add(label);
	c.addKeyListener(new MyKey());
	c.setFocusable(true);
	c.requestFocus();
	setSize(400,200);
	setVisible(true);
	}

	class MyKey extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Component c = (Component) e.getSource();
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				StringBuffer sb = new StringBuffer(label.getText());
				char temp;
				temp = sb.charAt(0);
				sb.append(temp);
				sb.delete(0, 1);
				label.setText(sb.toString());
				c.setFocusable(true);
				c.requestFocus();
			}
		}
	}

	public static void main(String[] args) {
		new problem10_4();
	}
}
