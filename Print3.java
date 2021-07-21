
class Print3 {
	public String delimiter = ""; // this는 여기에 있는 delimiter를 가리키게 된다.
	public Print3(String delimiter) { // 클래스와 이름이 똑같은 메소드 = 생성자 | 생성자는 데이터타입 지정 x
		this.delimiter = delimiter; // this는 클래스가 인스턴스화 되었을 때 생성한 인스턴스를 가리킴
	}
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}