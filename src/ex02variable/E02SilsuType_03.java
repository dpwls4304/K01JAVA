package ex02variable;

public class E02SilsuType_03 {

	public static void main(String[] args) {
		
		long long1 = 10;
		float float1 = 100;
		float result1 = long1 + float1;
		System.out.println("long1 + float1 = " + result1); //110
		
		long result2 = long1 + (long)float1;
		System.out.println("형변환후 연산=" + result2);
		long result3 = (long)(long1 + float1);
		System.out.println("계산후 형변환=" + result3);
		
		float f3 = 100;
		
		float f4 = (float)3.14;
		System.out.println("f4=" + f4);
		
		float f5 = 3.14F;
		System.out.println("f5=" + f5);
		
		float f6 = f3 + f4;
		System.out.println("f6=" + f6);
		
		double d1 = 3.14;
		double d2 = f6 + d1;
		System.out.println("d2=" + d2);
		
		
		
	

	}

}
