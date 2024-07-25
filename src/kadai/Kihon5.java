//アプリケーション開発
//基本課題5
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Kihon5 {

	private JFrame jf = null;
	private JPanel cp = null;
	private JPanel jpLabel = null;
	private JPanel jpButton = null;
	private JPanel jpRadioButton = null;
	private JPanel jpCheckBox = null;
	private JPanel jpGet = null;
	private ButtonGroup bg = null;
	private JLabel jl = null;
	private JRadioButton jr1 = null;
	private JRadioButton jr2 = null;
	private JRadioButton jr3 = null;
	private JCheckBox jc1 = null;
	private JCheckBox jc2 = null;
	private JCheckBox jc3 = null;
	private JButton jbget = null;

	// JFrameを取得するメソッド
	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(480, 300); // windowサイズ
			jf.setLocationRelativeTo(null);
			jf.setContentPane(getJContentPane());// コンテントペーンを設定
			jf.setTitle("基本課題5");
		}
		return jf;
	}

	// パネル
	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new GridLayout(3, 1));
			cp.add(getJPanel());
			cp.add(getJPnel2());
			cp.add(getJPnel3());
		}
		return cp;
	}

	// 上段 ラベルパネル
	private JPanel getJPanel() {
		if (jpLabel == null) {
			jpLabel = new JPanel();
			jpLabel.setLayout(new GridLayout(1, 1));
			jpLabel.add(getJLabel()); // ラベルを貼り付け
		}
		return jpLabel;
	}

	// 中段 ボタンパネル
	private JPanel getJPnel2() {
		if (jpButton == null) {
			jpButton = new JPanel();
			jpButton.setLayout(new GridLayout(1, 2));
			jpButton.add(getJPnel2_1());
			jpButton.add(getJPnel2_2());
		}
		return jpButton;
	}

	// 中段左 ラジオボタンパネル
	private JPanel getJPnel2_1() {
		if (jpRadioButton == null) {
			jpRadioButton = new JPanel();
			jpRadioButton.setLayout(new GridLayout(3, 1));
			jpRadioButton.add(getJRadioButton());
			jpRadioButton.add(getJRadioButton2());
			jpRadioButton.add(getJRadioButton3());
			bg = new ButtonGroup();// ボタングループを作成
			bg.add(jr1);// ボタングループに追加
			bg.add(jr2);
			bg.add(jr3);
		}
		return jpRadioButton;
	}

	// 中段右 チェックボックスパネル
	private JPanel getJPnel2_2() {
		if (jpCheckBox == null) {
			jpCheckBox = new JPanel();
			jpCheckBox.setLayout(new GridLayout(3, 1));
			jpCheckBox.add(getJCheckBox());
			jpCheckBox.add(getJCheckBox2());
			jpCheckBox.add(getJCheckBox3());
		}
		return jpCheckBox;
	}

	// 下段 ボタンパネル
	private JPanel getJPnel3() {
		if (jpGet == null) {
			jpGet = new JPanel();
			jpGet.setLayout(new GridLayout(1, 1));
			jpGet.add(getJButton()); // ボタンを貼り付け
		}
		return jpGet;
	}

	// ここから部品
	// ラベル
	private JLabel getJLabel() {
		if (jl == null) {
			jl = new JLabel();
			jl.setText("");
		}
		return jl;
	}

	// ラジオボタン
	private JRadioButton getJRadioButton() {
		if (jr1 == null) {
			jr1 = new JRadioButton("ラジオボタン1");
			jr1.addActionListener(new MyActionListener()); // リスナーの登録
		}
		return jr1;
	}

	private JRadioButton getJRadioButton2() {
		if (jr2 == null) {
			jr2 = new JRadioButton("ラジオボタン2");
			jr2.addActionListener(new MyActionListener()); // リスナーの登録
		}
		return jr2;
	}

	private JRadioButton getJRadioButton3() {
		if (jr3 == null) {
			jr3 = new JRadioButton("ラジオボタン3");
			jr3.addActionListener(new MyActionListener()); // リスナーの登録
		}
		return jr3;
	}

	// チェックボックス
	private JCheckBox getJCheckBox() {
		if (jc1 == null) {
			jc1 = new JCheckBox("チェックボックス1");
			jc1.addActionListener(new MyActionListener()); // リスナーの登録
		}
		return jc1;
	}

	private JCheckBox getJCheckBox2() {
		if (jc2 == null) {
			jc2 = new JCheckBox("チェックボックス2");
			jc2.addActionListener(new MyActionListener()); // リスナーの登録
		}
		return jc2;
	}

	private JCheckBox getJCheckBox3() {
		if (jc3 == null) {
			jc3 = new JCheckBox("チェックボックス3");
			jc3.addActionListener(new MyActionListener()); // リスナーの登録
		}
		return jc3;
	}

	// 状態取得ボタン
	private JButton getJButton() {
		if (jbget == null) {
			jbget = new JButton("状態取得");
			jbget.addActionListener(new MyActionListener());
		}
		return jbget;
	}

	// リスナー
	class MyActionListener implements ActionListener {
		// ボタンが押された時の処理
		public void actionPerformed(ActionEvent e) {
			StringBuilder sb = new StringBuilder();// 文字列を結合するためのクラス

			// ラジオボタンの状態を取得
			if (jr1.isSelected()) {// ラジオボタン1が選択されている場合
				sb.append("ラジオボタン1");
			} else if (jr2.isSelected()) {
				sb.append("ラジオボタン2");
			} else if (jr3.isSelected()) {
				sb.append("ラジオボタン3");
			}

			// チェックボックスの状態を取得
			if (jc1.isSelected()) {
				if (sb.length() > 0)// 文字列が空でない場合
					sb.append(", ");
				sb.append("チェックボックス1");
			}
			if (jc2.isSelected()) {
				if (sb.length() > 0)
					sb.append(", ");
				sb.append("チェックボックス2");
			}
			if (jc3.isSelected()) {
				if (sb.length() > 0)
					sb.append(", ");
				sb.append("チェックボックス3");
			}

			jl.setText(sb.toString());// ラベルに設定
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon5 application = new Kihon5();
				application.getJFrame().setVisible(true);
			}
		});
	}
}
