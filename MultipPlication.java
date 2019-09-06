package javaPack;

import java.util.Scanner;

public class MultipPlication {
	int a,b,i,j;
	void test()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Value A");
		int a=Integer.parseInt(s.nextLine());
		System.out.println("enter Value B");
		int b=Integer.parseInt(s.nextLine());
		for (int i=a;i<=b;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
	public static void main(String[] args) {
		MultipPlication mp=new MultipPlication();
		mp.test();
	}
    }
