package jp.co.aforce.test;

import java.util.HashMap;
import java.util.HashSet;

public class PracticeTest3 {
	public static void main(String[] args) {
		
		//練習1
		String[] tanaka = {"1", "田中太郎", "male", "27"};
		
		//練習2
		System.out.println(tanaka[1]);
		
		//練習3 →他ファイル
		
		//練習4
		//インスタンスの生成
		Employee employee1 = new Employee(1, "田中太郎", "Male", 27);
		Employee employee2 = new Employee(2, "佐藤花子", "Female", 22);
		Employee employee3 = new Employee(3, "鈴木次郎", "Male", 31);
		
		//コレクションの作成と要素の追加
		HashSet<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		//要素ごとに処理を実行
		for (Employee employee : employees) {
			employee.getInfo();
		}
		
		
		
		//練習5
		HashMap<String, Integer> scores = new HashMap<>(); //intは不可。
		scores.put("国語", 90);
		scores.put("数学", 80);
		scores.put("英語", 65);
		
		for ( HashMap.Entry<String, Integer> entry : scores.entrySet() ) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		} //cf. https://www.sejuku.net/blog/15767
		
		
		//練習6
		//科目名とその点数とを、それぞれ紐づいた組として管理したい。
		//ここでは、要素をキーと値との組み合わせで管理するマップを使用するのが適当だと考えた。
		
	
	}
	
}