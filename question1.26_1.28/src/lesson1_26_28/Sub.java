package lesson1_26_28;

import java.util.Scanner;

public class Sub {
	public void animalprint() {
		Scanner sc1 = new Scanner(System.in); //スキャナーを作成
		String anm = sc1.nextLine();
		String[] animals = anm.split(",");//splitでコンマごとに分割させる
		String name[] = new String[animals.length]; //nameの配列を作成
		double meter[] = new double[animals.length];//meterの配列を作成
		int km[] = new int[animals.length];//kmの配列を作成

		for (int i = 0; i < animals.length; i++) { //for文で繰り返し出るようにする
			String[] anima = animals[i].split(":");//splitで：ごとに分割
			name[i] = anima[0];
			meter[i] = Double.valueOf(anima[1]);//double型に変換
			km[i] = Integer.valueOf(anima[2]);//int型に変換
			Sub2 sub2 = new Sub2();//sub2 インスタンス化
			sub2.setName(name[i]); //name をセットする
			sub2.setMeter(meter[i]); //meter をセットする
			sub2.setKm(km[i]); //km をセットする
			System.out.println("動物名:" + sub2.getName()); //動物名を出力
			System.out.println("体長:" + sub2.getMeter() + "m"); //体長を出力
			System.out.println("速度:" + sub2.getKm() + "km/h");//速度を出力

			//switch構文で名前によって学名を表示
			switch (name[i]) {
			case "ライオン":
				System.out.println("学名：パンテラ レオ");
				break;
			case "ゾウ":
				System.out.println("学名：ロキソドンタ・サイクロティス");
				break;
			case "パンダ":
				System.out.println("学名：アイルロポダ・メラノレウカ");
				break;
			case "チンパンジー":
				System.out.println("学名：パン・トゥログロディテス");
				break;
			case "シマウマ":
				System.out.println("学名：チャップマンシマウマ");
				break;
			case "インコ":
				System.out.println("学名：不明");
				break;
			}
			System.out.println(); //コンソールに改行を出力
		}
	}
}

	
