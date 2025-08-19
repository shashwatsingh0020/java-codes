
public class inherit {
	public static void main(String[] args) {
		B aa=new B();
		aa.add();
		aa.display();
		
	}

}
class A{
	int a=40;
	int b=20;

	
void add() {
	System.out.println("addition="+(a+b));
}
	}

class B extends A{
	int c=50;
	void display() {
		System.out.println("addition="+(a+b+c));
	}
}

