package jp.co.aforce.test;

public class PracticeTest1 {
	
	public static void main(String[] args) {
		
		//練習問題1
		final double TAX = 0.1;
		System.out.println(TAX);
		
		//練習問題2
		int x = 480;
		// int型変数xをdouble型に変換して計算したのち、結果を四捨五入してint型に変換し、int型変数priceに代入。
		int price = (int) ( Math.round( (double) x * ( 1 + TAX ) ) ); 
		System.out.println("この商品の値段は " + price + "円です。");
		
		//練習3
		String name = "Ryohei NODA";
		System.out.println(name);
		
	}
	
}