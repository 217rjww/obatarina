package lion;

import profile.Profile;

public class Lion {
	
	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.setName("ライオン");
		profile.setWeight(2.1);
		profile.setSpeed(80);
		

		System.out.println("動物名:"+profile.getName());
		System.out.println("体重:"+profile.getWeight()+"m");
		System.out.println("速度:"+profile.getSpeed()+"km/h");
	}


}

/*

下記がコンソールに出力されるように作成してください
※thisとsetterとgetterとフィールドを使ってください

動物名：ライオン
体長：2.1m
速度：80km/h

*/