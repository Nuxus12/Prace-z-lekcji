package delta;

import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();

		s.close();

		if (a == 0)
		{
			if (b != 0)
			{
				double x = -c/b		;
				System.out.println("x wynosi"+x);
			}
			if (b == 0)
			{
				if (c==0)
				{
					System.out.println("Nieskoñczenie wiele rozwi¹zañ");
				}
				if(c != 0)
				{
					System.out.println("Brak rozwi¹zañ");
				}

			}

		}
		if (a != 0)
		{
			double delta= b*b-4*a*c;
			if (delta <0)
			{
				System.out.println("Brak rozwi¹zañ w ciele R");
			}
			if (delta >= 0)
			{
				double x1 = (-b-Math.sqrt(delta)) / 2*a; 
				double x2 =(-b+Math.sqrt(delta)) / 2*a;	
				System.out.println("x1=" +x1 + "x2="+x2);
			}
		}


	}

}
