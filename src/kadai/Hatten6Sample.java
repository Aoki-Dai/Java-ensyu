package kadai;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Hatten6Sample {

	private JFrame jf = null;
	private JPanel cp = null;
	private int xStart = 0, yStart = 0;

	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(640, 480);
			jf.setLocationRelativeTo(null);
			jf.setContentPane(getJContentPane());
			jf.setTitle("発展課題6サンプル");
		}
		return jf;
	}

	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.addMouseListener(new MyMouseAdapter());// マウスリスナーを登録
		}
		return cp;
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			int xEnd, yEnd;
			// コンテントペーンのグラフィックオブジェクトを取得
			Graphics g = cp.getGraphics();
			xEnd = e.getX();// マウスのX座標を取得
			yEnd = e.getY();// マウスのY座標を取得
			// (xStart, yStart)と(xEnd, yEnd)の2点間に直線を引く
			g.drawLine(xStart, yStart, xEnd, yEnd);
			xStart = xEnd;// 次の直線の始点(x)を設定
			yStart = yEnd;// 次の直線の始点(y)を設定
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Hatten6Sample application = new Hatten6Sample();
				application.getJFrame().setVisible(true);
			}
		});
	}
}
