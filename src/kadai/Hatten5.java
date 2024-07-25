//アプリケーション開発
//発展課題5
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Hatten5 {

	private JFrame jf = null;
	private JPanel cp = null;
	private JLabel jlImage = null;
	private ImageIcon playIcon = null;
	private ImageIcon pauseIcon = null;
	private boolean isPlaying = false;

	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(320, 180); // windowサイズ
			jf.setLocationRelativeTo(null); // ウィンドウをディスプレイの中央に表示
			jf.setContentPane(getJContentPane());
			jf.setTitle("発展課題 5");
		}
		return jf;
	}

	// パネル
	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new BorderLayout());// レイアウトマネージャーをBorderLayoutに設定
			cp.add(getJImageLabel(), BorderLayout.CENTER);// 画像を中央に配置
		}
		return cp;
	}

	// 画像
	private JLabel getJImageLabel() {
		if (jlImage == null) {
			jlImage = new JLabel();
			playIcon = new ImageIcon("play.png");
			pauseIcon = new ImageIcon("stop.png");
			jlImage.setIcon(playIcon);// 初期状態は再生ボタン
			jlImage.setHorizontalAlignment(JLabel.CENTER); // 水平方向に中央に配置
			jlImage.setVerticalAlignment(JLabel.CENTER); // 垂直方向に中央に配置

			// マウスクリックイベント
			jlImage.addMouseListener(new MouseAdapter() {
				// マウスクリック時の処理
				public void mouseClicked(MouseEvent e) {
					toggleIcon();// アイコンの切り替え
				}
			});
		}
		return jlImage;
	}

	// アイコンの切り替え
	private void toggleIcon() {
		// 再生中なら停止アイコンに、停止中なら再生アイコンに切り替え
		isPlaying = !isPlaying;
		if (isPlaying) {
			jlImage.setIcon(pauseIcon);
		} else {
			jlImage.setIcon(playIcon);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Hatten5 application = new Hatten5();
				application.getJFrame().setVisible(true);
			}
		});
	}
}
