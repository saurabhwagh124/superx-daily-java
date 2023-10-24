import java.util.Scanner;
class Demo{

	static void oddnumbers(int start,int End){

		for(int i=start;i<=End;i++){
			if(i%2!=0){
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start");
		int start=sc.nextInt();

		System.out.println("Enter End");
		int End=sc.nextInt();

		oddnumbers(start,End);
	}
}

