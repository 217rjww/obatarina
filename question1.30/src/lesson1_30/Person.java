package lesson1_30;

class Person {
	String name;                                                           // インスタンスフィールドを定義
	int age;                                                               
	double height;
	double weight;                                                        
	int count = 0;                                                         // countを定義、初期値0

	                                                                       
	public Person(String name, int age, double height, double weight) {    // コンストラクタを定義
		this.name = name;                                                  
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;                                                           // countをインクリメント
	}
	

	public double bmi() {                                                  // bmiメソッドを定義
		return Math.floor(weight / (height * height));                     // Math.floorメソッドを使用して小数点以下を切り捨てBMI値を返す
		                                                                   
	}

	public void print() {                                                  // インスタンスメソッド「print」を定義
		System.out.println("名前は" + this.name + "です");                   // 名前、年齢、BMI出力
		System.out.println("年は" + this.age + "才です");              
		System.out.println("BMIは" + this.bmi() + "です");                            
		System.out.println("合計" + count + "人です");                       // 人数出力
	}
}
