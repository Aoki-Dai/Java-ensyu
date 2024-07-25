//アプリケーション開発
//発展課題4(リファクタリング版)
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

public class Hatten41 {

    private JFrame jf = null;
    private JPanel cp = null;
    private JPanel jpLabel = null;
    private JPanel jpButton = null;
    private JLabel jl = null;
    private JButton jb = null;
    private JButton jb10 = null;
    private JButton jb100 = null;
    private JButton jbReset = null;
    private int i = 2;

    // JFrameを取得するメソッド
    private JFrame getJFrame() {
        if (jf == null) {
            jf = new JFrame();
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setSize(640, 240); // ウィンドウサイズ
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
            cp.add(getLabelPanel());
            cp.add(getButtonPanel());
        }
        return cp;
    }

    // ラベルパネルを取得するメソッド
    private JPanel getLabelPanel() {
        if (jpLabel == null) {
            jpLabel = new JPanel();
            jpLabel.setLayout(new GridLayout(1, 1));
            jpLabel.add(getJLabel());
        }
        return jpLabel;
    }

    // ボタンパネルを取得するメソッド
    private JPanel getButtonPanel() {
        if (jpButton == null) {
            jpButton = new JPanel();
            jpButton.setLayout(new GridLayout(1, 4));
            jpButton.add(getJButton());
            jpButton.add(getJButton10());
            jpButton.add(getJButton100());
            jpButton.add(getJButtonReset());
        }
        return jpButton;
    }

    // ラベルを取得するメソッド
    private JLabel getJLabel() {
        if (jl == null) {
            jl = new JLabel();
            jl.setText("2 は素数です");
        }
        return jl;
    }

    // +1ボタンを取得するメソッド
    private JButton getJButton() {
        if (jb == null) {
            jb = new JButton();
            jb.setText("+1ボタン");
            jb.addActionListener(new MyActionListener(1));
        }
        return jb;
    }

    // +10ボタンを取得するメソッド
    private JButton getJButton10() {
        if (jb10 == null) {
            jb10 = new JButton();
            jb10.setText("+10ボタン");
            jb10.addActionListener(new MyActionListener(10));
        }
        return jb10;
    }

    // +100ボタンを取得するメソッド
    private JButton getJButton100() {
        if (jb100 == null) {
            jb100 = new JButton();
            jb100.setText("+100ボタン");
            jb100.addActionListener(new MyActionListener(100));
        }
        return jb100;
    }

    // リセットボタンを取得するメソッド
    private JButton getJButtonReset() {
        if (jbReset == null) {
            jbReset = new JButton();
            jbReset.setText("リセットボタン");
            jbReset.addActionListener(new MyActionListener(2, true));
        }
        return jbReset;
    }

    // ラベルを更新するメソッド
    private void updateLabel() {
        jl.setText(factorize(i));
    }

    // 素数判定メソッド
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int j = 3; j <= Math.sqrt(num); j += 2) {
            if (num % j == 0) return false;
        }
        return true;
    }

    // 素因数分解メソッド
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

    // 汎用アクションリスナー
    class MyActionListener implements ActionListener {
        private int increment;
        private boolean reset;

        MyActionListener(int increment) {
            this.increment = increment;
            this.reset = false;
        }

        MyActionListener(int increment, boolean reset) {
            this.increment = increment;
            this.reset = reset;
        }

        public void actionPerformed(ActionEvent e) {
            if (reset) {
                i = increment; // リセット
            } else {
                i += increment; // インクリメント
            }
            updateLabel(); // ラベルを更新
        }
    }

    // メインメソッド
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Hatten41 application = new Hatten41();
            application.getJFrame().setVisible(true);
        });
    }
}
