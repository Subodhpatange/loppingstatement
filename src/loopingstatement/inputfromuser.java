package loopingstatement;

import java.util.Scanner;

public class inputfromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter first no.");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println(a);
 
System.out.println("Enter second no.");
Scanner d=new Scanner(System.in);
int b=d.nextInt();
System.out.println(b);

System.out.println("enter third no.");
Scanner t=new Scanner(System.in);
int c=t.nextInt();
System.out.println(c);

int e=a+b+c;
System.out.println(e);

	}

}
