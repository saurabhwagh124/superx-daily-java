import java.io.*;
class checkstr{

	static void strcheck(String str){
	
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++){
		
			for (int j=32;j<=64;j++){
			
				if(arr[i]==j){
				
					System.out.println("String contains charachter other than letters"+arr[i]);
				}
			}
			
			for (int j=91;j<=96;j++){
			
				if(arr[i]==j){
				
					System.out.println("String contains charachter other than letters"+arr[i]);
				}
			}
		}
	}
	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String: ");
		checkstr.strcheck(br.readLine());
	}
}
