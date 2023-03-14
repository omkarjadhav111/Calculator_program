import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number");
	   int num1 = sc.nextInt();
	   System.out.println("Enter the second number");
	   int num2 = sc.nextInt();
	   System.out.println("select symbol(+,-,*,/");
	   String sym = sc.next();
	   int res;
	   switch(sym)
	   {
	       case"+":res=num1+num2;
	       System.out.println("Addition is "+res);
	       break;
	   
	       case"-":res=num1-num2;
	       System.out.println("subtraction is "+res);
	       break;
	       case"*":res=num1*num2;
	       System.out.println("multipication is "+res);
	       break;
	       case"/":res=num1/num2;
	       System.out.println("division is "+res);
	       break;
	       default:
	       System.out.println("Invalid symbol");
	       break;
	       
	   }
		
	}
}
