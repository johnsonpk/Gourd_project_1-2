import java.util.Scanner;

public class Gourd02
{
	public static void main(String args[])
	{
		int[] line_current = new int[400];
		int sum_current = 0;
		int max = 0;
		String nextLine;
		String[] array_numbers = new String[400];
		Scanner scanner = new Scanner(System.in);


		nextLine = scanner.nextLine();

		array_numbers = nextLine.split(" ");

		for(int k = 0; k < 400; k ++)
		{
			line_current[k] = Integer.parseInt(array_numbers[k]);
		}
		
		for(int j = 0; j < 20; j ++)
		{
			for(int i = (j * 20); i < ((j * 20 + 20) - 4); i ++)
			{
				sum_current = line_current[i] + line_current[i+1] 
					+ line_current[i + 2] + line_current[i + 3];

				if(sum_current > max)
					max = sum_current;
			
			}
		}
		System.out.println(max);
	}
}
