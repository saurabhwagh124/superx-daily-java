import java.util.Scanner;
class Demo{

	static int factorials(int num){

		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num=sc.nextInt();

		int factorial= factorials(num);

		System.out.println(factorial);
	}
}


