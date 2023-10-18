import java.io.*;
class isprime{

	static void check(int n){
	
		int a = n;
		int count=0;
		for(int i=1;i<=a;i++){
		
			if(a%i==0)
				count++;
		}
		if(count>2){
		
			System.out.println(n +" is a composite number");
		}
		else
			System.out.println(n+" is a prime number");
	}

	public static void main(String [] sau)throws IOException{
	
		System.out.println("Enter the number to check: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		isprime.check(Integer.parseInt(br.readLine()));
	}
}
