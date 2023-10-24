
import java.util.Scanner;
class Demo{

	static int Occurence(String str, char ch){

		int occurence=0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				occurence++;
			}
		}
		return occurence;
	}



	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String str=sc.nextLine();

		System.out.println("Enter char to search occurence");
		char ch = sc.next().charAt(0);

		str=str.toLowerCase();



		int occurence=Occurence(str,ch);

		System.out.println(occurence);
	}
}

