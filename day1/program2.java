import java.util.Scanner;
class Demo{

	static void printpattern(int rows){
		
		int x=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x+ " ");
				x++;
				
			}
			x--;
			System.out.println();
		}
	}

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows=sc.nextInt();

		printpattern(rows);
	}
}


