package dto;

// DTO -> Data Transfer object -> VO(Value Object)
public class StudentDto {
	private int number;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public StudentDto() {
		
	}

	public StudentDto(int number, String name, int kor, int eng, int math) {
		super();
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMaath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "DtoSt [number=" + number + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ "]";
	}
}
