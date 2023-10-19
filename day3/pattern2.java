import java.io.*;
class numberpat{

	static void numpat(int n){
	
		int m=n;
		for(int i=1;i<=n;i++){
		
			int k=i;
			for(int j=1;j<=i;j++){
			
				System.out.print(k+" ");
					k--;
			}
			System.out.println();
		}
	}
	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for pattern: ");
		numberpat.numpat(Integer.parseInt(br.readLine()));

	}
}
