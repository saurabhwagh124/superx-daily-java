import java.util.Scanner;
class Demo{
	static int factorial(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start");
		int start=sc.nextInt();
		System.out.println("Enter End");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
			int fact=factorial(i);
			System.out.println("The factorial of digits from 1 to 10 are" +fact);
		}
	}
}
