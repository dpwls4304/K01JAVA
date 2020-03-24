package ex10accessModifier.sub;

class DefualtClass2 {
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc() 메소드 호출");
	}
}

public class E01AccessModifier2 {
	
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMeThod() 메소드 호출");
	}
	
	void defaultMethod() {
		privateVar = 500;
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	public void publicMethod() {
		privateVar = 600;
		System.out.println("publicMeThod() 메소드 호출");
		privateMethod();

	}
	
}
