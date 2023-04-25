package lesson1_33;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);                 // personインスタンス化  
		person1.print();                                                         // インスタンスメソッドprintの呼び出し

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);                 // personインスタンス化
		person2.print();                                                         // インスタンスメソッドprintの呼び出し

		Person.printCount();                                                     // クラスメソッドprintCountの呼び出し                        
	}
}