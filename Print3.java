
class Print3 {
	public String delimiter = ""; // this�� ���⿡ �ִ� delimiter�� ����Ű�� �ȴ�.
	public Print3(String delimiter) { // Ŭ������ �̸��� �Ȱ��� �޼ҵ� = ������ | �����ڴ� ������Ÿ�� ���� x
		this.delimiter = delimiter; // this�� Ŭ������ �ν��Ͻ�ȭ �Ǿ��� �� ������ �ν��Ͻ��� ����Ŵ
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