import java.util.Scanner;

public class Bai6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Nhap vao mot so nguyen duong: ");
	n=sc.nextInt();
	if(n==0 || n==1) {
		System.out.println(n+"=1");
	}
	int giaithua=1;
	for(int i=1;i<=n;i++) {
		giaithua*=i;
	}
	
	System.out.println(+n+"!="+giaithua);
	
	
}
}
