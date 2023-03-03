import java.util.Scanner;

public class Slide40 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	do {
	System.out.println("Nhap vao so thu: ");
	n=sc.nextInt();
	}while(n<1 || n>7);
	switch(n) {
	case 1: {
		System.out.println("Thu Hai");
		break;
	}
	case 2: {
		System.out.println("Thu Ba");
		break;
	}
	case 3: {
		System.out.println("Thu Tu");
		break;
	}case 4: {
		System.out.println("Thu Nam");
		break;
	}
	case 5: {
		System.out.println("Thu Sau");
		break;
	}
	case 6: {
		System.out.println("Thu Bay");
		break;
	}
	case 7: {
		System.out.println("Chu Nhat");
		break;
	}
	
	}
	
	
	
}
}
