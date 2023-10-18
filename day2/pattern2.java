import java.io.*;
class rowmultiply{

	static void rowpattern(int n){
		
		for(int i=1;i<=n;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the row size:");
		rowmultiply.rowpattern(Integer.parseInt(br.readLine()));
	}

}
