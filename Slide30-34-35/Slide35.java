import java.util.Scanner;
public class Slide35 {
	public static void main(String[] args) {
		int a,b,min;
		Scanner input = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
       a = input.nextInt();

        System.out.print("Nhap so thu hai: ");
        b = input.nextInt();

        min = (a < b) ? a : b;

        System.out.println("So nho nhat la " + min);
}
}
