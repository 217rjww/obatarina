package lesson1_25;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Status status = new Status(); //statusのインスタンス化
		Scanner sc1 = new Scanner(System.in);// スキャナーの作成
		String name = sc1.nextLine();
		status.setName(name); //nameをセット
		Rand rd = new Rand(); //　randのインスタンス化
		System.out.println("こんにちは「" + status.getName() + "」さん"); //名前をコンソールに出力
		System.out.println("ステータス");
		rd.Rand();// randメソッドの呼び出し
		System.out.println(); //改行の出力
		System.out.println("さあ冒険に出かけよう!");

	}

}

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/