//アプリケーション開発
//発展課題2
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

public class Hatten2 {

	public static void main(String[] args) {
		double data[] = { 0.34, 0.61, 0.22, 0.95, 0.11, 0.75, 0.83, 0.55, 0.05, 0.45, };

		// 横軸の表示 1行目
		for (int j = 0; j <= 40; j += 10) { // 50個のアスタリスクに対応するため、0から50まで10刻み
			System.out.printf("%-10d", j * 2); // 10文字分のスペースを確保して表示
		}
		System.out.print(100 + "%");
		System.out.println();//改行

		//2行目
		System.out.printf("|");
		for (int j = 1; j <= 50; j++) { // 50個のアスタリスクに対応するため、0から50まで1刻み
			if (j % 10 == 0) {
				System.out.print("+"); // 10の倍数の位置には"+"
			} else {
				System.out.print("-"); // それ以外の位置には"-"
			}
		}
		System.out.println();

		//data.lengthにすることでデータの個数が変わっても動作する
		for (int i = 0; i < data.length; i++) {
			int percentage = (int) (data[i] * 100); //100倍して%表記にし,整数型に変更
			int stars = percentage / 2; // 100% が 50個のアスタリスクに対応するため2で割る

			System.out.printf("|");

			//percentageの半分ぶんアスタリスクを配置
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.printf(" %3.2f", data[i]);
			System.out.println();
		}
	}

}