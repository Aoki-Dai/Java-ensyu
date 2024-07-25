//アプリケーション開発
//基本課題3
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kihon3 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		// JFrameクラスのオブジェクト（ウィンドウ）を生成
		JFrame jf = new JFrame("基本課題3");
		// ×ボタンでウインドウを閉じ，終了するようにする
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ウインドウのサイズ設定（幅，高さ）
		jf.setSize(480, 360);
		// ウインドウを画面の中央に表示
		jf.setLocationRelativeTo(null);

		JPanel cp = (JPanel) jf.getContentPane();
		// コンテントペーンcp取得後，以下を実行
		// cpのレイアウトをFlowLayoutにする
		cp.setLayout(new FlowLayout());

		FileReader fr = new FileReader("todoufuken.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			JButton jb = new JButton(s);
			cp.add(jb);
		}
		br.close(); // ファイルストリームを必ず閉じること！

		// ウインドウを可視化（最後に実行）
		jf.setVisible(true);
	}
}