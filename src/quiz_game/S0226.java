package quiz_game;

//직사각형을 표현한 클래스
class Rectangle
{
	int[] x = new int[2];
	int area;
	//Rectangle 생성자
	public Rectangle(int ... num) {
		for(int i=0 ; i<num.length ; i++) {
			x[i] = num[i];
		}
		area = x[0] * x[1];
		//area = num[0] * num[1];
	}
	public void ShowAreaInfo() {
		System.out.println("직사각형 면적 : " + area);
	}
     	
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	//Square 생성자
	public Square(int ... x) {
		super(x);
		area = x[0] * x[0];
	}
	public void ShowAreaInfo() {
		System.out.println("정사각형 면적 : " + area);
	} 	
} 
class S0226
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.ShowAreaInfo();

     	Square sqr = new Square(7);
     	sqr.ShowAreaInfo();
 	}
}

