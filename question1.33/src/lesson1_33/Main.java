package lesson1_33;

class Main {
	public static void main(String[] args) {
		// personインスタンス化 
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// インスタンスメソッドprintの呼び出し
		person1.print();
		// personインスタンス化
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// インスタンスメソッドprintの呼び出し
		person2.print();
		// クラスメソッドprintCountの呼び出し   
		Person.printCount();
	}
}