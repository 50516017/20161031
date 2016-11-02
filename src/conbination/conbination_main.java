package conbination;

import java.util.Scanner;

public class conbination_main {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Input NUmber s>");
		int s=Integer.parseInt(scan.next());
		System.out.print("input r>");
		int r=Integer.parseInt(scan.next());
		conbination_lib clib = new conbination_lib();
		 System.out.println(s+"C"+r+"="+clib.getFactorial(s)/(clib.getFactorial(r)*clib.getFactorial(s-r)));

	}
}
