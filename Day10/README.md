# Class(클래스)

### **Object Oriented Programming(객체지향)**

<img src = "https://blog.kakaocdn.net/dn/cB5fDX/btrdOX3OrLb/q8rNUIadxyLUb9PntUZxzK/img.png">


### **1. OOP(객체지향) 특성**

**1.1 은닉성(캡슐화)**  
- **변수를 외부에 노출하는 규칙**

**1.2 상속성**  
- **상위(super) 클래스에서 좋은 기능(메소드)등을 상속**  
**1.3 다형성 - 여러가지 형태**  
- **상속을 받은 후에 다양한 처리**  
  
**Encapsulation == 은닉성, 캡슐화**  

  

### **2. 접근 지정자**

  
**2.1 private : 개인적인**

- **특수한 경우를 제외하고 private이다.**

**2.2 public : 대중적인**

- **멤버 함수(메소드)는 90%이상 public이다.**

  
**2.3 protected : 상속에 관련한 처리**

  

**3.1 this**

- **자기 자신의 주소를 참조한다.**

- **Heap 영역의 주소이다.**

- **생성자에서 다른 생성자를 호출할 경우 사용한다.**

- **변수와 매개변수 구분한다.**


# Constructor(생성자)


### **1. Constructor의 특성**

**1.1 생성자**  
**1.2 초기화 함수(메소드)**
**1.3 클래스명과 같다.**  
**1.4 return 값이 없다.**  
**1.5 over load가 가능하다.**  
**1.6 class 생성 시 자동 호출된다.**  
**1.7 따로 호출이 불가능하다.**
**1.8 생략이 가능하다.**


### **# code**

- **MyClass()**
```
public MyClass() {	// 많이 사용
	System.out.println("MyClass MyClass()");
	number = 10;
	name = "빈칸";
	height = 100.0;
}
```

- **MyClass(char c)**
```
public MyClass(char c) {
	System.out.println("MyClass MyClass(char c))");
}
```

- **MyClass(int number, String name, double height)**
```
public MyClass(int number, String name, double height) { // 많이 사용
	System.out.println("MyClass MyClass(int number, String name, double height)");
	this.number = number;
	this.name = name;
	this.height = height;
}
```

- **init(int number, String name, double height)**
```
public void init(int number, String name, double height) {
	this.number = number;
	this.name = name;
	this.height = height;
}
```

- **MyClass(int i)**
```
public MyClass(int i) {
	this('A');	 // 맨 윗줄
		
	System.out.println("MyClass MyClass(int i)");
}
```


# DAO , DTO

### **1. DTO ( Data Transfer Object )**

**1.1 VO ( Value Object )**

**1.2 순수 데이터의 객체이다.**

**1.3 속성과 그 속성에 접근하기 위한 getter, setter 메소드만을 가진 클래스이다.**

  

### **2. DAO ( Data Access Object )**

**2.1 DB를 사용해 데이터를 조회하거나 조작하는 기능을 활용할 수 있다.**

**2.2 등록(CREATE), 수정(UPDATE), 조회(READ), 삭제(DELETE) 등의 CRUD 작업을 하는 클래스**

  

### **3. 학생정보 관리 프로그램**

**3.1 프로그램을 실행 하기 위해 초기 데이터 값을 인가한다.**

**3.2 삭제(DELETE), 수정(UPDATE)은 조회(READ)로부터 시작된다.**


- **등록(CREATE)**
```
public void Create() {	// 학생 정보 입력
	System.out.print("학생번호 = ");
	int number = sc.nextInt();

	System.out.print("학생이름 = ");
	String name = sc.next();

	System.out.print("국어 = ");
	int kor = sc.nextInt();

	System.out.print("영어 = ");
	int eng = sc.nextInt();

	System.out.print("수학 = ");
	int math = sc.nextInt();
        
	stArray[count] = new DtoSt(number, name, kor, eng, math);

	count++;
	System.out.println("count:" + count);
	System.out.println("추가 되었습니다");
}
```


- **삭제(DELETE)**
```
public void Delete() {	// 학생 정보 삭제
	System.out.print("삭제할 학생이름을 입력 >> ");
	String name = sc.next();

	// 검색
	int findIndex = -1;
	for(int i = 0;i < stArray.length; i++) {
		DtoSt dto = stArray[i];
		if(dto != null && name.equals(dto.getName())) {	// 데이터가 있고, 입력한 값과 같을 때
			findIndex = i;
			break;
		}			
	}

	// 삭제
	if(findIndex == -1) {
		System.out.println("학생명단에 없습니다");
	}
	else {
		DtoSt dto = stArray[findIndex];	
		dto.setNumber(0);				// 초기화
		dto.setName("");
		dto.setKor(0);
		dto.setEng(0);
		dto.setMath(0);

		System.out.println("학생 명단에서 삭제했습니다");
	}
}
```


- **조회(READ)**
```
public void Read() {	// 학생 정보 검색
	System.out.print("검색할 학생이름을 입력 >> ");
	String name = sc.next();
	// 검색
	int findIndex = -1;
	for(int i = 0;i < stArray.length; i++) {
		DtoSt dto = stArray[i];
		if(dto != null && name.equals(dto.getName())) {
			findIndex = i;
			break;
		}			
	}

	// 출력
	if(findIndex == -1) {
		System.out.println("학생명단에 없습니다");
	}
	else {
		DtoSt dto = stArray[findIndex];
		System.out.println(dto.toString());
	}
}
```


- **수정(UPDATE)**
```
public void Update() {	// 학생 정보 수정
	System.out.print("수정할 학생이름을 입력 >> ");
	String name = sc.next();

	// 검색
	int findIndex = -1;
	for(int i = 0;i < stArray.length; i++) {
		DtoSt dto = stArray[i];
		if(dto != null && name.equals(dto.getName())) {
			findIndex = i;
			break;
		}			
	}

	// 수정
	if(findIndex == -1) {
		System.out.println("학생명단에 없습니다");
	}
	else {		
		// 입력
		System.out.println("수정할 데이터를 입력해 주십시오");
		System.out.print("국어 = ");
		int kor = sc.nextInt();

		System.out.print("영어 = ");
		int eng = sc.nextInt();

		System.out.print("수학 = ");
		int math = sc.nextInt();

		DtoSt dto = stArray[findIndex];
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);

		System.out.println("학생 데이터를 수정했습니다"); 			
	}
}
```


- **전체조회(ALLPRINT)**
```
public void allprint() {
	for (int i = 0; i < stArray.length; i++) {
		DtoSt dto = stArray[i];
		if(dto != null && dto.getName().equals("") == false) {
			System.out.println(dto.toString());
		}
	}
}
```
