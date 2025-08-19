
public class divison {
	public static void main(String[] args) {
		int i,c1=0,c2=0,c3=0;
		for(i=1;i<=50;i++)
		{
			if (i%3==0) {
				c1++;
				}
			
			 if(i%4==0) 
			{
				c2++;}
			
			
			
			if(i%5==0)
			{c3++;}
		    
					
		    
	  }
		System.out.println("no. divided by 5 is "+c3);
		System.out.println("no. divided by 4 is "+c2);
		System.out.println("no. divided by 3 is "+c1);
  }
}
