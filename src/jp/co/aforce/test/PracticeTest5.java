package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {
	
	public static void main(String[] args) {
		
		//練習1
		Random rand = new Random();
		int fortune = rand.nextInt(5) + 1; //cf. https://uxmilk.jp/47989 
		switch(fortune) {
		case 1:
			System.out.println("吉です。");
			break;
		case 2:
			System.out.println("中吉です。");
			break;
		case 3:
			System.out.println("大吉です。");
			break;
		default:
			System.out.println("凶です。");
			break;
		}
		
		//練習2
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			
			if( i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
			
		}
		System.out.println("1以上100以下の7の倍数の合計は " + sum + " です。");
		
		
		//練習3   なんとなく不格好。
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				
				if( j == 9 ) {
					
					if(i*j < 10) {
						System.out.println(" " + i*j);
					} else {
						System.out.println(i*j);
					}
					
				} else if(i*j < 10) {
					
					System.out.print(" " + i*j + " ");
					
				} else {
					
					System.out.print(i*j + " ");
					
				}
				
			}
			
		}
		
	}
	
}