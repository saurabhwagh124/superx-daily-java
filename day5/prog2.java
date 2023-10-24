
import java.util.Scanner;
class Demo{

	static void printpattern(int rows){

		

		for(int i=1;i<=rows;i++){

			char ch='a';
			char ch1='A';

			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch1+ " ");
					ch1++;
				}else{
					System.out.print(ch+ " ");
					ch++;
				}
		
			}
			System.out.println();
		}
	}

			


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");
		int rows=sc.nextInt();

		printpattern(rows);
	}
}

