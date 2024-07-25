//アプリケーション開発
//基本課題2
//学年組　　3年2組
//学生番号　2212201
//氏名　　　青木　大

package kadai;

import java.io.BufferedReader; // バッファリングされた文字ストリームを利用してテキストファイルから読むためのクラス
import java.io.BufferedWriter;// バッファリングされた文字ストリームを利用してテキストファイルに書くためのクラス
import java.io.FileReader;// ファイルからテキストデータを読むためのクラス
import java.io.FileWriter; // ファイルにテキストデータを書くためのクラス
import java.io.IOException; // 入出力例外を処理するためのクラス

public class Kihon2 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader("kihon2in.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("kihon2out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s;
		int i = 0;
		while ((s = br.readLine()) != null) {
			System.out.println("”" + s + "”" + "の文字数は" + s.length() + "です。");
			bw.write("”" + s + "”" + "の文字数は" + s.length() + "です。");
			bw.newLine();
			i += 1;
		}
		System.out.println("全部で" + i + "行です。");
		bw.write("全部で" + i + "行です。");
		bw.newLine();
		br.close();
		bw.close();
	}
}