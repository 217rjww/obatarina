package lesson1_33;

class Person {
	// インスタンスフィールドの作成
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	public String lastName;

	// コンストラクタを定義
	Person(String firstName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// コンストラクタのオーバーロード
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	// fullNameメソッドの作成       
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// printメソッドの作成
	public void print() {
		// 名前を出力
		System.out.println("名前は" + this.fullName() + "です");
		// 年齢出力
		System.out.println("年は" + this.age + "です");

	}

	// bmiメソッドの作成
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// printCountクラスメソッドの作成
	public static void printCount() {
		// 合計出力
		System.out.println("合計" + Person.count + "人です");
	}
}
