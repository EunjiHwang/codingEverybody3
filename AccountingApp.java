class Accounting {
	public static double valueOfSupply; // 공급가
	public static double vatRate = 0.1; // 부가가치세율
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
}
public class AccountingApp {
	
	public static void main(String[] args) {
		
		// double vat = valueOfSupply*vatRate; // 부가세 = 공급가 * 부가가치세
		// double vat = getVAT();
		// double total = valueOfSupply + vat; // 합계 = 공급가 + 부가세
		// double total = getTotal();
		Accounting.valueOfSupply = 10000.0;
		System.out.println("Value of supply : "+ Accounting.valueOfSupply); // 공급가
		System.out.println("VAT : "+ Accounting.getVAT()); // 부가세
		System.out.println("Total : "+ Accounting.getTotal()); // 합계
	}

}
