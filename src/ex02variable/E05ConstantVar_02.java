package ex02variable;

public class E05ConstantVar_02 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		System.out.println("PI(원주율)=" + PI);
		
		final String NICK_NAME = "코스모61기";
		System.out.println("우리는 " + NICK_NAME);
		
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		int computer = 1, user = 3;
		System.out.println("컴퓨터가 이겼습니다.");
		
		computer = SCISSOR;
		user = PAPER;
		System.out.println("Computer Win");
		
		

	}

}
