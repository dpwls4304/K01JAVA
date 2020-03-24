package ex02variable;

/*
 문제3] 파일명 : Qu_03.java
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면애의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14 
 */

public class Qu_03_02 {

	public static void main(String[] args) {
		
		final double DI = 3.14;
		int cc = 10;
		double area = (cc*cc*DI);
		
		System.out.println("int형 : " + (int)area);
		System.out.println("float형 : " + (float)area);
		System.out.println("double형 : " + area);
		
	}

}
