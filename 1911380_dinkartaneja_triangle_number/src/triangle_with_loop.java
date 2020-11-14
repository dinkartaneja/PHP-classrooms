import java.util.Scanner;
public class triangle_with_loop {
	//made by dinkartaneja 1911380 on 17 september
	public static void main(String[] args)

	{
	   int i,j,n;
	   System.out.print("Input number of rows : ");
	 //made by dinkartaneja 1911380 on 17 september
	 Scanner in = new Scanner(System.in);
			    n = in.nextInt();

	   for(i=1;i<=n;i++)
	   {
		for(j=1;j<=i;j++)
		  System.out.print(j);

	    System.out.println("");
	    }
	}
}
