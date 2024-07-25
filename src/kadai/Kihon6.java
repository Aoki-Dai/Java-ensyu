// アプリケーション開発
// 基本課題6
// 学年組　　3年2組
// 学生番号　2212201
// 氏名　　　青木　大

package kadai;

import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Kihon6 {

	private JFrame jf = null;
	private JPanel cp = null;
	private JPanel jpGet = null;
	private JPanel jpButton = null;
	private JPanel jpLabel1 = null;
	private JPanel jpLabel2 = null;
	private JLabel jlDisplay = null;
	private JLabel jl1 = null;
	private JLabel jl2 = null;
	private JButton jb = null;
	private Point dragStartPoint = null;

	// フレーム
	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(480, 360);
			jf.setLocationRelativeTo(null);
			jf.setContentPane(getJContentPane());
			jf.setTitle("基本課題6");
		}
		return jf;
	}

	// パネル
	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new GridLayout(2, 1));
			cp.add(getJPanel());
			cp.add(getJLabelDisplay());
		}
		return cp;
	}

	// 上段
	private JPanel getJPanel() {
		if (jpGet == null) {
			jpGet = new JPanel();
			jpGet.setLayout(new GridLayout(1, 3));
			cp.add(getJPanelButton());
			cp.add(getJPanelLabel1());
			cp.add(getJPanelLabel2());
		}
		return jpGet;
	}

	// ボタン
	private JPanel getJPanelButton() {
		if (jpButton == null) {
			jpButton = new JPanel();
			jpButton.setLayout(new GridLayout(1, 1));
			jpButton.add(getJButton());
		}
		return jpButton;
	}

	private JPanel getJPanelLabel1() {
		if (jpLabel1 == null) {
			jpLabel1 = new JPanel();
			jpLabel1.setLayout(new GridLayout(1, 1));
			jpLabel1.add(getJLabel1());
		}
		return jpLabel1;
	}

	private JPanel getJPanelLabel2() {
		if (jpLabel2 == null) {
			jpLabel2 = new JPanel();
			jpLabel2.setLayout(new GridLayout(1, 1));
			jpLabel2.add(getJLabel2());
		}
		return jpLabel2;
	}

	private JLabel getJLabelDisplay() {
		if (jlDisplay == null) {
			jlDisplay = new JLabel();
			jlDisplay.setHorizontalAlignment(SwingUtilities.CENTER);
			jlDisplay.setText("");
		}
		return jlDisplay;
	}

	private JLabel getJLabel1() {
		if (jl1 == null) {
			jl1 = new JLabel("ラベル1");
			jl1.setHorizontalAlignment(SwingUtilities.CENTER);
			jl1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					jlDisplay.setText("MOUSE_PRESSED");
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					jlDisplay.setText("MOUSE_RELEASED");
				}
			});
		}
		return jl1;
	}

	private JLabel getJLabel2() {
		if (jl2 == null) {
			jl2 = new JLabel("ラベル2");
			jl2.setHorizontalAlignment(SwingUtilities.CENTER);

			jl2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					dragStartPoint = e.getPoint(); // ドラッグ開始座標を記録
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					dragStartPoint = null; // ドラッグ終了時に開始座標をリセット
				}

				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2) {
						jlDisplay.setText("MOUSE_DOUBLE_CLICKED");
					} else {
						jlDisplay.setText("MOUSE_CLICKED");
					}
				}
			});

			jl2.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					int x = e.getX();
					int y = e.getY();
					jlDisplay.setText("MOUSE_MOVED: " + x + "," + y);
				}

				@Override
				public void mouseDragged(MouseEvent e) {
					if (dragStartPoint != null) {
						jlDisplay.setText("MOUSE_DRAGGED: (" + dragStartPoint.x + "," + dragStartPoint.y + ")-("
								+ e.getX() + "," + e.getY() + ")");
					}
				}
			});

		}
		return jl2;
	}

	private JButton getJButton() {
		if (jb == null) {
			jb = new JButton("ボタン");
			jb.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					jlDisplay.setText("MOUSE_ENTERED");
				}

				@Override
				public void mouseExited(MouseEvent e) {
					jlDisplay.setText("MOUSE_EXITED");
				}
			});
		}
		return jb;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon6 application = new Kihon6();
				application.getJFrame().setVisible(true);
			}
		});
	}
}