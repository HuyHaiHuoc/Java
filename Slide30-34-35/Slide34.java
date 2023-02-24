import java.util.Scanner;
public class Slide34 {
			
		 public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Nhap gia tri a: ");
		        double a = input.nextDouble();

		        System.out.print("Nhap gia tri b: ");
		        double b = input.nextDouble();

		        System.out.print("Nhap gia tri c: ");
		        double c = input.nextDouble();

		        double delta = Math.pow(b, 2) - 4 * a * c;

		        if (delta < 0) {
		            System.out.println("Phuong trinh vo nghiem");
		        } else if (delta == 0) {
		            double x = -b / (2 * a);
		            System.out.println("Phuong trinh co nghiem kep x = " + x);
		        } else {
		            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		            System.out.println("Phuong trinh co hai nghiem phan biet:  ");
		            System.out.println("x1 = " + x1);
		            System.out.println("x2 = " + x2);
		        }
}
}

