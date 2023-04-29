package question31;

public class Main {
	public static void main(String[] args) {
		// personオブジェクトの作成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// Carオブジェクトの作成
		Car car     = new Car();
		// Bicycleオブジェクトの作成
		Bicycle bcl = new Bicycle();

		// carの所有者をperson1のfullNameへ設定
		car.setOwner(person1.fullName());
		// bclの所有者をperson2のfullNameへ設定
		bcl.setOwner(person2.fullName());

		// carの所有者を取得し、コンソールに出力
		System.out.println(car.getOwner());
		// bclの所有者を取得し、コンソールに出力
		System.out.println(bcl.getOwner());

		// buyメソッドを使ってcarを購入
		person1.buy(car);
		// buyメソッドを使ってbclを購入
		person2.buy(bcl);
	}
}
