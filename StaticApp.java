class Foo {
	// static이 있는 것은 클래스에 소속, 없는 것은 인스턴스에 소속
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); // Error
	}
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // OK
	}
}
public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod(); // OK
//		Foo.instanceMethod(); // Error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1";  // static 값을 변경하면 모두 같이 변경된다.
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1"; // static이 없는 값을 변경하면 해당 인스턴스만 변경된다.
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
	}

}
