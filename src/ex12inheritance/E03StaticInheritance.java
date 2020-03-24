package ex12inheritance;

/*
 static(정적) 타입의 멤버도 상속이 되고, 하위클래스에서
 접근할 때는 멤버변수의 이름만으로 접근이 가능하다.
 단,클래스 외부에서 접근시 객체생성없이 클래스명을 통해서도
 접근이 가능하다. 즉 static이 가진 기본적인 규칙을 그대로 따른다. 
 */
class Adder {
	
	public static int val = 0;
	
	/*
	 static으로 선언된 멤버변수는 실제로는 외부(메소드영역)에
	 생성되어있으므로 클래스명을 통한 접근이 허용된다.
	 코드 레벨에서 보면 해당 클래스의 멤버변수이므로 변수명만으로
	 접근하는 것도 가능하다.
	 */
	public void add(int num) {
		val += num;
		Adder.val += num;
	}
}

//자식클래스의  멤버메소드는 모두 실행가능한 코드임.
class AdderFreind extends Adder {
	public void FreindAdd(int num) {
		//동일 멤버변수에 num이 두 번 더해짐
		val += num;
		Adder.val += num;
	}
	public void showVal() {
		//System.out.println("val=" + val);
		System.out.println("val=" + Adder.val);
	}
}

public class E03StaticInheritance {

	public static void main(String[] args) {
		
		Adder ad = new Adder();
		AdderFreind adFreind = new AdderFreind();
		
		ad.add(1); //1+1 = 2
		adFreind.FreindAdd(3);// 3+3 = 6
		Adder.val += 5;
		AdderFreind.val += 7;
		
		adFreind.showVal(); //2+6+5+7의 결과 : 20출력
	}

}
