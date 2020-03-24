package ex02variable;

/*
 문제1] 파일명 : Qu_01.java
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
 */
public class Qu_01 {

	public static void main(String[] args) {
		
		int kor = 89, eng = 99, math = 78;
		System.out.println("국어점수:" + kor + "점" 
					   + ", 영어점수:" + eng + "점" 
					   + ", 수학점수:" + math + "점");
		
		int result1 = (kor + eng + math);
		
		System.out.println("3과목의 총점은:" + result1);
	
	}

}
