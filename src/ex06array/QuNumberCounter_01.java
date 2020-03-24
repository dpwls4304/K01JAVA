package ex06array;
/*
 문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];

실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4
 */

public class QuNumberCounter_01 {

	public static void main(String[] args) {
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i: answer) {
			if(i == 1) {
				counter[0] += 1;
				/*
				 숫자가 1이든 3이든 카운트는 한 번만 치면 되니까 +1
				 Q : 풀어서 쓰면 counter[0] = counter[0]+1인데 이해를 못하겠음.
				 counter[0]은 방번호인데 +1이 어케 누적되는 것인가.
				 */
			}
			else if(i == 2) {
				counter[1] += 1;
			}
			else if(i == 3) {
				counter[2] += 1;
			}
			else {
				counter[3] += 1;
			}
			
		}
		System.out.println("counter[0] => " + counter[0]);
		System.out.println("counter[1] => " + counter[1]);
		System.out.println("counter[2] => " + counter[2]);
		System.out.println("counter[3] => " + counter[3]);
	}

}
