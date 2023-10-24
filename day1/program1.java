import java.util.Scanner;
class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=i;j<=rows;j++){
				System.out.print(j+ " ");
			}
			for(int j=2;j<=i;j++){
				int a=j+rows-1;
				System.out.print(a+ " ");
			}
			System.out.println();
		}
	}
}

