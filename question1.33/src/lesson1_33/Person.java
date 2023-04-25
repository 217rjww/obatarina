package lesson1_33;

class Person {
	public static int count = 0;                                                          // インスタンスフィールドの作成
	public String firstName;
	public int age;
	public double height, weight;
	public String lastName;

	Person(String firstName, int age, double height, double weight) {                     // コンストラクタを定義
		Person.count++;
		this.firstName = firstName;                 
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	Person(String firstName,String lastName, int age, double height, double weight){     // コンストラクタのオーバーロード
		Person.count++; 
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	
	}
	
	public String fullName() {                                                            // fullNameメソッドの作成                             
		return this.firstName + this.lastName;
	}

	public void print() {                                                                 // printメソッドの作成
		System.out.println("名前は" + this.fullName() + "です");                            // 名前を出力
		System.out.println("年は" + this.age + "です");                                    // 年齢出力
	}

	public double bmi() {                                                                 // bmiメソッドの作成
		return this.weight / this.height / this.height;
	}

	public static void printCount() {                                                     // printCountクラスメソッドの作成
		System.out.println("合計" + Person.count + "人です");
	}
}
