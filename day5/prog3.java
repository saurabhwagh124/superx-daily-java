import java.util.Scanner;
class Demo{

	static void printpattern(int rows){

		int x=1;
		int y=2;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2!=0){
					System.out.print(x+" ");
					x=x+2;
				}else{

					System.out.print(y+" ");
					y=y+2;
				}
			}
			System.out.println();
		}
	}




	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");
		int rows = sc.nextInt();

		printpattern(rows);
	}
}


