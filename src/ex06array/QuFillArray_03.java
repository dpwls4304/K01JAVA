package ex06array;
/*
 문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

출력예시) 총 10개의 정수를 입력하시오.
1 2 3 4 5 6 7 8 9 10

순서대로입력된결과: 1 2 3 4 5 6 7 8 9 10
홀수/짝수 구분입력결과 : 1 3 5 7 9 10 8 6 4 2
 */
public class QuFillArray_03 {

	public static void main(String[] args) {
		
		int[]arr = new int[10];
		int[]sit = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.print("순서대로입력된결과 : ");
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n홀수/짝수 구분입력결과 : ");
		int t=9;
		int u=0;
		for(int j: arr) {
			if(j%2 == 0) {
				sit[t] = j;
				t--;
			}
			else {
					sit[u] = j;
					u++;
			}
		}//end for
		for(int m=0 ; m<10 ; m++)
			System.out.printf("%d ",sit[m]);

	}

}
