## **1. 프로그래밍 언어의 역할**

1.1 사람과 컴퓨터의 의사소통

1.2 사람의 언어와 컴퓨터의 기계어를 연결해주는 역할

1.3 사람 -> 소스코드 -> 컴파일러 -> 기계어 -> 컴퓨터


## **2. 자바의 특징**

2.1 이식성이 높은 언어이다.

2.2 객체 지향 언어 - OOP(Object Oriented Programming)

2.2.1 상속, 캡슐화, 다형성 기능 지원

2.3 함수형식의 코딩 방식인 람다식을 지원한다.

2.4 메모리를 자동으로 관리한다.

2.5 다양한 애플리케이션 개발이 가능하다.(안드로이드 스튜디오)

2.6 멀티 스레드(Multi Thread) 구현 가능하다.

2.7 동적 로딩 (Dynamic Loading) 지원한다.

2.7.1 재사용성이 높고, 유지 보수가 용이하다.

2.8 오픈 소스 라이브러리가 많다.

## **3. 자바의 실행**

3.1 바이트 코드

3.1.1 자바 가상 기계에서 실행 가능한 바이너리 코드

3.1.2 클래스 파일에 저장

3.2 자바 가상 기계(Java Virtual Machine)

3.2.1 동일한 자바 실행 환경 제공

3.2.2 플랫폼에 종송적이다.

3.2.3 자바 가상 기계 개발 및 공급 (oracle, IBM 등)

3.3 컴파일러가 바로 바이트 코드한 후 링크 과정이 없다.

3.4 바이트 코드는 JVM에서만 실행 가능하다.

3.5 자바는 필요한 클래스들을 프로그램 실행 중에 동적으로 로딩이 된다.

## **4 .변수와 선언**

4.1 변수 - 값을 임의로 저장하기 위한 공간

4.2 변수 선언 - 변수의 타입에 변수 이름을 정하여 선언(ex.  **int**  i)

## **5. 기본 타입**

5.1 정수, 실수 ,문자, 논리 리터럴을 직접 저장하는 타입이다.

5.2 메모리는 byte로 형성 (8bit = 1byte)

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fua4eU%2Fbtrc6SBCbrK%2FPLLuhBfmd3jdGwxQg9YMo1%2Fimg.png">

## **6. 타입 변환**

6.1 자동 타입 변환 - 작은 크기 타입은 큰 크기 타입으로 자동으로 변환된다.

6.2 강제 타입 변환 - 프로그래머가 강제로 타입을 변환할 수 있다. -> byte a = (byte) n;

## **7. 작명의 규칙**

7.1 int a;!=int A; 대소문자를 구분한다.

7.2 int int; 예약어는 사용할 수 없다.

7.3 int 2i; 숫자가 맨 앞에 오면 안된다.  

7.4 int 123; 상수는 사용이 안된다.  

7.5 int _abc; 권장하지는 않는다.  

7.6 int -abc; 연산자는 사용할 수 없다.