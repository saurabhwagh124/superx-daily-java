import java.util.Scanner;
class Stringin{

	static int sizecount(String str){

		char arr []=str.toCharArray();
		int count=0;

		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String str=sc.nextLine();

		int count =sizecount(str);
		System.out.println("The size of given string is:" +count);
	}
}

