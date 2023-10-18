import java.io.*;
class vowelout{

	static void vowel(String a){
	
		int count=0;
		char arr[] = a.toCharArray();
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]=='a'){
				count++;
			}
			else if(arr[i]=='e'){
				count++;
			}
			else if(arr[i]=='i'){
				count++;
			}
			else if(arr[i]=='o'){
				count++;
			}
			else if(arr[i]=='u'){
				count++;
			}
		}
		System.out.println("The count of vowels: "+ count);


	}
	public static void main(String[]sau)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String: ");
		vowelout.vowel(br.readLine());

	}
}
