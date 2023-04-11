package lesson1_26_28;

public class Sub2 {
	
	private String name;
	private double meter;
	private int km;
	
	String getName() { //nameのgetter メソッドの作成
		return this.name;
	}

	public void setName(String name) {//nameのsetterメソッドの作成
		this.name = name;
	}
	
	double getMeter() {  //meterのgetter メソッドの作成
		return this.meter;
	}

	public void setMeter(double meter) { //meterのsetter メソッドの作成
		this.meter = meter;
	}
	
	int getKm() { //kmのgetter メソッドの作成
		return this.km;
	}

	public void setKm(int km) { //kmのsetter メソッドの作成
		this.km = km;
	}

	

}
