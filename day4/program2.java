import java.util.Scanner;
class Demo{
	static void printpattern(int rows){
        	for (int i = 1; i <= rows; i++){
			
			for (int j = i; j>=1; j--){
				System.out.print((char)(j+64)+" ");
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
