//アプリケーション開発
//基本課題0
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

public class Kihon1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1から9878までの11の倍数の和を求める
		int i;
		int n = 9878;
		int wa = 0;
		for (i = 1; i <= n; i++) {
			if (i % 11 == 0) { // 11の倍数の場合
				wa += i;
			}
		}
		System.out.println("1から" + n + "までの11の倍数の和は" + wa + "です．");
	}

}
