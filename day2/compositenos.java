import java.io.*;
class compositenos{

	static void composite(int x, int y){
		int a=x;
		int b=y;
		while(b>=a){
			int count=0;
			for(int i=1;i<=a;i++){
				if(a%i==0){
			
					count++;
				}
			}
			if(count>2){
				System.out.println(a);
			}
			a++;
		}

	}
	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Start and End nos.");
		compositenos.composite(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
	}
}
