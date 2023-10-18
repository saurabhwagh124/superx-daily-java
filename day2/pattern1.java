import java.io.*;
class patalpha{

		static void alpha(char n){
	
			for(int i=0;i<4;i++){
				char z=n;
				for(int j=0;j<4;j++){
	
					System.out.print(z+" ");
					z++;
				}
				System.out.println();
				n++;
			}
		}
	public static void main(String[] sau)throws IOException{
	
		System.out.println("Enter the charachter: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		patalpha.alpha((char)br.read());
	}
	
}
