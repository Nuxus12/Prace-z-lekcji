import java.util.Scanner;

public class parzystosc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner (System.in);

		System.out.print("Podaj liczbe :");
		int liczba = scanner.nextInt();
		if ( liczba%2 == 0)
		{
			System.out.println("Liczba parzysta");
		}
		else
		{
			System.out.println("Liczba nie parzysta");
		}

	}
}