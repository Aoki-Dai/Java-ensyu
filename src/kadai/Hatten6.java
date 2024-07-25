// アプリケーション開発
// 発展課題6
// 学年組　　3年2組
// 学生番号　2212201
// 氏名　　　青木　大

// パッケージ宣言
package kadai;

// 必要なクラスのインポート
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Hatten6 {

	// JFrameとJPanelのインスタンス変数の宣言
	private JFrame jf = null;
	private JPanel cp = null;
	// マウスの開始位置を追跡するための変数
	private int xStart = 0, yStart = 0;

	// JFrameのインスタンスを取得または初期化するメソッド
	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ウィンドウを閉じるとプログラムも終了
			jf.setSize(640, 480); // ウィンドウのサイズ設定
			jf.setLocationRelativeTo(null); // ウィンドウを画面中央に配置
			jf.setContentPane(getJContentPane()); // コンテンツペインの設定
			jf.setTitle("発展課題6"); // ウィンドウのタイトル設定
		}
		return jf;
	}

	// JPanelのインスタンスを取得または初期化するメソッド
	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			MyMouseAdapter adapter = new MyMouseAdapter(); // マウスイベントを処理するアダプター
			cp.addMouseListener(adapter); // マウスイベントリスナーの追加
			cp.addMouseMotionListener(adapter); // マウスモーションリスナーの追加
		}
		return cp;
	}

	// マウスイベントを処理する内部クラス
	class MyMouseAdapter extends MouseAdapter {
		// マウスが押された時の処理
		public void mousePressed(MouseEvent e) {
			xStart = e.getX(); // 開始X座標の記録
			yStart = e.getY(); // 開始Y座標の記録
		}

		// マウスがドラッグされた時の処理
		public void mouseDragged(MouseEvent e) {
			Graphics g = cp.getGraphics(); // グラフィックスオブジェクトの取得
			int xEnd = e.getX(); // 終了X座標
			int yEnd = e.getY(); // 終了Y座標
			g.drawLine(xStart, yStart, xEnd, yEnd); // 線の描画
			xStart = xEnd; // 次の開始点の更新
			yStart = yEnd; // 次の開始点の更新
		}
	}

	// メインメソッド
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Hatten6 application = new Hatten6(); // アプリケーションインスタンスの作成
				application.getJFrame().setVisible(true); // ウィンドウの表示
			}
		});
	}
}