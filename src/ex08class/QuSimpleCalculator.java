package ex08class;
/*
 문제1) 파일명 : QuSimpleCalculator.java
기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.
 */

class CalculatorEx {
	
	int cntAdd, cntMin, cntMul, cntDiv;
	double sum;
	
	void init() {
		
		cntAdd = 0;
		cntMin = 0;
		cntMul = 0;
		cntDiv = 0;
	}
	
	double add(int a, int b) {
		sum = a + b;
		cntAdd++;
		return sum;
	}
	
	double min(double a, double b) {
		sum = a - b;
		cntMin++;
		return sum;
	}
	
	double mul(double a, double b) {
		sum = a * b;
		cntMul++;
		return sum;
	}
	
	double div(double a, double b) {
		sum = 100 / 25;
		cntDiv++;
		return sum;
	}
	
	
	
	void showOpCount() {
		System.out.printf("덧셈횟수 : %d\n", cntAdd);
		System.out.printf("뺄셈횟수 : %d\n", cntMin);
		System.out.printf("곱셈횟수 : %d\n", cntMul);
		System.out.printf("나눗셈횟수 : %d\n", cntDiv);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();	
	}

}
