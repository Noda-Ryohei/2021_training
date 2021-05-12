package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	
	public static void main(String[] args) {

		int x = 10;
		int y = 28;
		double z = 3.14;
		
		//練習1
		System.out.println("x * y = " + x * y );
		
		//練習2
		System.out.println("x / y = " +  y / x + ", 余り: " + y % x );
		
		//練習3
		double product = (double) y * z;
		System.out.println("y * z = " + product);
		
		//練習4
		product++;
		System.out.println("インクリメント: " + product);
		
		//練習5
		int myAge = 22;
		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1; //cf. https://uxmilk.jp/47989
		
		if ( myAge > randomNumber) {
			System.out.println("私の方が年上です。");
		} else if( myAge < randomNumber ) {
			System.out.println("私の方が年下です。");
		} else {
			System.out.println("私と同い年です。");
		}
		System.out.println("ちなみに、randomNumber = " + randomNumber + " です。");
		
	}
	
}