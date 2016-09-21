import java.util.Scanner;

// I pretty much just need to start over on this. It got out of hand really quickly
// :|

public class Gourd01
{
	public static String StringRepair(int num, int sum, int[] leading_digit, String nextLine)
	{
		if(nextLine == "")
			nextLine = nextLine.format("%d                    ,%d        %.2f%%", num, leading_digit[num], (leading_digit[num] / (double)sum));
		if(nextLine.indexOf(",") > -1)
		{
			while((nextLine.indexOf(",") != 14))
			{
				nextLine = nextLine.substring(0,nextLine.indexOf(" ")) + nextLine.substring(nextLine.indexOf(" ") + 1);
			}
			nextLine = nextLine.replace(',', ' ');
		}

		while((nextLine.indexOf("%") != 31 ) && (nextLine.length() < 70))
		{
			nextLine =  nextLine.substring(0,nextLine.length() - 6) + " " + nextLine.substring(nextLine.length() - 6, nextLine.length());
		}
		return nextLine;
	}
	public static void main(String args[])
	{
		// Instantiate variables
		int[] leading_digit = new int[10];
		int sum = 0;
		int num;
		String nextLine;
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNextLine())
		{
			nextLine = scanner.nextLine();
			
			num = Integer.parseInt(nextLine.substring(0,1));

			leading_digit[num] += 1;
		} 

		for(int i: leading_digit)
		{
			sum += i;
		}

		System.out.println("--------------------------------");
		System.out.println("Leading Digit  Count           %");
		System.out.println("--------------------------------");
		for(num = 0; num < 10; num ++)
		{
			nextLine = StringRepair(num, sum, leading_digit, "");
/*
			nextLine = "";
			nextLine = nextLine.format("%d                    ,%d      %.2f%%", num, leading_digit[num], (leading_digit[num] / (double)sum));
			while((nextLine.indexOf(",") != 14))
			{
				nextLine = nextLine.substring(0,nextLine.indexOf(" ")) + nextLine.substring(nextLine.indexOf(" ") + 1);
			}
			nextLine = nextLine.replace(',', ' ');
*/
			
			System.out.println(nextLine);
		
		}
		String s1 = ""; 
		s1 = s1.format("TOTAL         %d        100%%", sum, );
		s1 = StringRepair(0,0,leading_digit,s1);
		System.out.printf("%s\n", s1);
		System.out.println("================================");

	}
}
