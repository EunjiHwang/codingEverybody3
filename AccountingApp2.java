class Accounting {
	public double valueOfSupply; // 공급가
	public static double vatRate = 0.1; // 부가가치세율
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	public double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}
public class AccountingApp2 {
	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0);
		
		Accounting a2 = new Accounting(20000.0);
		
		System.out.println("Value of supply : "+ a1.valueOfSupply); // 공급가
		System.out.println("Value of supply : "+ a2.valueOfSupply); // 공급가
		
		System.out.println("VAT : "+ a1.getVAT()); // 부가세
		System.out.println("VAT : "+ a2.getVAT()); // 부가세
		
		System.out.println("Total : "+ a1.getTotal()); // 합계
		System.out.println("Total : "+ a2.getTotal()); // 합계
	}

}
