package problem_10weeks;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
	}
}