package lesson1_32;

class Main {
	public static void main(String[] argos) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);          // person1インスタンス作成
		person1.print();                                              // printメソッドの呼び出し

		Person person2 = new Person("山田花子", 22, 1.5, 40);          // person2インスタンス化
		person2.print();                                              // printメソッドの呼び出し
		
		System.out.println("合計"+Person.count+"人です。");             // Personオブジェクトの合計数を取得し、合計の出力
		Person.printCount();                                          // PersonクラスのprintCountの呼び出し
	}
}
