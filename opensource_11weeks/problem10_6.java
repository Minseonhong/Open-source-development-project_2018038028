package problem_11weeks;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class problem10_6 extends JFrame {
	private JLabel la = new JLabel("C");

	public problem10_6() {
		super("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		c.add(la);
		la.setLocation(100, 100);
		la.setSize(30, 30); 

		la.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				int x = (int) (Math.random() * (c.getWidth() - 50));
				int y = (int) (Math.random() * (c.getHeight() - 50));
				la.setLocation(x, y);
			}
		});

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new problem10_6();
	}
}
