import java.util.Scanner;

class TOH {
	public static void main(String[] args) {
		int numberOfDisks;
		Scanner scanner=new Scanner(System.in);
		System.out.println("\nEnter the number of disks: ");
		numberOfDisks=scanner.nextInt();
		transfer(numberOfDisks,'S','D','T');
	}

	public static void transfer(int n,char from,char to,char temp) {
		if(n==0) 
			return;
		transfer(n-1,from,temp,to);
		System.out.println(String.format("Moving disk %d from %c to %c",n,from,to));
		transfer(n-1,temp,to,from);
	}
}
	
