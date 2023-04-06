package execution;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import food.Food;

public class Execution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//こんにちは！ここは日本です
		Food f = new Food("日本", "寿司", "和食");
		System.out.println("こんにちは!ここは" + f.country + "です!");

		//この寿司はうまい
		System.out.println("この" + f.foodName + "はうまい");

		//寿司は和食です
		System.out.println(f.foodName + "は" + f.foodType + "です");

		//現在時刻表示
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("今の現在日時は" + timeStamp + "です");

	}

}
