import java.util.Scanner;
class Demo{

	static int isstrongno(int num){
		int temp = num;
		int sum=0;

		while(num!=0){
			int fact=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum = sum+fact;
			num=num/10;
		}
		if(temp==sum){
			return 1;
		}
		else{
			return 0;
		}
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num=sc.nextInt();


		int Strongno = isstrongno(num);
		if(Strongno==0){
			System.out.println(num+ "is not strong number");
		}else{
			System.out.println(num+" is strong number");
		}

	}
}


