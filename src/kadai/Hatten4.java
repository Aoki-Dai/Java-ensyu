//アプリケーション開発
//発展課題4
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

public class Hatten4 {

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
			jf.setTitle("発展課題4");
		}
		return jf;
	}
    
	// メインコンテントパネルを取得するメソッド
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
			jl.setText("2 は素数です");
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
	
	//void...戻り値がないメソッドで指定する特別な型
	private void updateLabel() {
		jl.setText(factorize(i));
	}

	//ブーリアン型...True or False
	private boolean isPrime(int num) {
		if (num <= 1)
			return false;

		if (num == 2)
			return true;

		if (num % 2 == 0)
			return false;

		for (int j = 3; j <= Math.sqrt(num); j += 2) {
			if (num % j == 0)
				return false;
		}
		return true;
	}

	private String factorize(int num) {
		if (isPrime(num)) {
			return num + " は素数です";
		}

		int[] factors = new int[32]; // 素因数を保存する配列
		int index = 0;
		int originalNum = num;

		for (int j = 2; j <= num / 2; j++) {
			while (num % j == 0) {
				factors[index++] = j;
				num /= j;
			}
		}
		if (num > 1) {
			factors[index++] = num;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(originalNum).append(" = ");
		for (int k = 0; k < index; k++) {
			sb.append(factors[k]);
			if (k < index - 1) {
				sb.append("×");
			}
		}
		return sb.toString();
	}

	class MyActionListener implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i++; //iの値を1増やして
			updateLabel(); //ラベルを更新
		}
	}

	class MyActionListener10 implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i += 10; //iの値を10増やして
			updateLabel(); //ラベルを更新
		}
	}

	class MyActionListener100 implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i += 100; //iの値を100増やして
			updateLabel(); //ラベルを更新
		}
	}

	class MyActionListenerReset implements ActionListener { //リスナーの実装
		public void actionPerformed(ActionEvent e) {
			i = 2; //リセット
			updateLabel(); //ラベルを更新
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Hatten4 application = new Hatten4();
				application.getJFrame().setVisible(true);
			}
		});
	}
}
