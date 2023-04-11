package lesson1_25;

public class Rand {
	public void Rand() {
		//乱数、繰り返し設定する
		Status st = new Status();
		for (int i = 0; i < 5; i++) { 
			int rand = new java.util.Random().nextInt(1000);
			switch (i) {
			case 0:
				st.setHp(rand);
				System.out.println("HP:" + st.getHp());
				break;
			case 1:
				st.setMp(rand);
				System.out.println("MP:" + st.getMp());
				break;
			case 2:
				st.setPower(rand);
				System.out.println("攻撃力:" + st.getPower());
				break;
			case 3:
				st.setAgility(rand);
				System.out.println("素早さ:" + st.getAgility());
				break;
			case 4:
				st.setDefence(rand);
				System.out.println("防御力:" + st.getDefence());
				break;
			}
		}
	}
}
