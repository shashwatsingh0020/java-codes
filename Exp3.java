import java.util.Scanner;

public class Exp3 {
	public static void main(String[] args) {
		xyz xx=new xyz();
		xx.even();	
		
	}
}
 class xyz{
	public void even() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("1");
			
		}
		else {
			System.out.println("0");
			
		}
	}
}
