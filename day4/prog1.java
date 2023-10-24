/* Print the following pattern
 
  A B C D
  # # # #
  A B C D
  # # # #
  A B C D
  Take rows as input from user
 */

import java.util.Scanner;
class Demo{

	static void printpattern(int rows,int column){

		char ch='A';

		for(int i=1;i<=rows;i++){
			//char ch=
			for(int j=1;j<=column;j++){
				if(i%2==0){
					System.out.print("#"+" ");
				}else{
					System.out.print(ch+" ");
					ch++;
				}
				
			}
			ch='A';
			System.out.println();
		}
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");
		int rows = sc.nextInt();

		System.out.println("Enter Column");
		int column=sc.nextInt();

		printpattern(rows,column);
	}
}

