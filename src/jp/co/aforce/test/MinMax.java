package jp.co.aforce.test;

public class MinMax {
	
	int getMaxValue(int x, int y, int z) {
		int max;
		
		//max = x > y ? x : y;
		//max = max > z ? max : z;
		
		if( x > y ) {
			max = x;
		} else {
			max = y;
		}
		if( z > max ) {
			max = z;
		}
		return max;
	}
	
	int getMinValue(int x, int y, int z) {
		int min;
		
		min = x < y ? x : y;
		min = min < z ? min : z;
		
		//解答略(三項演算子は広義のif文！！！？)
		
		return min;
	}

}
