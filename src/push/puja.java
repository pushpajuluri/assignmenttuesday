package push;

import java.util.Scanner;

public class puja {
	public void show(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your age");
	int age = sc.nextInt();
	System.out.println("enter your country");
	String cname=sc.next();
	if(age>18 && cname ==("india"))
		System.out.println("u r eligible");
	else
		System.out.println("u r not eligible");
	}
	public static void main(String[] args) {
		puja p = new puja();
		p.show();
		
		

	}

}
