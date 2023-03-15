import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tong=0;
		int n;
		while(tong <=100) {
			System.out.println("Nhap vao so luong so nguyen: ");
			n=sc.nextInt();
			int a[]=new int [n];
			for(int i=0;i<a.length;i++) {
				System.out.print("a["+i+"]=");
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length;i++) {
				tong+=a[i];
			}
			
		}
		System.out.print("Tong cac so nguyen vua nhap la: "+tong);

	}

}
