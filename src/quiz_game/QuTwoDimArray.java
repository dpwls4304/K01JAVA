package quiz_game;

class QuTwoDimArray
{
	//문제에서 제시한 내용
	public static void addOneArr(int[] arr, int add)
	{
		//가로에 대한 반복
		for(int i=0; i<arr.length; i++){	
			arr[i] += add;
		}
	}
	//addOneArr() 메소드를 기반으로 2차원 배열을 증가시키는 메소드
	public static void addTwoArr(int[][] arr, int add)
	{
		for(int y=0; y<arr.length; y++) {//세로가3인
			for(int x=0; x<arr[y].length; x++) {
				arr[y][x] += add;
			}
		}
	}
	
	public static void main(String[] args){	
		
		//int[][] arr2 = new int[3][4];
		//배열선언
		int[][] arr = {
			{1, 2, 3, 4},
			{5, 6, 7},
			{8, 9}
		};
		//값 증가전 출력
		System.out.println("[값 증가전 출력]");
		arrPrint(arr);
		System.out.println();
		//2만큼 증가시키는 메소드 호출
		addTwoArr(arr, 2);
		//증가후 출력
		System.out.println("[값 2씩 증가후 출력]");
		arrPrint(arr);
	}
	
	//2차원 배열을 출력하기 위한 메소드
	static void arrPrint(int[][] arr) {
		
		for(int y=0; y<arr.length; y++) {//세로가3인
			System.out.print("{");
			for(int x=0; x<arr[y].length; x++) {
				System.out.print(arr[y][x]);
				if(x<arr[y].length-1) {
					System.out.print(", ");
				}
			}
			System.out.print("}");
			System.out.println();
		}
	}
}