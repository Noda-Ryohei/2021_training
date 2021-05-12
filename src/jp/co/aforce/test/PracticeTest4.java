package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {
	
	public static void main(String[] args) {
		
		//練習1
		//確認
		String str1 = "abc";
		String str2 = "ab";
		str2 = str2 + "c";
		boolean resultA = str1 == str2;
		boolean resultB = str1.equals(str2);
		System.out.println(resultA); //false
		System.out.println(resultB); //true
		
		/* 
		equalsメソッドで比較するのが適切だと考える。
		基本型どうしを "==" で比較したときは、値が正しいかどうかで真偽が決まる。
		一方で、参照型のString型を "==" で比較した場合は、その参照しているオブジェクトが一致しているかどうかで真偽が決まる。
		すなわち、上の例のように、文字列としては等しい値を格納していても、参照しているオブジェクトが異なれば false となる。
		コーディングした側の意図としては、中に入っている値が等しいかどうかを比較しようとした、と考えるのが妥当であるから、
		ここではStringクラスで用意されているequalsメソッドで比較するのが適切であると考えられる。
		参考サイト： https://www.javadrive.jp/start/string/index4.html
		*/
		
		//練習2
		ArrayList<String> animals = new ArrayList<>();
		animals.add("いぬ");
		animals.add("ねこ");
		animals.add("うさぎ");
		animals.add("へび");
		
		//練習3
		String favorite = "ねこ";
		if ( animals.contains(favorite) ) {
			System.out.println(favorite + " はリストに含まれています。");
		} else {
			System.out.println(favorite + " はリストに含まれていません。");
		}
		
		//練習4
		int myBirthMonth = 8;
		String holiday = null;
		switch(myBirthMonth) {
		case 1:
			holiday = "元日, 成人の日";
			break;
		case 2:
			holiday = "建国記念の日, 天皇誕生日";
			break;
		case 3:
			holiday = "春分の日";
			break;
		case 4:
			holiday = "昭和の日h";
			break;
		case 5:
			holiday = "憲法記念日, みどりの日, こどもの日";
			break;
		case 6: 
			holiday = "なし";
			break;
		case 7:
			holiday = "海の日, スポーツの日";
			break;
		case 8:
			holiday = "山の日";
			break;
		case 9:
			holiday = "敬老の日, 秋分の日";
			break;
		case 10:
			holiday = "なし";
			break;
		case 11:
			holiday = "文化の日, 勤労感謝の日";
			break;
		case 12:
			holiday = "なし";
			break;
		default:
			break;
		}
		System.out.println("あなたの誕生月にある祝日は、" + holiday +"です。");
		
		//switch文を選んだ理由
		//if文では分岐ごとに else if(myBirthMonth==値){ ~~~; } という条件文を書かなければならない一方で、
		//switch文では、case 値: ~~~; bleak; と比較的簡潔に書けるから。
		
	}
	
}