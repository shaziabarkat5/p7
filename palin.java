import java.util.*;
public class palin {

	public static void main(String[] args) {
		int s=0,r,a1,a2=0;
		
		System.out.println("enter a no :");
		Scanner a = new Scanner(System.in);
		a1 = a.nextInt();
		a2=a1;
		a.close();
		while(a1!=0)
		{
			r = a1%10;
			
			a1 = a1/ 10;
			s = s*10+r;
		}
		if(a2==s)
		{   
			System.out.println("palindrome ");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}

}
