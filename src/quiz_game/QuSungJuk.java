package quiz_game;

import java.util.Scanner;

public class QuSungJuk {
	
	public static int score(int k, int e, int m) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력:");
		k = sc.nextInt();
		System.out.print("영어점수 입력:");
		e = sc.nextInt();
		System.out.print("수학점수 입력:");
		m = sc.nextInt();
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int userSt, userSco;
		int kor=0, eng=0, math=0;
		int idx;
		
		//1. 학생수를 사용자로부터 입력받는다.(Scanner클래스 사용)
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요:");
		userSt = sc.nextInt();
		
		//2. 입력받은 학생수만큼 점수를 저장할 수 있는 int형 배열을 선언한다.(2차원)
		int[][] arr = new int [userSt][3];
		
		/*3. 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2번에서 생성한 배열에 저장한다.
		Scanner클래스 사용
		*/
		for(int y=0; y<arr.length; y++) {
			System.out.printf("[%d번째 학생의 점수 입력]\n", (y+1));
			for(int x=0; x<arr[y].length; x++) {
				arr[y][x] = score(kor, eng, math);
			}
			
		}
		
	}

}
