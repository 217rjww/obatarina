package lesson1_29_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prefecture {                                                               // Prefectureクラスの定義

	public void Prefecture() {                                                          // Prefectureクラスのコンストラクタを定義
		ArrayList<String> prefectures = new ArrayList<>();                              // リスト化する
		   prefectures.add("北海道:札幌市:83424");                                        // 0
		   prefectures.add("青森県:青森市:9646");                                         // 1
		   prefectures.add("岩手県:盛岡市:15275");                                        // 2
		   prefectures.add("宮城県:仙台市:7282");                                         // 3
		   prefectures.add("秋田県:秋田市:11638");                                        // 4
		   prefectures.add("山形県:山形市:9323");                                         // 5
		   prefectures.add("福島県:福島市:13784");                                        // 6
		   prefectures.add("茨城県:水戸市:6097");                                         // 7
		   prefectures.add("栃木県:宇都宮市:6408");                                       // 8
		   prefectures.add("群馬県:前橋市:6362");                                         // 9
		   prefectures.add("埼玉県:さいたま市:3798");                                      // 10
		
	
			System.out.println("表示したい都道府県番号をコンマ区切りで入力してください：");       // コンソール出力
			Scanner sc1 = new Scanner(System.in);                                       // スキャナー作成　
			String pre  = sc1.nextLine();                                               // 入力した文字をpreに格納
			System.out.println("昇順または降順を選択してください (1: 昇順, 2: 降順)：");       // コンソール出力 
			int num     = sc1.nextInt();                                                // 入力した整数をnumに格納 
			String[] prefecture = pre.split(",");                                       // 文字列preをコンマでスプリットさせる
			Sub sub     = new Sub();                                                    // subのインスタンス化作成
			if  (num == 1) {                                                            // if文でn==1の時に昇順に並び替え
				Arrays.sort(prefecture);                                                
			} else if (num == 2) { 														// if文でn==2の時に降順に並び替え
				Arrays.sort(prefecture, Collections.reverseOrder()); 
			}
			for (int n = 0; n < prefecture.length; n++) {                               // for文でprefectureの配列をループ
				int m         = Integer.valueOf(prefecture[n]);                         // prefecture[n]の要素をmに代入
				String prefe  = prefectures.get(m);                                     // mを使用しprefecturesリストから都道府県を取得prefeに代入
				String[] pref = prefe.split(":");                                       // 取得した都道府県名を : 区切りで分割しprefに代入

				for (int w = 0; w < pref.length; w++) {                                 // 繰り返しの表示
					sub.setName(pref[w]);                                               // nameをset
					sub.setCapital(pref[++w]);											// capitalのセット
					sub.setArea(Integer.parseInt(pref[++w]));                           // areaをStringからint型に変えてAreaをセット
					System.out.println("都道府県名：" + sub.getName());                   // 都道府県のコンソール出力
					System.out.println("県庁所在地：" + sub.getCapital());                // 県庁所在地のコンソール出力
					System.out.println("面積:" + sub.getArea() + "km2");                 // 面積のコンソール出力
					System.out.println();                                               // 改行コンソール出力
				}
			}
		}
	}






















