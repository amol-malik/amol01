package javaProgram;

public class program5 {
	public static void main(String[] args) {
		
		int num=252;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count ++;
				break;
				
			}
			
		}
		
		if(count==0)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");
		}
	}

}
