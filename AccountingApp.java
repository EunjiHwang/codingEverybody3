class Accounting {
	public static double valueOfSupply; // ���ް�
	public static double vatRate = 0.1; // �ΰ���ġ����
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
}
public class AccountingApp {
	
	public static void main(String[] args) {
		
		// double vat = valueOfSupply*vatRate; // �ΰ��� = ���ް� * �ΰ���ġ��
		// double vat = getVAT();
		// double total = valueOfSupply + vat; // �հ� = ���ް� + �ΰ���
		// double total = getTotal();
		Accounting.valueOfSupply = 10000.0;
		System.out.println("Value of supply : "+ Accounting.valueOfSupply); // ���ް�
		System.out.println("VAT : "+ Accounting.getVAT()); // �ΰ���
		System.out.println("Total : "+ Accounting.getTotal()); // �հ�
	}

}
