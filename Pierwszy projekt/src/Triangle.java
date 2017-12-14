import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner ( System.in);
		System.out.print("Podaj a:");
		int a = scanner.nextInt();
		System.out.print("Podaj b:");
		int b = scanner.nextInt();
		System.out.print("Podaj c:");
		int c = scanner.nextInt();
		scanner.close ();
		if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a)
		{
			System.out.println("Da siê zbudowaæ trójk¹t");

		}
		else
		{
			System.out.println("Nie da siê zbudowaæ trójk¹ta");	
		}
	}

}
