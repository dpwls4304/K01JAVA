package quiz_game;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
		int[] arr = new int[10];//사용자의 입력값을 받을 배열
		int[] arr2 = new int[10];//홀짝 구분할 배열
		int frontCnt=0, backCnt=9;//인덱스 번호를 표현할 변수
		Scanner sc = new Scanner(System.in);//스캐너 클래스
		
		for(int i=1; i<=10; i++) {//1. 입력값을 배열에 저장
			System.out.printf("%d번째 정수를 입력하세요:", i);
			int u = sc.nextInt();
			arr[i-1] = u;
		}
		
		System.out.println("[순서대로 입력된 결과]");
		for(int i=0; i<=9; i++) {//2. 순서대로 결과출력
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i : arr) {//3. 홀짝구분
			if(i%2!=0) {
				arr2[frontCnt] = i;
				frontCnt++;
			}
			else {
				arr2[backCnt] = i;
				backCnt--;
			}
		}
		System.out.println("[홀수/짝수 구분 입력 결과]");
		for(int i=0; i<=9; i++) {//4. 홀짝구분 출력
			System.out.print(arr2[i] + " ");
		}
	}
}
