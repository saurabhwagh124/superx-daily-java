
import java.util.Scanner;
class Demo{

	static void Evenodd(int num){

		if(num%2==0){
			System.out.println(num+ "is an even number");
		}else{
			System.out.println(num+ "is an odd number");
		}
	}


	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();

		Evenodd(num);
	}
}

