package lcm_hcf;
import java.util.Scanner;
public class LCM_HCF {

	public static int lcmOfNumbers(int x, int y, int count) throws Exception{
	
		if(x<0 || y<0)
			throw new Exception("Input should be positive numbers!");
		
		else if(x==0 && y==0)
			throw new Exception("Input should be non zero numbers!");
		
		else if(x==0 || y==0)
			return 0;
		
		int lcm = 0;
		
		//multiplying until getting a multiple of bigger number as lcm
		if((x*count) % y == 0)
			return x*count;
		
		else{
			count++;
			lcm = lcmOfNumbers(x, y, count);
		}
		return lcm;
		
	}
	
	public static int hcfOfNumbers(int x, int y) throws Exception{
	
		if(x<0 || y<0)
			throw new Exception("Input should be positive numbers!");
		
		else if(x==0 && y==0)
			throw new Exception("Input should be non zero numbers!");
		
		else if(x==0)
			return y;
		
		else if(y==0)
			return x;
		
		int hcf=1;
		
		if(x%y == 0)
			return y;
		else
			hcf = hcfOfNumbers(y, x%y);
		
		return hcf;
		
	}
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter digit 1 :");
		int x = scan.nextInt();
		System.out.print("Enter digit 2 :");
		int y =scan.nextInt();
		
		int first = Math.max(x, y);
		int second = Math.min(x, y);
		
		int lcm = lcmOfNumbers(first, second, 1);
		System.out.println("LCM of the numbers are : "+lcm);
		
		int hcf = hcfOfNumbers(first,second);
		System.out.println("HCF of the numbers are : "+hcf);
		
		scan.close();
	}
}
