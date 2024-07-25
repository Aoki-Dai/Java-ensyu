package kadai;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Kihon4Sample2 {

	private JFrame jf = null;
	private JPanel cp = null;
	private JLabel jl = null;
	private JButton jb = null;
	private int i = 1;

	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(300, 185);
			jf.setLocationRelativeTo(null);
			jf.setContentPane(getJContentPane());
			jf.setTitle("カウンタサンプル");
		}
		return jf;
	}

	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new FlowLayout());
			cp.add(getJLabel());
			cp.add(getJButton());
		}
		return cp;
	}

	private JLabel getJLabel() {
		if (jl == null) {
			jl = new JLabel();
			jl.setText(Integer.toString(i));
		}
		return jl;
	}

	private JButton getJButton() {
		if (jb == null) {
			jb = new JButton();
			jb.setText("+1ボタン");
			jb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i++;
					jl.setText(Integer.toString(i));
				}
			});
		}
		return jb;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon4Sample2 application = new Kihon4Sample2();
				application.getJFrame().setVisible(true);
			}
		});
	}
}
