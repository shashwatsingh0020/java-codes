
public class ops {
	public static void main(String[] args) {
		xyz x=new xyz();
		x.add(5, 23, 12);
		
	}
	
}

class xyz{
	void add(int a,int b,int c) {
		
		if((a+b+c)>45) {
			System.out.println(a+b+c);
		}
		else
			System.out.println(a-b-c);
		
	}
}
