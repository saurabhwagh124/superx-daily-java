import java.util.Scanner;
class Demo{

	static String toggle(String str){

		char arr[]=str.toCharArray();

		for(int i=0;i<arr.length;i++){
			char ch=arr[i];
			if(Character.isUpperCase(ch)){
				arr[i]=Character.toLowerCase(ch);
			}else{
				arr[i]=Character.toUpperCase(ch);
			}
		}
		return new String(arr);
	}


	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter String");
		String str = sc.nextLine();

		String str1 = toggle(str);

		System.out.println("Toggle string is"+str1);
	}
}

