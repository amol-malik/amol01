package javaProgram;

public class program6 {
	public static void main(String[] args) {
		 
		int num=113;
		int count=0;
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			count ++;
			break;
			}
		}
	
		if(count==0)
		{
			System.out.println("is prime");
		}
		else
			System.out.println("not prime");
	}

}
