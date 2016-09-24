import java.util.Scanner;

public class Gourd02
{
	public static void main(String args[])
	{
		// Array to hold our 400 integers
		int[] line_current = new int[400];
		// Current sum of 4 consecutive integers on the same line
		int sum_current = 0;
		// Max sum we have encountered so far
		int max = 0;
		// String to read in our file
		String nextLine;
		// Array to hold our individual numbers before they are parsed to a string
		String[] array_numbers = new String[400];
		// Scanner to read from stdin
		Scanner scanner = new Scanner(System.in);


		
		nextLine = scanner.nextLine();

		array_numbers = nextLine.split(" ");

		for(int k = 0; k < 400; k ++)
		{
			// populate line_current array with integers
			line_current[k] = Integer.parseInt(array_numbers[k]);
		}
		
		// iterate through our line_current array, finding and setting max sum_current
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
		// Print out our max 
		System.out.println(max);
	}
}
