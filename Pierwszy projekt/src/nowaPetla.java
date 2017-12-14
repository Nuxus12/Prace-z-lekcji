import java.util.Scanner;

public class nowaPetla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner (System.in);

		System.out.print("Podaj liczbe :");
		int liczba = scanner.nextInt();
		while (liczba > 1 )
		{
			liczba -=2 ;
		}
		if (liczba == 1)

		{
			System.out.println("Liczba nieparzysta");			
		}
		else
		{
			System.out.println("Liczba parzysta");
		}
	}

}
