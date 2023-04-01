package method;

import java.util.Arrays;
import java.util.Random;

// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。

// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。

// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。

// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。

// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。

// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
//     配列の要素の平均値を返すメソッド（関数）を作成してください。

public class Method {

	public static void main(String[] args) {
		
		//1
		hello();
		//2
		int h = num(3);
		System.out.println(h);
		//3
		int z = calc(3, 5);
		System.out.println(z);
		//4
		double m = calc(1.2, 2.7);
		System.out.println(m);
		//5
		int[] g = result(7);
		System.out.println(Arrays.toString(g));
		//6
		double y = average(9);
		System.out.println(y);

	}

	//1
	public static void hello() {
		System.out.println("Hello java");
	}

	//2
	public static int num(int a) {
		int h = a + 1;
		return h;
	}

	//3
	public static int calc(int b, int c) {
		int z = b + c;
		return z;
	}

	//4
	public static double calc(double d, double e) {
		double m = d * e;
		return m;
	}

	//5
	public static int[] result(int g) {
		int[] num1 = new int[g];
		Random rnd = new Random();
		for (int i = 0; i < g; i++) {
			num1[i] = rnd.nextInt(100);
		}
		return num1;
	}

	//6

	private static double average(int y) {

		int[] num2 = result(y);
		double t = 0;
		for (int a = 0; a < num2.length; a++) {
			t += num2[a];
		}
		System.out.println(Arrays.toString(num2));
		double SumAvg = t / num2.length;

		return SumAvg;
	}
}
		
		
		
		

	