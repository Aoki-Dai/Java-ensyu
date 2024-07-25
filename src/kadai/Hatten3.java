//アプリケーション開発
//発展課題3
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hatten3 {
	public static void main(String[] args) {
		// JFrameクラスのオブジェクト（ウィンドウ）を生成
		JFrame jf = new JFrame("発展課題3");
		// ×ボタンでウインドウを閉じ，終了するようにする
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ウインドウのサイズ設定（幅，高さ）
		jf.setSize(480, 360);
		// ウインドウを画面の中央に表示
		jf.setLocationRelativeTo(null);

		JPanel cp = (JPanel) jf.getContentPane();

		// コンテントペーンcp取得後，以下を実行
		// cpのレイアウトをGridLayout（1行4列）にする
		cp.setLayout(new GridLayout(1, 3));

		JPanel jp1 = new JPanel(); // パネル1を生成
		cp.add(jp1); // コンテントペーンにパネル1を追加
		jp1.setLayout(new GridLayout(2, 1));
		// forループを用いてボタン（JButton）をコンテントペーンcpに追加
		for (int i = 1; i <= 2; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jp1.add(jb);
		}

		JPanel jp2 = new JPanel(); // パネル2を生成
		cp.add(jp2); // コンテントペーンにパネル2を追加
		jp2.setLayout(new GridLayout(3, 1));
		// forループを用いてボタン（JButton）をコンテントペーンcpに追加
		for (int i = 3; i <= 5; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jp2.add(jb);
		}

		JPanel jp3 = new JPanel(); // パネル3を生成
		cp.add(jp3); // コンテントペーンにパネル3を追加
		jp3.setLayout(new GridLayout(5, 1));
		// forループを用いてボタン（JButton）をコンテントペーンcpに追加
		for (int i = 6; i <= 10; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jp3.add(jb);
		}

		// ウインドウを可視化（最後に実行）
		jf.setVisible(true);
	}

}