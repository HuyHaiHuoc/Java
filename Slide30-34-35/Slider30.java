import java.util.Scanner;

public class Slider30 {
	public static void main(String[] args) {
		int n,tong,tam;
		tong=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so n: ");
		n=sc.nextInt();
		while(n<=0) {
			System.out.println("Nhap n lon hon 0: ");
			n=sc.nextInt();
		}
		while(n>0) {
			tam=n%10;
			tong=tong+tam;
			n=n/10;
		}
		System.out.println("Tong cac chu so cua n la: "+tong );
		
	}
}
