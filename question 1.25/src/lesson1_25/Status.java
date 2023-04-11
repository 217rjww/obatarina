package lesson1_25;

public class Status {

	private String name;
	private int hp;
	private int mp;
	private int power;
	private int agility;
	private int defence;

	
	//getter setterメソッドの作成
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;

	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAgility() {
		return this.agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getDefence() {
		return this.defence;

	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	
}