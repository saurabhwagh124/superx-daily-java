import java.io.*;
class reversepat{

	static void revpat(int n){
	
		char a='A';
		for(int i=1;i<=n;i++){
		
			char b = (char)(a+n-1);
			char c = a;
			for(int j=1;j<=n;j++){
			
				if(i%2==0){
				
					System.out.print(b+" ");
					b--;
				}
				else{
				
					System.out.print(c+" ");
					c++;
				}
			}
			System.out.println();
		}
	}

	
	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of NxN pattern:");
		reversepat.revpat(Integer.parseInt(br.readLine()));

	}
}
