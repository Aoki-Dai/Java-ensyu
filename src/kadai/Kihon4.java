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

// フレームを表示し，ボタンを押すとラベルの数字が増える
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
			jf = new JFrame();// JFrameクラスのオブジェクト（ウィンドウ）を生成
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ×ボタンでウインドウを閉じ，終了するようにする
			jf.setSize(640, 240); // windowサイズ
			jf.setLocationRelativeTo(null);// ウインドウを画面の中央に表示
			jf.setContentPane(getJContentPane());// コンテントペーンを設定
			jf.setTitle("基本課題4");
		}
		return jf;
	}

	// コンテントペーンを取得
	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new GridLayout(2, 1));
			cp.add(getPanel());
			cp.add(getPnel2());
		}
		return cp;
	}

	// ラベルを取得
	private JPanel getPanel() {
		if (jpLabel == null) {
			jpLabel = new JPanel();
			jpLabel.setLayout(new GridLayout(1, 1));
			jpLabel.add(getJLabel()); // ラベルを貼り付け
		}
		return jpLabel;
	}

	// ボタンを取得
	private JPanel getPnel2() {
		if (jpButton == null) {
			jpButton = new JPanel();
			jpButton.setLayout(new GridLayout(1, 4));
			jpButton.add(getJButton()); // +1ボタンを貼り付け
			jpButton.add(getJButton10()); // +10ボタンを貼り付け
			jpButton.add(getJButton100()); // +100ボタンを貼り付け
			jpButton.add(getJButtonReset()); // リセットボタンを貼り付け
		}
		return jpButton;
	}

	// ラベルを取得
	private JLabel getJLabel() {
		if (jl == null) {
			jl = new JLabel();
			jl.setText(Integer.toString(i));
		}
		return jl;
	}

	// +1ボタンを取得
	private JButton getJButton() {
		if (jb == null) {
			jb = new JButton();
			jb.setText("+1ボタン");
			jb.addActionListener(new MyActionListener()); // リスナーの登録
		}
		return jb;
	}

	// +10ボタンを取得
	private JButton getJButton10() {
		if (jb10 == null) {
			jb10 = new JButton();
			jb10.setText("+10ボタン");
			jb10.addActionListener(new MyActionListener10());
		}
		return jb10;
	}

	// +100ボタンを取得
	private JButton getJButton100() {
		if (jb100 == null) {
			jb100 = new JButton();
			jb100.setText("+100ボタン");
			jb100.addActionListener(new MyActionListener100());
		}
		return jb100;
	}

	// リセットボタンを取得
	private JButton getJButtonReset() {
		if (jbReset == null) {
			jbReset = new JButton();
			jbReset.setText("リセットボタン");
			jbReset.addActionListener(new MyActionListenerReset());
		}
		return jbReset;
	}

	// リスナーの実装 +1の処理
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			i++; // iの値を1増やして
			jl.setText(Integer.toString(i)); // ラベルに設定
		}
	}

	// リスナーの実装 +10の処理
	class MyActionListener10 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			i += 10; // iの値を10増やして
			jl.setText(Integer.toString(i)); // ラベルに設定
		}
	}

	// リスナーの実装 +100の処理
	class MyActionListener100 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			i += 100; // iの値を100増やして
			jl.setText(Integer.toString(i)); // ラベルに設定
		}
	}

	// リスナーの実装 リセットの処理
	class MyActionListenerReset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			i = 1; // リセット
			jl.setText(Integer.toString(i)); // ラベルに設定
		}
	}

	// メインメソッド
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon4 application = new Kihon4();// インスタンス生成
				application.getJFrame().setVisible(true);// ウインドウを可視化
			}
		});
	}
}
