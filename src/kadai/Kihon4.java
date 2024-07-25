//アプリケーション開発
//基本課題4
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Kihon4 {

	private JFrame jf = null;
	private JPanel cp = null;
	private JPanel jpLabel = null;
	private JPanel jpButton = null;
	private JLabel jl = null;
	private JButton jb = null;
	private JButton jb10 = null;
	private JButton jb100 = null;
	private JButton jbReset = null;
	private int i = 1;

	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(640, 240); //windowサイズ
			jf.setLocationRelativeTo(null);
			jf.setContentPane(getJContentPane());
			jf.setTitle("基本課題4");
		}
		return jf;
	}

	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new GridLayout(2, 1));
			cp.add(getPanel());
			cp.add(getPnel2());
		}
		return cp;
	}

	private JPanel getPanel() {
		if (jpLabel == null) {
			jpLabel = new JPanel();
			jpLabel.setLayout(new GridLayout(1, 1));
			jpLabel.add(getJLabel()); //ラベルを貼り付け
		}
		return jpLabel;
	}

	private JPanel getPnel2() {
		if (jpButton == null) {
			jpButton = new JPanel();
			jpButton.setLayout(new GridLayout(1, 4));
			jpButton.add(getJButton()); //ボタンを貼り付け
			jpButton.add(getJButton10()); //ボタンを貼り付け
			jpButton.add(getJButton100()); //ボタンを貼り付け
			jpButton.add(getJButtonReset()); //ボタンを貼り付け
		}
		return jpButton;
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
			jb.addActionListener(new MyActionListener()); //リスナーの登録
		}
		return jb;
	}

	private JButton getJButton10() {
		if (jb10 == null) {
			jb10 = new JButton();
			jb10.setText("+10ボタン");
			jb10.addActionListener(new MyActionListener10());
		}
		return jb10;
	}

	private JButton getJButton100() {
		if (jb100 == null) {
			jb100 = new JButton();
			jb100.setText("+100ボタン");
			jb100.addActionListener(new MyActionListener100());
		}
		return jb100;
	}

	private JButton getJButtonReset() {
		if (jbReset == null) {
			jbReset = new JButton();
			jbReset.setText("リセットボタン");
			jbReset.addActionListener(new MyActionListenerReset());
		}
		return jbReset;
	}

	class MyActionListener implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i++; //iの値を1増やして
			jl.setText(Integer.toString(i)); //ラベルに設定
		}
	}

	class MyActionListener10 implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i += 10; //iの値を10増やして
			jl.setText(Integer.toString(i)); //ラベルに設定
		}
	}

	class MyActionListener100 implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i += 100; //iの値を100増やして
			jl.setText(Integer.toString(i)); //ラベルに設定
		}
	}

	class MyActionListenerReset implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i = 1; //リセット
			jl.setText(Integer.toString(i)); //ラベルに設定
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon4 application = new Kihon4();
				application.getJFrame().setVisible(true);
			}
		});
	}
}
