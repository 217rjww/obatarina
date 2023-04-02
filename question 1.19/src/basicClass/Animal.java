package basicClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Animal {
	

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog d = new Dog("犬");
		System.out.println(d.dogName);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog d2 = new Dog(40);
		System.out.println(d2.dogNum);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		 String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		 System.out.println(timeStamp);
	}
}