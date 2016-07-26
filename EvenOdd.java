import java.util.Scanner;


public class EvenOdd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num;
	System.out.println("Enter the number to check Even or Odd");
	num=s.nextInt();
	if(num%2==0)
	System.out.println("Even");
	else
		System.out.println("Odd");
}
}
