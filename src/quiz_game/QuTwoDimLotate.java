package quiz_game;

public class QuTwoDimLotate {
	
	public static void showArr(int arr[][]) {
//		for(int y=0; y<arr.length; y++) {
//			for(int x=0; x<arr[y].length; x++) {
//				System.out.print(arr[y][x] + " ");
//			}
//			System.out.println();
//		}
		for(int[] y : arr) {
			for(int x : y) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
	public static void changeArr(int arr[][]) {
		int[] temp;
		temp = arr[1];
		arr[1] = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		
		for(int[] y : arr) {
			for(int x : y) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		//int[][] arr2 = new int[3][3];
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println("[변경전 출력]");
		showArr(arr);
		
		System.out.println("[변경후 출력]");
		changeArr(arr);

	}

}
