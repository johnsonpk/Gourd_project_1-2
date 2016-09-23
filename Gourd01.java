import java.util.Scanner;

public class Gourd01
{
	
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

		System.out.println("-------------------------------");
		System.out.println("Leading Digit   Count         %");
		System.out.println("-------------------------------");
		
		for(int i = 0; i < 10; i++)
		{
			num = 11;
			nextLine = "";
			num -= (Integer.toString(leading_digit[i]).length() + Integer.toString(100 * leading_digit[i]/sum).length());
			

			for(int j = 0; j < num; j ++)
			{
				nextLine += " ";
			}
//			System.out.printf("Length %d:%d:%d\n",Integer.toString(leading_digit[i]).length(),Integer.toString(100 * leading_digit[i]/sum).length(),nextLine.length());
			System.out.printf("%d               %d%s%.2f%%\n",i, leading_digit[i],nextLine, (100 * leading_digit[i] / (double)sum));
		//	nextLine = StringRepair(num, sum, leading_digit, "");
/*
			nextLine = "";
			nextLine = nextLine.format("%d                    ,%d      %.2f%%", num, leading_digit[num], (leading_digit[num] / (double)sum));
			while((nextLine.indexOf(",") != 14))
			{
				nextLine = nextLine.substring(0,nextLine.indexOf(" ")) + nextLine.substring(nextLine.indexOf(" ") + 1);
			}
			nextLine = nextLine.replace(',', ' ');
*/
			
		
		}
		num = 8;
		nextLine = "";
		num -= Integer.toString(sum).length();

		for(int j = 0; j < num; j ++)
		{
			nextLine += " ";
		}
		System.out.printf("TOTAL           %d%s%.2f%%\n", sum, nextLine, (double)sum / sum * 100);

		System.out.println("===============================");

	}
}
