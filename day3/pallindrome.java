import java.io.*;
class ispallindrome{

	static void ispalli(int x){
	
		int y=x;
		int a=0;
		while(y>0){
		
			a=a*10;
			int w=y%10;
			a=a+w;
			y=y/10;
		}
		if(a==x){
			System.out.println("Is pallindrome: "+a);
		}else{
			System.out.println("Is not pallindrome...");
		}
	}
	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number sequence: ");
		ispallindrome.ispalli(Integer.parseInt(br.readLine()));

	}
}
