package javaProgram;

public class program3 {
	
	public static void main(String[] args) {
		
		int star=1;
		int space=5;
		for (int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			space--;
			star=star+2;
			System.out.println();
		}
	
	for (int i=1;i<=6;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print(" ");
		}
		for (int k=1;k<=space;k++)
		{
			System.out.print("*");
		}
		space++;
		star=star-2;
		System.out.println();
	}
}

}
