package lesson1_32;

class Person {                  
	public String name;                                                          // インスタンス変数の作成
	public int age;
	public double height;
	public double weight;
	public static int count = 0;                                                 // クラスフィールド「count」を定義

	Person(String name, int age, double height, double weight) {                 // コンストラクタを定義
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count+=1;                                                                // countプラス1でPersonオブジェクトの数をカウント
	}

	public double bmi() {                                                        // bmiメソッドの作成
		return this.weight / this.height / this.height;
	}
	
	public static void printCount() {                                            // printCountメソッドを定義
		System.out.println("合計"+count+"人です。");                               // countを使って合計
	}

	public void print() {                                                        // printメソッドの作成
		System.out.println("名前は" + this.name + "です");                         // 名前出力
		System.out.println("年は" + this.age + "です");                            // 年齢出力
	}
}
