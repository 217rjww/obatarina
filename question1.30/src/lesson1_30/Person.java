package lesson1_30;

class Person {
	String name;                                                           // 問題1:インスタンスフィールドを定義
	int age;                                                               
	double height;
	double weight;                                                         // 問題4:インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセット
	int count = 0;                                                         // countを定義、初期値0

	                                                                       
	public Person(String name, int age, double height, double weight) {    // 問題2:コンストラクタを定義
		this.name = name;                                                  // 問題3:コンストラクタの中で各インスタンスフィールドに値をセット
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;                                                           // インクリメント
	}
	

	public double bmi() {                                                  // 問題6:インスタンスメソッド「bmi」を定義
		return Math.floor(weight / (height * height));                     // 問題7：bmiメソッドでインスタンスのBMIを返す
	}

	public void print() {                                                  // 問題8：インスタンスメソッド「print」を定義
		System.out.println("名前は" + this.name + "です");                   // 問題9:名前、年齢、BMI出力
		System.out.println("年は" + this.age + "才です");              
		System.out.println("BMIは" + this.bmi() + "です");                            
		System.out.println("合計" + count + "人です");                       // 問題10:人数出力
	}
}
