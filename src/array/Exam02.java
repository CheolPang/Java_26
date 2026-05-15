package array;

public class Exam02 {
	public static void main(String[] args) {
		int[][] scores = new int[3][2];
		String[] name = {"홍길동", "고소영", "정국"};
		
		scores[0][0]=90;
		scores[0][1]=80;
		scores[1][0]=60;
		scores[1][1]=70;
		scores[2][0]=50;
		scores[2][1]=99;
		
		System.out.println(scores);
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);
		
		// 2차원 배열의 총점과 평균점수 구하기
		for (int i=0; i<scores.length; i++) {
			int sum = 0, avg = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			avg = sum/scores[i].length;
			System.out.printf("%s, 총점=%d, 평균=%d\n", name[i], sum, avg);
		}
	}
}
