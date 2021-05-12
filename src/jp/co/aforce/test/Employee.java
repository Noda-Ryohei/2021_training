package jp.co.aforce.test;

public class Employee {
	
	//フィールドの定義
	private int id = 0;
	private String name = null;
	private String gender = null;
	private int age = 0;
	
	//コンストラクターの定義
	Employee(int id, String name, String gender, int age){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	void getInfo() {
		System.out.println("番号は " + this.id + "、名前は " + this.name + "、年齢は" + this.age + "歳です。");
	}
	
	//ゲッターメソッドは作ってみたが、結局使わなかった。見通しの甘さ。
	int getId() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	}
	
	String getGender() {
		return this.gender;
	}
	
	int getAge() {
		return this.age;
	}
	
}