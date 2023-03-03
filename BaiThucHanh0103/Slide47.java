import java.util.Scanner;

public class Slide47 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int z,y;
	int tong;
	do {
		System.out.println("Nhap vao cac so nguyen: ");
		z=sc.nextInt();
		y=sc.nextInt();
		 tong=z+y;
		}while(tong<100);
	System.out.println("Tong cac so vua nhap la: "+tong);
	
}
}
