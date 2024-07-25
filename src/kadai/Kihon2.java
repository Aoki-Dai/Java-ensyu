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
		// ファイルからテキストデータを読み，文字数を数える
		FileReader fr = new FileReader("kihon2in.txt");// 入力ファイル
		BufferedReader br = new BufferedReader(fr);// バッファリングされた文字ストリーム
		FileWriter fw = new FileWriter("kihon2out.txt");// 出力ファイル
		BufferedWriter bw = new BufferedWriter(fw);// バッファリングされた文字ストリーム
		String s;
		int i = 0;
		// ファイルから1行ずつ読み，文字数を数える
		while ((s = br.readLine()) != null) {// ファイルから1行ずつ読む
			System.out.println("”" + s + "”" + "の文字数は" + s.length() + "です。");// コンソールに出力
			bw.write("”" + s + "”" + "の文字数は" + s.length() + "です。");// 出力ファイルに書く
			bw.newLine();// 改行
			i += 1;// 行数をカウントアップ
		}
		System.out.println("全部で" + i + "行です。");
		bw.write("全部で" + i + "行です。");// 出力ファイルに書く
		bw.newLine(); // 改行
		br.close();// 入力ファイルを閉じる
		bw.close();// 出力ファイルを閉じる
	}
}