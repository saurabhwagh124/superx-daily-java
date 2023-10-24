import java.util.Scanner;
class Demo{
	static  int printsum(int start,int end){
		int sum=0;
		for(int i=start;i<=end;i++){
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start");
		int start=sc.nextInt();
		System.out.println("Enter End");
		int end=sc.nextInt();
		int sum = printsum(start,end);
		System.out.println("The sum of digit in the given range is:"+sum);
	}
}
