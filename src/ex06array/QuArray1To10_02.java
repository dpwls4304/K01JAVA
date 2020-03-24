package ex06array;

public class QuArray1To10_02 {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; // index0~9번인 10개의 방을 만들겠다.
		int total = 0; //총합을 담을 변수 초기화
		
		for(int i=0; i<arr.length; i++)
			arr[i]=i+1; //Q : i+1을 arr[i]에 대입하는게 아닌건가?
						//Q : arr[i]에서 i는 방번호(주소값)를 말하는게 맞나?
		System.out.print("int[]arr = {");
		
		for(int i : arr) {
			System.out.print(i);
			total += i; /*Q: total=i가 안되는 이유가 int i는 그냥 숫자를
							나열해 놓은 것 뿐이라서?*/
			if(i<10)
				System.out.print(" ,");
		}
		System.out.print("}");
		System.out.println("\n누적값 = " + total);

	}

}
