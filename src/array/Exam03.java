package array;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		// 가변 배열: 불규칙적인 배열형태 
		int[][] data = new int[3][];
		data[0] = new int[] {1};
		data[1] = new int[] {2,3,4};
		data[2] = new int[] {5,6};
		System.out.println(Arrays.toString(data));
	
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		
		//가변 배열에 데이터를 재할당
		data = new int[][] {
			{10, 100},
			{10, 200},
			{20, 30}
		};
		System.out.println("=====================");
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}

}
