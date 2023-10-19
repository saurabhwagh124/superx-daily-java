import java.io.*;
class checkreverse{

	static void checkrev(int x, int y){
	
		int start=x;
		int end=y;
		for(int i=x;i<=y;i++){
		
			int q=0;
			int a=i;
			while(a>0){
			
				q=q*10;
				int w=a%10;
				q=q+w;
				a=a/10;
			}
			System.out.println("Reverse is: "+q);


		}
	}
	public static void main(String[] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the start and end numbers to get reverse: ");
		checkreverse.checkrev(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
	}
}
