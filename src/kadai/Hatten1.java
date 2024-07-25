//アプリケーション開発
//基本課題0
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

public class Hatten1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 1から1000までの3の倍数と3のつく数字の和を求める
		int i;
		int n = 1000;
		int wa = 0;
		for (i = 1; i <= n; i++) {
			// 3の倍数または3のつく数字の場合
			if (i % 3 == 0 || i % 10 == 3 || i / 10 == 3 || i / 100 == 3 || (i / 10) % 10 == 3) {
				wa += i;
			}
		}
		System.out.println("1から" + n + "までの3の倍数と3のつく数字の和は" + wa + "です．");
	}

}