package main;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 	abstract class : 일반 멤버변수 + 일반 멤버메소드 + 추상 메소드
		 	
		 	interface : 추상 메소드, 선언만 되어 있는 비어 있는 클래스
		 				메소드의 타입만이 설정되어 있다.
		 				다중 상속이 가능하다.
		 				장점 : 빠르게 클래스의 사양을 파악할 수 있다.
		 */
		
	//	MyInterface myint = new MyInterface();  불가능
		/*MyClass mycls = new MyClass();
		mycls.method();
		mycls.func();
		*/
		MyInterface myint = new MyClass();
		myint.method();
		myint.func();
	}
}
