package question31;

public class Person {
	// インスタンスフィールド
	int age;
	double height;
	double weight;
	int count = 0;
	private String firstName;
	private String lastName;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.age       = age;
		this.height    = height;
		this.weight    = weight;
		count++;
	}
	// bmiメソッドの作成
	public double bmi() {
		return this.weight / (height * height);
	}
	// fullNameメソッドの作成
	public String fullName() {
		return this.firstName + this.lastName;
	}
	// buyメソッドの作成
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");

	}
	// buyメソッドの作成
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");

	}

}
